package homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework15 {

    // Task 1
    public static int[] fibonacciSeries1(int num) {
        int[] arr = new int[num];
        arr[0] = 0;
        arr[1] = 1;
        int firstTerm = 0;
        int secondTerm = 1;

        for(int i = 2; i < num; ++i) {
            int nextTerm = firstTerm + secondTerm;
            arr[i] = nextTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        return arr;
    }

    //Task 2

    public static int fibonacciSeries2(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int firstNumber = 0;
            int secondNumber = 1;
            int nextNumber = 0;

            for(int i = 3; i <= n; ++i) {
                nextNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = nextNumber;
            }

            return nextNumber;
        }
    }

    // Task 3
    public static int[] findUniques(int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList();
        ArrayList<Integer> listA = new ArrayList();
        ArrayList<Integer> listB = new ArrayList();
        int[] uniques = a;
        int i = a.length;

        int var7;
        int element;
        for(var7 = 0; var7 < i; ++var7) {
            element = uniques[var7];
            listA.add(element);
        }

        uniques = b;
        i = b.length;

        for(var7 = 0; var7 < i; ++var7) {
            element = uniques[var7];
            listB.add(element);
        }

        for(i = 0; i < listA.size(); ++i) {
            if (!list.contains(listA.get(i)) && !listB.contains(listA.get(i))) {
                list.add(listA.get(i));
            }
        }

        for(i = 0; i < listB.size(); ++i) {
            if (!list.contains(listB.get(i)) && !listA.contains(listB.get(i))) {
                list.add(listB.get(i));
            }
        }

        uniques = new int[list.size()];

        for(i = 0; i < list.size(); ++i) {
            uniques[i] = (Integer)list.get(i);
        }

        return uniques;
    }

    // Task 4
    public static boolean isPowerOf3(int number) {
        int power;
        for(power = 3; power < number; power *= 3) {
        }

        return power == number;
    }

    // Task 5
    public static int firstDuplicate(int[] arr) {
        int duplicate = -1;
        int iOfDuplicate = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; ++i) {
            for(int j = i + 1; j < arr.length; ++j) {
                if (arr[i] == arr[j] && j < iOfDuplicate) {
                    duplicate = arr[i];
                    iOfDuplicate = j;
                }
            }
        }

        return duplicate;
    }


    public static void main(String[] args) {

        System.out.println("==========TASK-1==========");
        System.out.println(Arrays.toString(fibonacciSeries1(3)));
        System.out.println(Arrays.toString(fibonacciSeries1(5)));
        System.out.println(Arrays.toString(fibonacciSeries1(7)));
        System.out.println(Arrays.toString(fibonacciSeries1(11)));

        System.out.println("=========TASK-2===========");
        System.out.println(fibonacciSeries2(2));
        System.out.println(fibonacciSeries2(4));
        System.out.println(fibonacciSeries2(8));

        System.out.println("==========TASK-3===========");
        System.out.println(Arrays.toString(findUniques(new int[0], new int[0])));
        System.out.println(Arrays.toString(findUniques(new int[0], new int[]{1, 2, 3, 2})));
        System.out.println(Arrays.toString(findUniques(new int[]{1, 2, 3, 4}, new int[]{3, 4, 5, 5})));
        System.out.println(Arrays.toString(findUniques(new int[]{8, 9}, new int[]{9, 8, 9})));

        System.out.println("=========TASK-4=========");
        System.out.println(isPowerOf3(1));
        System.out.println(isPowerOf3(2));
        System.out.println(isPowerOf3(3));
        System.out.println(isPowerOf3(81));
        System.out.println(isPowerOf3(27));
        System.out.println(isPowerOf3(253));

        System.out.println("=========TASK-5========");
        int[] arr5_1 = new int[0];
        System.out.println(firstDuplicate(arr5_1));
        int[] arr5_2 = new int[]{1};
        System.out.println(firstDuplicate(arr5_2));
        int[] arr5_3 = new int[]{1, 2, 2, 3};
        System.out.println(firstDuplicate(arr5_3));
        int[] arr5_4 = new int[]{1, 3, 3, 4, 5, 1};
        System.out.println(firstDuplicate(arr5_4));
    }
}
