package navin.com.java.CollectionsFramework.ArrayList;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
          ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Chris");
        nameList.add("Miya");

//        System.out.println(nameList);
//        System.out.println("===========");
//
//        String name = nameList.get(1);
//        System.out.println(name);
//
//        // Update
//        System.out.println("-Update--");
//        nameList.set(1,"Single");
//        System.out.println(nameList);
//
//        // Add more data so sorting makes sense
//        nameList.add("Alex");
//        nameList.add("Bob");
//
//        // Sort
//
//        Comparator<String> comparAsc = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        };
//        nameList.sort(comparAsc);
//
//        System.out.println("========");
//        System.out.println(nameList);
//
//
//        System.out.println("================");
//        boolean exit = nameList.contains("Bob");
//        System.out.println(exit);


        //**Loop
        for (String name : nameList){
            System.out.println(name);
        }



    }
}