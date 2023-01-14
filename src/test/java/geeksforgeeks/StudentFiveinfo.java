package geeksforgeeks;

import java.util.Scanner;

class Student
{
    String name;
    int id;
    String grade;

    public Student(String name, int id, String grade)
    {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
}

public class StudentFiveinfo {
    public static void main(String[] args) {
        Student student[] = new Student[5];

        student[0] = new Student("Ajit", 1, "A");
        student[1] = new Student("Kumar", 2, "B");
        student[2] = new Student("Jaiswal", 3, "C");
        student[3] = new Student("Shalu", 4, "D");
        student[4] = new Student("Kumari", 5, "E");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student ID");
        int id = scanner.nextInt();

        for (int i = 0; i < student.length; i++)
        {
            if(student[i].id == id)
            {
                System.out.println("Student's name = " + student[i].name);
                System.out.println("Student's grade = " + student[i].grade);
            }
        }



    }
}
