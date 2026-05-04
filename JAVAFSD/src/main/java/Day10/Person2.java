package Day10;

public class Person2 {

    private String firstName;
    private String lastName;
    private String gender;
    private int age;

    public Person2(String firstName, String lastName, String gender, int age)
            throws InvalidNameException {

        this.firstName = validateName(firstName, "First Name");
        this.lastName = validateName(lastName, "Last Name");

        this.gender = gender;
        this.age = age;
    }

    private String validateName(String name, String field) throws InvalidNameException {

        if (name == null || name.trim().isEmpty()) {
            throw new InvalidNameException(field + " cannot be blank");
        }

        return name.trim(); // remove extra spaces
    }

    public void display() {
        System.out.println(firstName + " " + lastName + " " + gender + ", " + age);
    }
}