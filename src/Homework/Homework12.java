package Homework;
import java.util.Arrays;
public class Homework12 {




    // TASK 1
    public static String noDigit(String str){
        return str.replaceAll("[0-9]", "");
    }

    // TASK 2
    public static String noVowel(String str){
        return str.toLowerCase().replaceAll("[aeiou]", "");
    }
    //TASK 3
    public static int sumOfDigits(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) sum += Integer.parseInt(str.substring(i, i+1));
        }
        return sum;
    }
    //TASK 4
    public static boolean hasUpperCase(String str){
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) return true;
        }
        return false;
    }

    //TASK-5
    public static int middleInt(int a,int b, int c){
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        int sum = a + b + c;
        return sum - max - min;
    }
    //TASK-6
    public static int[] no13 (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 13) arr[i] = 0;
        }
        return arr;
    }
    //TASK-7
    public static int[] arrFactorial(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else{
                int factorial = 1;
                for (int j = 1; j <= arr[i]; j++) {
                    factorial *= j;
                }
                arr[i] = factorial;
            }
        }
        return arr;
    }
    //TASK-8
    public static String[] categorizeCharacters(String str){
        String[] arr = {"", "", ""};
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) arr[0] += str.charAt(i);
            else if (Character.isDigit(str.charAt(i))) arr[1] += str.charAt(i);
            else if (!Character.isWhitespace(str.charAt(i))) arr[2] += str.charAt(i);
        }
        return arr;
    }

    public static void main(String[] args) {

        System.out.println("\n----------TASK 1 ----------\n");

        String str1 = "123Hello World149";
        System.out.println(noDigit(str1));

       String str_ = "123Tech456Global149";
        System.out.println(noDigit(str_));


        System.out.println("\n----------TASK2 2----------\n");

        String str = "xyz";
        System.out.println(noVowel(str));

        str = "TechGlobal";
        System.out.println(noVowel(str));


        System.out.println("\n ---------TASK 3---------\n");

        String str3 = "Java";
        System.out.println(sumOfDigits(str3));

        str3 = "John’s age is 29";
        System.out.println(sumOfDigits(str3));

        str3 = "$125.0";
        System.out.println(sumOfDigits(str3));


        System.out.println("\n ---------TASK 4---------\n");

        String str4 = "java";
        System.out.println(hasUpperCase(str4));

        String str4_ = "John’s age is 29";
        System.out.println(hasUpperCase(str4_));



        System.out.println("\n---------TASK 5---------\n");

        int a = 1, b = 1, c = 1;
        System.out.println(middleInt(a, b, c));

        a = 1; b = 2; c = 2;
        System.out.println(middleInt(a, b, c));

        a = -1; b = 25; c = 10;
        System.out.println(middleInt(a, b, c));


        System.out.println("\n---------TASK 6 ---------\n");

        int[] arr6 = new int[]{1, 2, 3 ,4};
        System.out.println(Arrays.toString(no13(arr6)));

        int[] arr6_ = new int[]{13, 2, 3};
        System.out.println(Arrays.toString(no13(arr6_)));


        System.out.println("\n----------TASK 7----------\n");

       int[] arr7 = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(arrFactorial(arr7)));

       int[] arr7_ = new int[]{0, 5};
        System.out.println(Arrays.toString(arrFactorial(arr7_)));


        System.out.println("\n----------TASK 8----------\n");

        String str8 = "abc123$#%";
        System.out.println(Arrays.toString(categorizeCharacters(str8)));

        String str8_ = "12ab$%3c%";
        System.out.println(Arrays.toString(categorizeCharacters(str8_)));
    }

        }