package com.abc.foo;

/**
 * Created by dedeHan on 31.1.2016.
 */
public class User {

    private String firstName;
    private String lastName;
    private String emailAdress;

    public User() {

    }

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    @Override
    public String toString() {

        return "User{" +
                "firstName='" + firstName + '\'' +
                "lastName='" + lastName + '\'' +
                '}';
    }

}
