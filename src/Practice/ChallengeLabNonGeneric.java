/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import common.Employee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Dell
 */
public class ChallengeLabNonGeneric {
    public static void main(String[] args) {
        Employee e1 = new Employee("Cheema", "Yasir", "222-22-2222");
        Employee e2 = new Employee("Smith","John","333-33-3333");
        Employee e3 = new Employee("Cheema","Yasir","222-22-2222");
        Employee e4 = new Employee("Elvardo", "Rick","111-11-1111");
        //Generic way
        List employees = new ArrayList();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        //Generic way of Map 
        Map employee1 = new HashMap();
        employee1.put("222-22-2222",e1);
        employee1.put("333-33-3333", e2);
        employee1.put("222-22-2222", e3);
        employee1.put("111-11-1111", e4);
        
        //now retrieve one by its key
        String emp = (String)employee1.get("222-22-2222");
        System.out.println("Found employee with a key 222-22-2222" +emp);
        //throw loop
        System.out.println("Sort by natural order ");
//        Collection values = employee1.values();
//        for(Employee e : values){
//            System.out.println(e);
//        }
        
        //With set way
        System.out.println("Using a keyset");
        Set keys = employee1.keySet();
        for(Object key : keys){
            Object e = employee1.get(key);
            System.out.println(e);
        }
}
}
