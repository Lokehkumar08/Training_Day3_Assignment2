import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ReportCardApp {
    
    // ReportCard class to represent each student's report card
    static class ReportCard {
        private String name;
        private String surname;
        private String studentClass;
        private String[] subjects;
        private int[] votes;
        private String[] judgments;

        // Constructor to initialize the student's information
        public ReportCard(String name, String surname, String studentClass, int numSubjects) {
            this.name = name;
            this.surname = surname;
            this.studentClass = studentClass;
            subjects = new String[numSubjects];
            votes = new int[numSubjects];
            judgments = new String[numSubjects];
        }

        // Method to read the report data from the user
        public void readReportData() {
            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < subjects.length; i++) {
                System.out.print("Enter subject name for subject " + (i + 1) + ": ");
                subjects[i] = sc.nextLine();
                System.out.print("Enter vote for " + subjects[i] + ": ");
                votes[i] = sc.nextInt();
                sc.nextLine(); // Consume the remaining newline character
                System.out.print("Enter judgment for " + subjects[i] + ": ");
                judgments[i] = sc.nextLine();
            }
        }

        // Method to display the report card in a readable format
        public void displayReportCard() {
            System.out.println("\n----- Report Card -----");
            System.out.println("Name: " + name + " " + surname);
            System.out.println("Class: " + studentClass);
            System.out.println("Subject | Vote | Judgment");
            System.out.println("----------------------------");

            for (int i = 0; i < subjects.length; i++) {
                System.out.printf("%-8s | %-4d | %-10s\n", subjects[i], votes[i], judgments[i]);
            }
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask how many students' report cards to enter
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine(); // Consume the remaining newline character

        // List to hold all report cards
        List<ReportCard> reportCards = new ArrayList<>();

        // Input student data for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1));
            System.out.print("Enter student's first name: ");
            String name = sc.nextLine();
            System.out.print("Enter student's surname: ");
            String surname = sc.nextLine();
            System.out.print("Enter student's class: ");
            String studentClass = sc.nextLine();
            System.out.print("Enter number of subjects: ");
            int numSubjects = sc.nextInt();
            sc.nextLine(); // Consume the remaining newline character

            // Create ReportCard object and read its data
            ReportCard reportCard = new ReportCard(name, surname, studentClass, numSubjects);
            reportCard.readReportData();

            // Add the report card to the list
            reportCards.add(reportCard);
        }

        // Display all report cards
        for (ReportCard reportCard : reportCards) {
            reportCard.displayReportCard();
        }

        sc.close();
    }
}
