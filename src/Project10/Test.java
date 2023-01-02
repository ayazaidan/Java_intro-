package Project10;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

        public static void main(String[] args) {

            int students = 0;
            int numberOfMathStudents = 0;
            int numberOfScienceStudents = 0;
            Scanner input = new Scanner(System.in);
            ArrayList<Student> listOfStudents = new ArrayList<>();

            while (students < 3) {
                System.out.println(UserQuestions.askToJoin);
                if (input.nextLine().startsWith("Y")) {
                    System.out.println(UserQuestions.askFirstName);
                    String firstName = input.nextLine();
                    System.out.println(UserQuestions.askLastName);
                    String lastName = input.nextLine();
                    System.out.println(UserQuestions.askAge);
                    int age = input.nextInt();
                    try {
                        Permission.checkAge(age);
                    } catch (RuntimeException c) {
                        c.printStackTrace();
                        input.nextLine();
                        continue;
                    }
                    System.out.println(UserQuestions.askGender);
                    input.nextLine();
                    String gender = input.nextLine();
                    System.out.println(UserQuestions.askClassName);
                    String className = input.nextLine();
                    try {
                        Permission.checkClassName(className);
                    } catch (RuntimeException c) {
                        c.printStackTrace();
                        continue;
                    }

                    if (className.equalsIgnoreCase("Math")) {
                        MathStudent mathStudent = new MathStudent(firstName, lastName, age, gender, className);
                        listOfStudents.add(mathStudent);
                        students++;
                        numberOfMathStudents++;
                    } else {
                        MathStudent scienceStudents = new MathStudent(firstName, lastName, age, gender, className);
                        listOfStudents.add(scienceStudents);
                        students++;
                        numberOfScienceStudents++;
                    }
                    System.out.println("Congratulations! You are registered for " + className + " class.");
                }

            }
            for (Student listOfStudent : listOfStudents) {
                System.out.println(listOfStudent);
            }
            System.out.println("\nMath students = " + numberOfMathStudents);
            System.out.println("Science students = " + numberOfScienceStudents);
        }
    }


