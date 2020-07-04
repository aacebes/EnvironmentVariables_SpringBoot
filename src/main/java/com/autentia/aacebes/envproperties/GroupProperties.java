package com.autentia.aacebes.envproperties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.*;

@ConfigurationProperties(prefix = "my.property")
public class GroupProperties{
    private Object s;
    private MyInnerClass x;
    private Collection<Integer> numbersArray;
    private List<MyInnerClass> complexList;
    private Map<String, Object> mapInYaml;

    public GroupProperties(){
        // Dentro del constructor podemos especificar los valores por defecto de cada atributo si no existe su propiedad.
        s = "No existo en el fichero";
        x = null;
        //numbersArray = Collections.emptyList();
        complexList = Collections.emptyList();
        mapInYaml = Map.of();
    }

    private static class MyInnerClass {
        private int i;
        private boolean b;

        public int getI(){ return i; }
        public void setI(final int i){ this.i = i; }

        public boolean isB(){ return b;}
        public void setB(final boolean b){ this.b = b; }
    }

    public Object getS(){ return s; }
    public void setS(final Object s){ this.s = s; }

    public void setX(final MyInnerClass x){ this.x = x; }
    public MyInnerClass getX(){ return x; }

    public Collection<Integer> getNumbersArray() { return numbersArray; }
    public void setNumbersArray(Collection<Integer> numbersArray) { this.numbersArray = numbersArray; }

    public List<MyInnerClass> getComplexList() { return complexList; }

    public void setComplexList(List<MyInnerClass> complexList) { this.complexList = complexList; }

    public Map<String, Object> getMapInYaml() {
        return mapInYaml;
    }

    public void setMapInYaml(Map<String, Object> mapInYaml) {
        this.mapInYaml = mapInYaml;
    }

    public void showMyself(){
        System.out.println("-----------Group Properties with @ConfigurationProperties-----------");
        System.out.println(String.format("My properties are:%n\t s=%s%n\t x.i=%d%n\t x.b=%b%n\t numbersArray=%s%n\t complexList:", s, x.i, x.b, numbersArray));
        complexList.forEach(element -> {
            System.out.println(String.format("\t\t- i=%d%n\t\t  b=%b", element.i, element.b));
        });
        System.out.println(String.format("\t mapInYaml: %s", mapInYaml.toString()));
    }
}