package com.exp;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by krishansharma on 06/10/16.
 */

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface Lazy {
}
