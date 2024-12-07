package com.mefrreex.yookassa.api.model.payment;

import com.google.gson.annotations.SerializedName;

public enum PaymentStatus {
    @SerializedName("pending")
    PENDING,
    @SerializedName("waiting_for_capture")
    WAITING_FOR_CAPTURE,
    @SerializedName("succeeded")
    SUCCEEDED,
    @SerializedName("canceled")
    CANCELED
}
