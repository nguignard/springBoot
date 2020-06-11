package com.mySite.appli1.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.mySite.appli1.model.User;

public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> cls) {
	return User.class.equals(cls);
    }

    @Override
    public void validate(Object obj, Errors e) {
	ValidationUtils.rejectIfEmptyOrWhitespace(e, "login", "login.empty", "Fill the name please");
    }


}
