package Inheritance_Exercises.Person;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getAge() {
        return age;
    }

    protected void setAge(int age) {
        if(age < 0) {
            throw new IllegalArgumentException("Age must be positive!");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d",
                this.getName(),
                this.getAge());
    }
}
