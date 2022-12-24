package com.johanvonelectrum.yaum.settings;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Rule {

    enum RuleSide {
        BOTH,
        SERVER,
        CLIENT
    }

    String[] categories();

    String[] options() default {};

    boolean strict() default false;

    Class<? extends Validator>[] validators() default {};

    RuleSide side() default RuleSide.BOTH;

}
