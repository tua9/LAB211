
package com.mycompany.week09;

/*
    Note: 
 */
public class Experience extends Candidate {
    private final int expInYear;
    private final String proSkill;

    public Experience(String candidateId, String firstName, String lastName, int birthYear,
                      String address, String phone, String email, int candidateType,
                      int expInYear, String proSkill) {
        super(candidateId, firstName, lastName, birthYear, address, phone, email, candidateType);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }
}
