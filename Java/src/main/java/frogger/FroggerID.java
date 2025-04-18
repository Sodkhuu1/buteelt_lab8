package frogger;

// A record class that can conveniently store immutable data. 
// To compare two record classes with their corresponding fields, simply use ".equals()".
// More information: https://docs.oracle.com/en/java/javase/17/language/records.html#GUID-6699E26F-4A9B-4393-A08B-1E47D4B2D263
public class FroggerID {
    private String firstName, lastName, phoneNumber, zipCode, state, gender;

    public FroggerID(String firstName, String lastName, String phoneNumber,
                     String zipCode, String state, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
        this.state = state;
        this.gender = gender;
    }

    
}
