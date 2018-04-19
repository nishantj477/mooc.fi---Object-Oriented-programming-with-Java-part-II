package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if(name == null || name.equals("") || name.length() > 40)
            throw new IllegalArgumentException("name is null or empty or greater than 40 characters");
        if(age < 0 || age > 120)
            throw new IllegalArgumentException("age should be 120 > age > 0");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
