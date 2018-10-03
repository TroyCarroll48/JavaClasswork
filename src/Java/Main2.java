package Java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main2 {

    public static void main(String[] args) {

        Map<String, Dog> doggie = new HashMap<>();
        doggie.put(" One ", new Dog(" Reese "));
        doggie.put(" Two ", new Dog(" Pepe le frog " ));
//        doggie.put(3, new Dog(" Odie "));
//        doggie.put(4, new Dog(" K-9 "));
//        doggie.put(5, new Dog(" Polo "));
//
//        for (Map.Entry x: doggie.entrySet()) {
//            System.out.println(x.getKey() + " ===== " + x.getValue().toString());
//
//        }

//        Map<Integer, String> rank = new HashMap<>();
//        rank.put(1," Curly Frie ");
//        rank.put(2," Sumo ");
//        rank.put(3," Og Bobby Johnson ");
//        rank.put(4, " Big Ass Troy ");
//        rank.put(5," Iron Chef ");
//        rank.put(6," Jmoney ");
//        rank.put(7," Extra Special Zhodi ");
//
//        for (Map.Entry x: rank.entrySet()){
//            System.out.println(x.getKey() + " ==== " + x.getValue().toString());
//
//        }



//        Iterator<Map.Entry<Integer,String>> x = rank.entrySet().iterator();
//        while(x.hasNext()){
//            Map.Entry<Integer,String> answe = x.next();
//
//            System.out.println(answe.getKey());
//            System.out.println(answe.getValue());
//            System.out.println(answe.getKey() + "=" + answe.getValue());
//        }


        Map<Integer, String> num1 = new HashMap();
        num1.put(1," HI ");
        num1.put(2," Hello ");

        Map<Integer,String> num2 = new HashMap();
//        num2.put(3, " Bye ");
//        num2.put(4," See Ya");

//        HashMap<Integer,String> num3 = new HashMap<>();


       num1.putAll(num2);

        System.out.println(num2.isEmpty());

//
//                for (Map.Entry x: num1.entrySet()){
//            System.out.println(x.getKey() + " ==== " + x.getValue().toString());
//
//        }




        }


    }