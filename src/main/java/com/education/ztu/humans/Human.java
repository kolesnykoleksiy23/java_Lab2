package com.education.ztu.humans;

public interface Human {
    public void sayAge();

    public void sayGender();

    public void sayLocation();

    public void sayName();

    public default void whoIam() {
        System.out.println("Я людина");
    }

    public String getFullInfo();
}
