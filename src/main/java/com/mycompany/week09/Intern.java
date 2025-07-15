
package com.mycompany.week09;

/*
    Note: 
 */
public class Intern extends Candidate {
    private final String majors;
    private final String semester;
    private final String universityName;

    public Intern(String candidateId, String firstName, String lastName, int birthYear,
                  String address, String phone, String email, int candidateType,
                  String majors, String semester, String universityName) {
        super(candidateId, firstName, lastName, birthYear, address, phone, email, candidateType);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }
}
