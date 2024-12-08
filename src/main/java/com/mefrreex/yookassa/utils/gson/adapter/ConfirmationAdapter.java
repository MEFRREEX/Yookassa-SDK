package com.mefrreex.yookassa.utils.gson.adapter;

import com.google.gson.*;
import com.mefrreex.yookassa.api.model.confirmation.Confirmation;
import com.mefrreex.yookassa.api.model.confirmation.ConfirmationType;
import com.mefrreex.yookassa.impl.model.confirmation.*;

import java.lang.reflect.Type;

public class ConfirmationAdapter implements JsonDeserializer<Confirmation> {

    @Override
    public Confirmation deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        ConfirmationType confirmationType = ConfirmationType.getByName(jsonObject.get("type").getAsString());

        return switch (confirmationType) {
            case EMBEDDED -> context.deserialize(json, ConfirmationEmbeddedImpl.class);
            case EXTERNAL -> context.deserialize(json, ConfirmationExternalImpl.class);
            case MOBILE_APPLICATION -> context.deserialize(json, ConfirmationMobileApplicationImpl.class);
            case QR -> context.deserialize(json, ConfirmationQrImpl.class);
            case REDIRECT -> context.deserialize(json, ConfirmationRedirectImpl.class);
        };
    }
}
