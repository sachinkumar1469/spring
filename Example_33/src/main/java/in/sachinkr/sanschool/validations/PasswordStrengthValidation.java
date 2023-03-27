package in.sachinkr.sanschool.validations;

import in.sachinkr.sanschool.annotations.PasswordValidator;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class PasswordStrengthValidation implements ConstraintValidator<PasswordValidator,String> {

    List<String> weakPasswords;


    @Override
    public void initialize(PasswordValidator constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
        weakPasswords = Arrays.asList("qwerty","12345","password");
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return (s != null && !weakPasswords.contains(s));
    }
}
