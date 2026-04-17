package Day2;

public class Person {
    String firstName;
    String lastName;
    Gender gender;
    String phoneNumber;

    public Person() 
    {
    	
    }

    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() 
    { 
    	return firstName; 
    }
    public void setFirstName(String firstName) 
    { 
    	this.firstName = firstName; 
    }

    public String getLastName() 
    { 
    	return lastName; 
    }
    public void setLastName(String lastName) 
    { 
    	this.lastName = lastName; 
    }

    public Gender getGender() 
    { 
    	return gender; 
    }
    public void setGender(Gender gender) 
    { 
    	this.gender = gender; 
    }

    public String getPhoneNumber() 
    { 
    	return phoneNumber; 
    	
    }
    public void setPhoneNumber(String phoneNumber) 
    { 
    	this.phoneNumber = phoneNumber; 
    }

    public void displayDetails() {
        System.out.println("Person Details:");
        System.out.println("________________");
        System.out.println();
        System.out.println("\nFirst Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Gender: " + gender);
        if(phoneNumber != null) {
            System.out.println("Phone Number: " + phoneNumber);
        }
    }
}