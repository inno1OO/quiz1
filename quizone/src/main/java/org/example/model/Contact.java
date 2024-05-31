package org.example.model;

import java.util.List;

public class Contact {
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private List<PhoneNumber> phoneNumbers;
    private List<EmailAddress> emailAddress;

    public Contact(String firstName, String lastName, String company, String jobTitle, List<PhoneNumber> phoneNumber, List<EmailAddress> emailAddress){
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.phoneNumbers = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public Contact(String firstName, String lastName, String company, String jobTitle){
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List<EmailAddress> getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(List<EmailAddress> emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void addPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumbers.add(phoneNumber);
    }
    public void addEmailAddress(EmailAddress emailAddress) {
        this.emailAddress.add(emailAddress);
    }



}
