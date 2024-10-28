package com.education.ztu.humans;

public enum Gender {
    MALE("male, so address me Mr."),
    FEMALE("female, so address me Mrs.");

    private final String description;
    private Gender(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "My gender is : " + description;
    }
}
