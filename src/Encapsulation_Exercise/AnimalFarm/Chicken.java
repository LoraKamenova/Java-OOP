package Encapsulation_Exercise.AnimalFarm;

import java.security.InvalidParameterException;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.validateName(name);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.validateAge(age);
        this.age = age;
    }

    private void validateName(String name) {
        if (name == null || name.equals("") || name.equals(" ")) {
            throw new InvalidParameterException("Name cannot be empty.");
        }
    }

    private void validateAge(int age) {
        if (age < 0 || age > 15) {
            throw new InvalidParameterException("Age should be between 0 and 15.");
        }
    }

    public double productPerDay() {
        return this.calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        double productPerDay = 0;
        if (age >= 0 && age <= 5) {
            productPerDay = 2;
        } else if (age >= 6 && age <= 11) {
            productPerDay = 1;
        } else if (age >= 12 && age <= 15) {
            productPerDay = 0.75;
        }
        return productPerDay;
    }

    @Override
    public String toString() {
        return "Chicken{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
