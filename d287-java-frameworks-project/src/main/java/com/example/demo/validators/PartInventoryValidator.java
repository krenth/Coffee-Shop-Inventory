package com.example.demo.validators;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.service.PartService;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PartInventoryValidator implements ConstraintValidator <ValidPartInventory, Part> {
    @Autowired
    private ApplicationContext context;
    public static  ApplicationContext myContext;
    @Override
    public void initialize(ValidPartInventory constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);

    }

    @Override
    public boolean isValid (Part part, ConstraintValidatorContext constraintValidatorContext) {
        if(context==null) return true;
        if(context!=null)myContext=context;
        PartService repo = myContext.getBean(PartService.class);

        if (part.getId() != 0) {
            if (part.getInv() < part.getMinInventory() || part.getInv() > part.getMaxInventory()) {
                    return false;
                }

            return true;
        } else {
            return true;
        }
    }

}
