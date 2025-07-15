
package com.mycompany.week09;

/*
    Note: 
 */
public abstract class Candidate {
    protected String candidateId;
    protected String firstName;
    protected String lastName;
    protected int birthYear;
    protected String address;
    protected String phone;
    protected String email;
    protected int candidateType;

    public Candidate(String candidateId, String firstName, String lastName, int birthYear,
                     String address, String phone, String email, int candidateType) {
        this.candidateId = candidateId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.candidateType = candidateType;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCandidateType() {
        return candidateType;
    }

    public String toInfoString() {
        return String.format("%s | %d | %s | %s | %s | %d",
                getFullName(), birthYear, address, phone, email, candidateType);
    }

    @Override
    public String toString() {
        return getFullName();
    }
}
