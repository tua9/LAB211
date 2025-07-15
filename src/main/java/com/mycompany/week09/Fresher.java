
package com.mycompany.week09;

/*
    Note: 
 */
public class Fresher extends Candidate {
    private final String graduationDate;
    private final String graduationRank;
    private final String education;

    public Fresher(String candidateId, String firstName, String lastName, int birthYear,
                   String address, String phone, String email, int candidateType,
                   String graduationDate, String graduationRank, String education) {
        super(candidateId, firstName, lastName, birthYear, address, phone, email, candidateType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }
}
