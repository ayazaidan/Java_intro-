package homeworks;

public class Homework14 {

    // Task 1
    public static void fizzBuzz1(int argument){
        for (int i = 1; i <= argument; i++) {
            if(i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else System.out.println(i);
        }
    }

    // Task 2
    public static String fizzBuzz2(int argument){
        if (argument % 15 == 0) return "FizzBuzz";
        else if (argument % 5 == 0) return "Buzz";
        else if (argument % 3 == 0) return "Fizz";
        return argument + "";
   }


    // Task 3
    public static int findSumNumbers(String str){

        String[] arr = str.split("[^0-9]");

        int sumOfNumbers = 0;

        for (String s : arr) {
            if (!s.isEmpty()) sumOfNumbers += Integer.parseInt(s);
        }
        return sumOfNumbers;
    }
    // Task 4
    public static int findBiggestNumber(String str){

        String[] arr = str.split("[^0-9]");
        int biggestNumber = Integer.MIN_VALUE;
        for (String s : arr) {
            if(!s.isEmpty() && Integer.parseInt(s) > biggestNumber) biggestNumber = Integer.parseInt(s);
        }
        return biggestNumber;
    }

    // Task 5
    public static String countSequenceOfCharacters(String str){
        String answer = "";
        int count = 1;
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == str.charAt(i + 1)){
                count++;
            }else{
                answer += String.valueOf(count) + str.charAt(i);
                count = 1;
            }
            if(i == str.length()-2) answer += String.valueOf(count) + str.charAt(i+1);
        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println("----------TASK 1 ----------");
        fizzBuzz1(3);
        System.out.println("=========");
        fizzBuzz1(5);
        System.out.println("=========");
        fizzBuzz1(16);


        System.out.println("----------TASK 2 ----------");
        System.out.println(fizzBuzz2(0));
        System.out.println(fizzBuzz2(1));
        System.out.println(fizzBuzz2(3));
        System.out.println(fizzBuzz2(5));
        System.out.println(fizzBuzz2(15));

        System.out.println("----------TASK 3 ----------");
        System.out.println(findSumNumbers("abc$"));
        System.out.println(findSumNumbers("a1b4c  6#"));
        System.out.println(findSumNumbers("ab110c045d"));
        System.out.println(findSumNumbers("525"));

        System.out.println("----------TASK 4 ----------");
        System.out.println(findBiggestNumber("abc$"));
        System.out.println(findBiggestNumber("a1b4c  6#"));
        System.out.println(findBiggestNumber("ab110c045d"));
        System.out.println(findBiggestNumber("525"));

        System.out.println("----------TASK 5 ----------");
        System.out.println(countSequenceOfCharacters(""));
        System.out.println(countSequenceOfCharacters("abc"));
        System.out.println(countSequenceOfCharacters("abbcca"));
        System.out.println(countSequenceOfCharacters("aaAAa"));
    }
}