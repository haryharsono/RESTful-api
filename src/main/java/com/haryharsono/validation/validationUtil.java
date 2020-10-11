package com.haryharsono.validation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.validation.Validator;

@Component
public class validationUtil {

    @Autowired
    Validator validator;

}
