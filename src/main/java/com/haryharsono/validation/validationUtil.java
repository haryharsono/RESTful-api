package com.haryharsono.validation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validator;
import java.util.Set;

@Component
public class validationUtil {

    @Autowired
    Validator validator;

    public void validate(Object object){
         Set<ConstraintViolation<Object>> result=validator.validate(object);
         if(result.size() == 0){
             throw new ConstraintViolationException(result);
         }

    }


}
