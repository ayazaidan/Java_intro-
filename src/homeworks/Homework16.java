package homeworks;
import java.util.*;
public class Homework16 {
    //TASK 1
    public static TreeMap<Integer, String> parseData(String str){
        str = str.replaceAll("[{]|[}]", " ").trim();
        String[] str11 = str.split(" ");
        ArrayList<Integer> keys = new ArrayList<>();
        ArrayList<String> values = new ArrayList<>();
        TreeMap<Integer, String> result = new TreeMap<>();
        for (int i = 0; i < str11.length; i++) {
            if(i % 2 != 0) values.add(str11[i]);
            else keys.add(Integer.parseInt(str11[i]));
        }
        for (int i = 0; i < keys.size(); i++) {
            result.put(keys.get(i), values.get(i));
        }
        return result;
    }
    //TASK 2
    public static double calculateTotalPrice1(Map<String,Integer> shoppingList){
        Map<String,Double> priceList = new HashMap<>();
        priceList.put("Apple", 2.00);
        priceList.put("Orange", 3.29);
        priceList.put("Mango", 4.99);
        priceList.put("Pineapple", 5.25);
        Set<Map.Entry<String, Double>> itemsPriceEntries = priceList.entrySet();
        Set<Map.Entry<String, Integer>> shoppingListEntries = shoppingList.entrySet();
        double result = 0;
        for (Map.Entry<String, Integer> item : shoppingListEntries) {
            for (Map.Entry<String, Double> itemPrice : itemsPriceEntries) {
                if(item.getKey().equals(itemPrice.getKey())) result += item.getValue()*itemPrice.getValue();
            }
        }
        return result;
    }
    //TASK 3
    public static double calculateTotalPrice2(Map<String,Integer> shoppingList) {
        Map<String, Double> priceList = new HashMap<>();
        priceList.put("Apple", 2.00);
        priceList.put("Orange", 3.29);
        priceList.put("Mango", 4.99);
        Set<Map.Entry<String, Double>> itemsPriceEntries = priceList.entrySet();
        Set<Map.Entry<String, Integer>> shoppingListEntries = shoppingList.entrySet();
        double result = 0;
        for (Map.Entry<String, Integer> item : shoppingListEntries) {
            for (Map.Entry<String, Double> itemPrice : itemsPriceEntries) {
                if(item.getKey().equals(itemPrice.getKey()) && item.getKey().equals("Apple")) {
                    if(item.getValue() % 2 == 0) result += item.getValue() * 1.5;
                    else result += item.getValue() * 1.5 + 0.5;
                }
                else if(item.getKey().equals(itemPrice.getKey()) && item.getKey().equals("Mango")) {
                    if (item.getValue() > 3) result += item.getValue() * itemPrice.getValue() - (item.getValue() / 4) * itemPrice.getValue();
                    else result += item.getValue() * itemPrice.getValue();
                }
                else if(item.getKey().equals(itemPrice.getKey())) result += item.getValue() * itemPrice.getValue();
            }
        }
        return result;
    }
    public static void main(String[] args) {

        System.out.println("----------- Task 1----------");
        System.out.println(parseData("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));

        System.out.println("----------Task 2 -----------");
        HashMap<String, Integer> list = new HashMap<>();
        list.put("Apple", 3);
        list.put("Mango", 1);
        System.out.println(calculateTotalPrice1(list));

        list.clear();

        list.put("Apple", 2);
        list.put("Pineapple", 1);
        list.put("Orange", 3);
        System.out.println(calculateTotalPrice1(list));

        System.out.println("----------Task 3 ----------");
        list.clear();
        list.put("Apple", 3);
        list.put("Mango", 5);
        System.out.println(calculateTotalPrice2(list));

        list.clear();
        list.put("Apple", 4);
        list.put("Mango", 8);
        list.put("Orange", 3);

        System.out.println(calculateTotalPrice2(list));
    }
}