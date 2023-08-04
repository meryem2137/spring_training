package com.cydeo.streotype_annotation;

import com.cydeo.streotype_annotation.config.PcConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext(PcConfig.class)
    }
}
