package org.fominsky.service;

public class Profession implements Comparable<Profession>{
    String name; // название профессии
    String description; // описание
    int conformity; // процент подходящести
    int maxConformity; // максимально возможный процент
    String explanation; //описание что можно сделать

    @Override
    public int compareTo(Profession o) {
        int result = o.conformity - this.conformity;
        return result;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getConformity() {
        return conformity;
    }

    public int getMaxConformity() {
        return maxConformity;
    }

    public String getExplanation(){
        return explanation;
    }
}
