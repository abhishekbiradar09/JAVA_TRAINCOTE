package Day10;

public class Person3 {

    private String firstName;
    private String lastName;
    private int age;

    public Person3(String firstName, String lastName, int age) throws InvalidAgeException {

        if (age <= 15) {
            throw new InvalidAgeException("Age must be above 15");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println(firstName + " " + lastName + " Age: " + age);
    }
}