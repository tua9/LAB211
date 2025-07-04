
package com.mycompany.week08;

/*
    Note: 
 */
import java.util.*;

public class ManageEastAsiaCountries {
    private final List<EastAsiaCountries> countryList = new ArrayList<>();

    public void addCountryInformation(EastAsiaCountries country) throws Exception {
        for (EastAsiaCountries c : countryList) {
            if (c.getCountryCode().equalsIgnoreCase(country.getCountryCode())) {
                throw new Exception("Duplicate country code.");
            }
        }
        countryList.add(country);
    }

    public List<EastAsiaCountries> getRecentlyEnteredInformation() {
        return countryList;
    }

    public List<EastAsiaCountries> searchInformationByName(String name) {
        List<EastAsiaCountries> result = new ArrayList<>();
        for (EastAsiaCountries c : countryList) {
            if (c.getCountryName().equalsIgnoreCase(name)) {
                result.add(c);
            }
        }
        return result;
    }

    public List<EastAsiaCountries> sortInformationByAscendingOrder() {
        List<EastAsiaCountries> sortedList = new ArrayList<>(countryList);
        sortedList.sort(Comparator.comparing(EastAsiaCountries::getCountryName));
        return sortedList;
    }
}
