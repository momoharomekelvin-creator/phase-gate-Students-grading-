import java.util.Scanner;

public class studentsGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        System.out.print("Enter the number of subjects: ");
        int numSubjects = input.nextInt();
        scanner.nextLine(); 

        String[] studentNames = new String[numStudents];
        double[] studentAverages = new double[numStudents];
        double classTotalSum = 0;

        for (int index = 0; index < numStudents; index++) {
            System.out.println("\n-------------------------------------");
            System.out.print("Enter name for Student ," + (index + 1) + ": ");
            studentNames[index] = input.nextLine();

            double studentSubjectSum = 0;

            for (int indextwo = 0; indextwo < numSubjects; indextwo++) {
                System.out.print("  Enter score for Subject ," + (indextwo + 1) + ": ");
                double score = input.nextDouble();
                studentSubjectSum += score;
            }
            scanner.nextLine(); 

            double average = studentSubjectSum / numSubjects;
            studentAverages[index] = average;
            classTotalSum += average;
        }

        System.out.println("\n=====================================");
        System.out.println("           CLASS SUMMARY             ");
        System.out.println("=====================================");
        
        for (int index = 0; index < numStudents; index++) {
            String grade;
            if (studentAverages[index] >= 90) {
                grade = "A";
            } else if (studentAverages[index] >= 80) {
                grade = "B";
            } else if (studentAverages[index] >=                                                             70) {
                grade = "C";
            } else if (studentAverages[index] >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.printf("Student: %-15s | Average: %-6.2f | Final Grade: %s\n", 
                    studentNames[index], studentAverages[index], grade);
        }

        double classAverage = classTotalSum / numStudents;
        System.out.println("-------------------------------------");
        System.out.printf("Overall Class Average: %.2f\n", classAverage);
        System.out.println("=====================================");

        scanner.close();
    }
}

