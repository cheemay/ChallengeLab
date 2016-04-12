/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Dell
 */
public class ListDemo1 {
    public static void main(String[] args) {
        //<String> is called a Generic
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("Beer");
        shoppingList.add("Chips");
        shoppingList.add("Beer");
        shoppingList.add("Nuts");
        //Third way of looping
        //This is using only advance level but this is another way to do this
        Iterator <String>it = shoppingList.iterator();
        while(it.hasNext()){
            String item = it.next();
            System.out.println(item);
        }
        //This loop work JDK 5 or higher but if change the string to objest it work
        for(String s : shoppingList){
            System.out.println(s);
        }
        
        for(int i = 0; i < shoppingList.size(); i++){
            String item = shoppingList.get(i);
            System.out.println(item);
        }
        
//        for (int i=0; i < shoppingList.size(); i++){
//            String item = (String)shoppingList.get(i);
//            System.out.println(item);
//        }
        //Then we not need to write string here 
        //String item = (String)shoppingList.get(1);
        //we can get size of ArrayList
//        int size = shoppingList.size();
//        String item = shoppingList.get(1);
//        shoppingList.add(1, "Steak");
    }
}
