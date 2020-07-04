package com.autentia.aacebes.envproperties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class IndividualProperties {
    @Value("${my.property.s:No existo}")
    private String innerS;

    @Value("${my.property.x.i}")
    private int innerI;

    @Value("${my.property.x.b}")
    private boolean innerB;

    @Value("${my.property.numbersArray}")
    private List<Integer> numbersArray;

    @Value("#{${my.property.mapInLine}}")
    private Map<String, Object> map;

    public void showMyself(){
        System.out.println("-----------Individual Properties with @Value-----------");
        System.out.println(String.format("My properties are:%n\t s=%s%n\t x.i=%d%n\t x.b=%b%n\t numbersArray=%s%n\t mapInLine=%s", innerS, innerI, innerB, numbersArray, map));
    }
}
