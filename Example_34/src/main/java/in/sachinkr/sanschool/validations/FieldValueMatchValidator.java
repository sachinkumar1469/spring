package in.sachinkr.sanschool.validations;

import in.sachinkr.sanschool.annotations.FieldValueMatch;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.BeanWrapperImpl;

public class FieldValueMatchValidator implements ConstraintValidator<FieldValueMatch, Object> {

    private String field;

    private String fieldMatch;
    @Override
    public void initialize(FieldValueMatch constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
        this.field = constraintAnnotation.field();
        this.fieldMatch = constraintAnnotation.fieldMatch();
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {

        Object fieldValue = new BeanWrapperImpl(o)
                .getPropertyValue(field);

        Object field2Value = new BeanWrapperImpl(o)
                .getPropertyValue(fieldMatch);
        if(fieldValue != null){
            if(fieldValue.toString().startsWith("$2a")){
                return true;
            } else {
                return fieldValue.equals(field2Value);
            }
        } else {
            return field2Value == null;
        }
    }
}
