
package com.mycompany.week08;

import java.util.List;
import java.util.Scanner;

/*
    Note: 
 */
public class ManageCountries {

    public static void run() {
        Scanner sc = new Scanner(System.in);
        ManageEastAsiaCountries manager = new ManageEastAsiaCountries();

        while (true) {
            System.out.println("\nMENU");
            System.out.println("1. Input the information of 11 countries in East Asia");
            System.out.println("2. Display the information of country you've just input");
            System.out.println("3. Search the information of country by user-entered name");
            System.out.println("4. Display the information of countries sorted name in ascending order");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(sc.nextLine().trim());

            switch (choice) {
                case 1 -> {
                    try {
                        if (manager.getRecentlyEnteredInformation().size() >= 11) {
                            System.out.println("Maximum of 11 countries reached.");
                            break;
                        }

                        System.out.print("Enter code of country: ");
                        String code = sc.nextLine().trim();

                        System.out.print("Enter name of country: ");
                        String name = sc.nextLine().trim();

                        float area;
                        while (true) {
                            System.out.print("Enter total Area: ");
                            area = Float.parseFloat(sc.nextLine().trim());
                            if (area > 0) break;
                            System.out.println("Total area must be > 0.");
                        }

                        System.out.print("Enter terrain of country: ");
                        String terrain = sc.nextLine().trim();

                        EastAsiaCountries country = new EastAsiaCountries(code, name, area, terrain);
                        manager.addCountryInformation(country);
                        System.out.println("Country added successfully!");

                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }

                case 2 -> {
                    System.out.printf("%-15s%-20s%-20s%-20s\n", "ID", "Name", "Total Area", "Terrain");
                    for (EastAsiaCountries c : manager.getRecentlyEnteredInformation()) {
                        c.display();
                    }
                }

                case 3 -> {
                    System.out.print("Enter the name you want to search for: ");
                    String nameSearch = sc.nextLine().trim();
                    List<EastAsiaCountries> found = manager.searchInformationByName(nameSearch);

                    if (found.isEmpty()) {
                        System.out.println("No country found with that name.");
                    } else {
                        System.out.printf("%-15s%-20s%-20s%-20s\n", "ID", "Name", "Total Area", "Terrain");
                        for (EastAsiaCountries c : found) {
                            c.display();
                        }
                    }
                }

                case 4 -> {
                    System.out.printf("%-15s%-20s%-20s%-20s\n", "ID", "Name", "Total Area", "Terrain");
                    for (EastAsiaCountries c : manager.sortInformationByAscendingOrder()) {
                        c.display();
                    }
                }

                case 5 -> {
                    System.out.println("Exiting program...");
                    return;
                }

                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

}
