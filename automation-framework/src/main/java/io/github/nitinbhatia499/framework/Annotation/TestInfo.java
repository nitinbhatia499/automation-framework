package io.github.nitinbhatia499.framework.Annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TestInfo {
    String author() default "Unknown";
    String createdOn() default "";
}
