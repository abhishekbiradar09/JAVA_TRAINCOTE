package Day5;

import java.time.LocalDate;
import java.time.Period;

public class ModifyPerson 
{
    private String firstName;
    private String lastName;
    private char gender;
    private LocalDate dob;

    public ModifyPerson(String firstName, String lastName, char gender, LocalDate dob)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;
    }

    public int calculateAge()
    {
        return Period.between(dob, LocalDate.now()).getYears();
    }

    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    public void display()
    {
        System.out.println("Full name:" + getFullName());
        System.out.println("Gender:" + gender);
        System.out.println("Age:" + calculateAge());
    }
}