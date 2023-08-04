package com.cydeo.streotype_annotation.monitorfactory;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonyMonitor extends Monitor{
    public SonyMonitor(String model, String manufacturer, int size) {
        super("25 inch beast", "Sony", 25);
    }

    @Override
    public void drawPixelAt() {
        System.out.println("Drawing pixel with Sony");
    }
}
