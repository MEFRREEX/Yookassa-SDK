package com.mefrreex.yookassa.exception;

import lombok.Getter;

@Getter
public class YookassaApiException extends YookassaClientException {
    private final String type;
    private final String id;
    private final String code;
    private final String description;
    private final String parameter;
    private final String endpoint;

    public YookassaApiException(String type, String id, String code, String description, String parameter, String endpoint) {
        super(String.format(
                "Yookassa API Error: (type=%s, id=%s, code=%s, description=%s, parameter=%s, endpoint=%s)",
                type, id, code, description, parameter, endpoint
        ));
        this.type = type;
        this.id = id;
        this.code = code;
        this.description = description;
        this.parameter = parameter;
        this.endpoint = endpoint;
    }
}
