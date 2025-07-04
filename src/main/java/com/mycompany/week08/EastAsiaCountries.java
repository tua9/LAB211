
package com.mycompany.week08;

/*
    Note: 
 */
public class EastAsiaCountries extends Country {
    private String countryTerrain;

    public EastAsiaCountries() {}

    public EastAsiaCountries(String countryCode, String countryName, float totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    @Override
    public void display() {
        System.out.printf("%-15s%-20s%-20.1f%-20s\n", countryCode, countryName, totalArea, countryTerrain);
    }
}

