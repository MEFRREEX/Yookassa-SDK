package com.mefrreex.yookassa.utils.gson.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Implementation {
    Class<?> value();
}
