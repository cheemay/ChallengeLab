/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Dell
 */
public class SetDemo1 {
    public static void main(String[] args) {
        Set<String> shoppingList = new HashSet<>();
        shoppingList.add("Beer");
        shoppingList.add("Chips");
        shoppingList.add("Beer");
        shoppingList.add("Nuts");
        
        //using loop
        for (String s : shoppingList){
            System.out.println(s);
        }
    }
    
}
