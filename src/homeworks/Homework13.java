package homeworks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class Homework13 {

    //Task 1
    public static boolean hasLowerCase(String str){
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLowerCase(str.charAt(i))) return true;
        }
        return false;
    }

    //Task 2
    public static ArrayList<Integer> noZero(ArrayList<Integer> list){
        list.removeIf(n -> n == 0);
        return list;
    }

    //Task 3
    public static int[][] numberAndSquare(int[] arr){
        int[][] arr1 = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            arr1[i][0] = arr[i];
            arr1[i][1] = arr[i] * arr[i];
        }
        return arr1;
    }

    //Task 4
    public static boolean containsValue(String[] arr, String str){
        return Arrays.binarySearch(arr, str) >= 0;
    }

    //Task 5
    public static String reverseSentence(String str){
        String result = "";
        if (!str.trim().contains(" ")) result = "There is not enough words!";
        else{
            for(int i = str.split(" ").length-1; i >= 0; i--){
                result += str.split(" ")[i] + " ";
            }
            result = result.substring(0, result.length()-1);
            result = result.substring(0, 1).toUpperCase() + result.substring(1, result.lastIndexOf(" ") + 1) +
                    result.substring(result.lastIndexOf(" ") + 1).toLowerCase();
        }
        return result;
    }

    //Task 6
    public static String removeStringSpecialsDigits(String str){
        return str.replaceAll("[^A-Za-z ]+", "");
    }
    //Task 7
    public static String[] removeArraySpecialsDigits(String[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i].replaceAll("[^A-Za-z]", "");
        }
        return arr;
    }

    //Task 8
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j)) && !list.contains(list1.get(i))) list.add(list1.get(i));
            }
        }
        return list;
    }

    //Task 9
    public static ArrayList<String> noXInVariables(ArrayList<String> list){
        for(int i = 0; i < list.size(); i++){
            list.set(i, list.get(i).replaceAll("[Xx]+", ""));
        }
        list.removeIf(x -> x.equals(""));
        return list;
    }

    public static void main(String[] args) {
                                 System.out.println("=========TASK-1========");
        System.out.println(hasLowerCase(""));
        System.out.println(hasLowerCase("JAVA"));
        System.out.println(hasLowerCase("125$"));
        System.out.println(hasLowerCase("hello"));

                                 System.out.println("==========TASK-2=======");
        System.out.println(noZero(new ArrayList<>(Arrays.asList(1))));
        System.out.println(noZero(new ArrayList<>(Arrays.asList(1, 1, 10))));
        System.out.println(noZero(new ArrayList<>(Arrays.asList(0, 1, 10))));
        System.out.println(noZero(new ArrayList<>(Arrays.asList(0, 0, 0))));

                                 System.out.println("===========TASK-3=========");
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.deepToString(numberAndSquare(arr)));
        int[] arr1 = {0, 3, 6};
        System.out.println(Arrays.deepToString(numberAndSquare(arr1)));
        int[] arr2 = {1, 4};
        System.out.println(Arrays.deepToString(numberAndSquare(arr2)));

                                System.out.println("=============TASK-4===========");
        String[] arr4_1 = {"abc", "foo", "java"};
        System.out.println(containsValue(arr4_1, "hello"));
        String[] arr4_2 = {"abc", "def", "123"};
        System.out.println(containsValue(arr4_2, "Abc"));
        String[] arr4_3 = {"abc", "def", "123", "Java", "Hello"};
        System.out.println(containsValue(arr4_3, "123"));

                                System.out.println("=============TASK-5=========");
        System.out.println(reverseSentence("Hello"));
        System.out.println(reverseSentence("Java is fun"));
        System.out.println(reverseSentence("This is a sentence"));
        System.out.println("============TASK-6==========");
        System.out.println(removeStringSpecialsDigits("123Java #$%is fun"));
        System.out.println(removeStringSpecialsDigits("Selenium"));
        System.out.println(removeStringSpecialsDigits("Selenium 123#$%Cypress"));

                                System.out.println("===========TASK-7=============");
        String[] arr7_1 = {"123Java", "#$%is", "fun"};
        System.out.println(Arrays.toString(removeArraySpecialsDigits(arr7_1)));
        String[] arr7_2 = {"Selenium", "123$%", "###"};
        System.out.println(Arrays.toString(removeArraySpecialsDigits(arr7_2)));
        String[] arr7_3 = {"Selenium", "123#$%Cypress"};
        System.out.println(Arrays.toString(removeArraySpecialsDigits(arr7_3)));

                                System.out.println("==========TASK-8===========");
        System.out.println(removeAndReturnCommons(new ArrayList<>(Arrays.asList("Java", "is", "fun")),
                new ArrayList<>(Arrays.asList("abc", "xyz", "123"))));
        System.out.println(removeAndReturnCommons(new ArrayList<>(Arrays.asList("Java", "is", "fun")),
                new ArrayList<>(Arrays.asList("Java", "C#", "Python"))));
        System.out.println(removeAndReturnCommons(new ArrayList<>(Arrays.asList("Java", "C#", "C#")),
                new ArrayList<>(Arrays.asList("Python", "C#", "C++"))));

                                System.out.println("==========TASK-9===========");
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("abc", "123", "#$%"))));
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("xyz", "123", "#$%"))));
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("x", "123", "#$%"))));
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("xyXyxy", "Xx", "ABC"))));
    }
}