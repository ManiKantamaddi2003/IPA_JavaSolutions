package mark35Questions;

import java.util.Scanner;
import java.util.TreeSet;

class Student{
    private int rollNo;
    private String name;
    private String branch;
    private double score;
    private boolean dayScholar;

    // Parameterized Constructor
    public Student(int rollNo, String name, String branch, double score, boolean dayScholar) {
        this.rollNo = rollNo;
        this.name = name;
        this.branch = branch;
        this.score = score;
        this.dayScholar = dayScholar;
    }

    // Getters
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public double getScore() {
        return score;
    }

    public boolean isDayScholar() {
        return dayScholar;
    }

    // Setters
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setDayScholar(boolean dayScholar) {
        this.dayScholar = dayScholar;
    }
}

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[4];

        // Input for Student objects
        for (int i = 0; i < 4; i++) {
            int rollNo = sc.nextInt();
            sc.nextLine(); // Consume newline
            String name = sc.nextLine();
            String branch = sc.nextLine();
            double score = sc.nextDouble();
            boolean dayScholar = sc.nextBoolean();
            sc.nextLine(); // Consume newline
            students[i] = new Student(rollNo, name, branch, score, dayScholar);
        }

        // Call the method to find count of day scholar students
        int countDayScholars = findCountOfDayscholarStudents(students);
        if (countDayScholars > 0) {
            System.out.println(countDayScholars);
        } else {
            System.out.println("There are no such dayscholar students");
        }

        // Call the method to find student with second highest score
        Student secondHighestStudent = findStudentWithSecondHighestScore(students);
        if (secondHighestStudent != null) {
            System.out.printf("%d#%s#%.1f\n", secondHighestStudent.getRollNo(), secondHighestStudent.getName(), secondHighestStudent.getScore());
        } else {
            System.out.println("There are no student from non day scholar");
        }

        sc.close();
    }

    public static int findCountOfDayscholarStudents(Student[] students) {
        int count = 0;
        for (Student student : students) {
            if (student.getScore() > 80 && student.isDayScholar()) {
                count++;
            }
        }
        return count;
    }

    public static Student findStudentWithSecondHighestScore(Student[] students) {
        TreeSet<Student> nonDayScholars = new TreeSet<>((f1,f2)->Double.compare(f1.getScore(),f2.getScore()));
        
        for (Student student : students) {
            if (!student.isDayScholar()) {
                nonDayScholars.add(student);
                
            }
        }
        nonDayScholars.pollLast();
        Student stu=nonDayScholars.pollLast();
        return stu;
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        if (nonDayScholars.size() < 2) {
//            return null; // No second highest if less than 2 non-day scholars
//        }
//
//        // Sort to find the second highest score
//        Collections.sort(nonDayScholars, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return Double.compare(s2.getScore(), s1.getScore()); // Descending order
//            }
//        });
//
//        return nonDayScholars.get(1); // Return second highest
    }
}

