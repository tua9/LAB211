
package com.mycompany.week09;

/*
    Note: 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandidateManager {
    private final List<Candidate> candidates = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);
    private static final  CandidateManager Instance = new CandidateManager();

    public static CandidateManager getInstance() {
        return Instance;
    }
    
    public void run() {
        while (true) {
            System.out.println("\nCANDIDATE MANAGEMENT SYSTEM");
            System.out.println("1. Experience");
            System.out.println("2. Fresher");
            System.out.println("3. Internship");
            System.out.println("4. Searching");
            System.out.println("5. Exit");
            System.out.print("Your choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> {
                    do {
                        Experience exp = createExperience(sc);
                        addCandidate(exp);
                    } while (askContinue(sc));
                    showAllCandidates();
                }
                case 2 -> {
                    do {
                        Fresher fresher = createFresher(sc);
                        addCandidate(fresher);
                    } while (askContinue(sc));
                    showAllCandidates();
                }
                case 3 -> {
                    do {
                        Intern intern = createIntern(sc);
                        addCandidate(intern);
                    } while (askContinue(sc));
                    showAllCandidates();
                }
                case 4 -> searchCandidate();
                case 5 -> System.exit(0);
            }
        }
    }

    private static boolean askContinue(Scanner sc) {
        System.out.print("Do you want to continue (Y/N)? ");
        return sc.nextLine().equalsIgnoreCase("Y");
    }

    private static Experience createExperience(Scanner sc) {
        System.out.println("Enter Experience Candidate info:");
        String id = input(sc, "ID: ");
        String fn = input(sc, "First name: ");
        String ln = input(sc, "Last name: ");
        int year = inputInt(sc, "Birth year (1900–" + java.time.Year.now().getValue() + "): ", 1900, java.time.Year.now().getValue());
        String addr = input(sc, "Address: ");
        String phone = inputPhone(sc);
        String email = inputEmail(sc);
        int exp = inputInt(sc, "Years of experience (0–100): ", 0, 100);
        String skill = input(sc, "Professional skill: ");
        return new Experience(id, fn, ln, year, addr, phone, email, 0, exp, skill);
    }

    private static Fresher createFresher(Scanner sc) {
        System.out.println("Enter Fresher Candidate info:");
        String id = input(sc, "ID: ");
        String fn = input(sc, "First name: ");
        String ln = input(sc, "Last name: ");
        int year = inputInt(sc, "Birth year: ", 1900, java.time.Year.now().getValue());
        String addr = input(sc, "Address: ");
        String phone = inputPhone(sc);
        String email = inputEmail(sc);
        String gradDate = input(sc, "Graduation date: ");
        String rank = inputRank(sc);
        String education = input(sc, "Education: ");
        return new Fresher(id, fn, ln, year, addr, phone, email, 1, gradDate, rank, education);
    }

    private static Intern createIntern(Scanner sc) {
        System.out.println("Enter Intern Candidate info:");
        String id = input(sc, "ID: ");
        String fn = input(sc, "First name: ");
        String ln = input(sc, "Last name: ");
        int year = inputInt(sc, "Birth year: ", 1900, java.time.Year.now().getValue());
        String addr = input(sc, "Address: ");
        String phone = inputPhone(sc);
        String email = inputEmail(sc);
        String major = input(sc, "Majors: ");
        String semester = input(sc, "Semester: ");
        String uni = input(sc, "University name: ");
        return new Intern(id, fn, ln, year, addr, phone, email, 2, major, semester, uni);
    }

    private static String input(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextLine().trim();
    }

    private static int inputInt(Scanner sc, String prompt, int min, int max) {
        int val;
        do {
            System.out.print(prompt);
            val = Integer.parseInt(sc.nextLine());
        } while (val < min || val > max);
        return val;
    }

    private static String inputPhone(Scanner sc) {
        String phone;
        do {
            phone = input(sc, "Phone (min 10 digits): ");
        } while (!phone.matches("\\d{10,}"));
        return phone;
    }

    private static String inputEmail(Scanner sc) {
        String email;
        do {
            email = input(sc, "Email (example@domain.com): ");
        } while (!email.matches("\\w+@\\w+\\.\\w+"));
        return email;
    }

    private static String inputRank(Scanner sc) {
        String[] ranks = {"Excellence", "Good", "Fair", "Poor"};
        String rank;
        do {
            rank = input(sc, "Rank of Graduation (Excellence, Good, Fair, Poor): ");
        } while (!java.util.Arrays.asList(ranks).contains(rank));
        return rank;
    }
    
    public void addCandidate(Candidate candidate) {
        candidates.add(candidate);
    }

    public void showAllCandidates() {
        System.out.println("=========== EXPERIENCE CANDIDATE ===========");
        candidates.stream().filter(c -> c.getCandidateType() == 0).forEach(System.out::println);

        System.out.println("=========== FRESHER CANDIDATE ==============");
        candidates.stream().filter(c -> c.getCandidateType() == 1).forEach(System.out::println);

        System.out.println("=========== INTERN CANDIDATE ===============");
        candidates.stream().filter(c -> c.getCandidateType() == 2).forEach(System.out::println);
    }

    public void searchCandidate() {
        showAllCandidates();
        System.out.print("Input Candidate name (First name or Last name): ");
        String name = sc.nextLine().toLowerCase();

        System.out.print("Input type of candidate (0: Experience, 1: Fresher, 2: Intern): ");
        int type = Integer.parseInt(sc.nextLine());

        System.out.println("The candidates found:");
        candidates.stream()
                .filter(c -> (c.getFirstName().toLowerCase().contains(name)
                        || c.getLastName().toLowerCase().contains(name))
                        && c.getCandidateType() == type)
                .forEach(c -> System.out.println(c.toInfoString()));
    }

    public Scanner getScanner() {
        return sc;
    }
}
