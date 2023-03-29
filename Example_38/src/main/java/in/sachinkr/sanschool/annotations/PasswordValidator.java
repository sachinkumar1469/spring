package in.sachinkr.sanschool.annotations;


import in.sachinkr.sanschool.validations.PasswordStrengthValidation;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = PasswordStrengthValidation.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordValidator {

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    String message() default "Password strength is not good.";
}
