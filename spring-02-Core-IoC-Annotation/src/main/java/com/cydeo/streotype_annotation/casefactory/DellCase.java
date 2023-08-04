package com.cydeo.streotype_annotation.casefactory;

import org.springframework.stereotype.Component;

@Component
public class DellCase extends Case{

    public DellCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer, powerSupply);
    }

    @Override
    public void pressPowerButton() {

    }
}
