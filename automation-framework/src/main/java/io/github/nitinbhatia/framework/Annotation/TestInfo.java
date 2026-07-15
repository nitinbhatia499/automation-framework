package io.github.nitinbhatia.framework.Annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TestInfo {
    String author() default "Unknown";
    String createdOn() default "";
}
