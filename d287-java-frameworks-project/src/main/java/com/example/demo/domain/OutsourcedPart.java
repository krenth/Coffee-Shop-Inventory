package com.example.demo.domain;

import com.example.demo.validators.ValidPartInventory;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 *
 *
 *
 */
@Entity
@DiscriminatorValue("2")
@ValidPartInventory
public class OutsourcedPart extends Part{
String companyName;

    public OutsourcedPart() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
