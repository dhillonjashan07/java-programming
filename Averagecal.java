public class Averagecal {
    public static void main(String[] args) {
        int mathsMark = 94;
        int physicsMark = 95;
        int chemistryMark = 96;
        int totalSubjects = 3;

        // Calculate total marks
        int totalMarks = mathsMark + physicsMark + chemistryMark;

        // Calculate average percentage
        double averagePercentage = (double) totalMarks / (totalSubjects * 100) * 100;

        // Output the result
        System.out.println("Sam's average mark in PCM is " + averagePercentage + "%");
    }
}
