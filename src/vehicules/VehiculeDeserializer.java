package vehicules;

import com.google.gson.*;

import java.lang.reflect.Type;

public class VehiculeDeserializer implements JsonDeserializer<Vehicule> {

    private static final String CLASS_PROPERTY_NAME = "type";

    @Override
    public Vehicule deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        String type = jsonObject.get(CLASS_PROPERTY_NAME).getAsString();

        // Désérialisation basée sur le type
        try {
            Class<?> clazz = Class.forName("vehicules." + type);
            return context.deserialize(json, clazz);
        } catch (ClassNotFoundException e) {
            throw new JsonParseException("Classe non trouvée: " + type, e);
        }
    }

}
