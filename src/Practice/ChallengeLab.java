/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import Sortabel.maps.TreeMap;
import common.Employee;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Dell
 */
public class ChallengeLab {
    public static void main(String[] args) {
        Employee e1 = new Employee("Cheema", "Yasir", "222-22-2222");
        Employee e2 = new Employee("Smith","John","333-33-3333");
        Employee e3 = new Employee("Cheema","Yasir","222-22-2222");
        Employee e4 = new Employee("Elvardo", "Rick","111-11-1111");
        //Generic way
        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        //Generic way of Map 
        Map<String,Employee> employee1 = new HashMap<>();
        employee1.put("222-22-2222",e1);
        employee1.put("333-33-3333", e2);
        employee1.put("222-22-2222", e3);
        employee1.put("111-11-1111", e4);
        
        //now retrieve one by its key
        Employee emp = employee1.get("222-22-2222");
        System.out.println("Found employee with a key 222-22-2222" +emp);
        //throw loop
//        System.out.println("Sort by natural order ");
//        Collection<Employee> values = employee1.values();
//        for(Employee e : values){
//            System.out.println(e);
//        }

        
        
        //With set way
        System.out.println("Using a keyset");
        Set<String> keys = employee1.keySet();
        for(String key : keys){
            Employee e = employee1.get(key);
            System.out.println(e);
            
            System.out.println("using a keyset, get the employee sorted by key (ssn)");
            Map<String,Employee> map = new TreeMap<String,Employee>();
            Set<String> keys2 = map.keySet();
            for(String key1 : keys2){
                Employee found = map.get(key);
                System.out.println(found.toString());
          }
        
//        Employee employee = (Employee)employee1.get("222-22-2222");
//        System.out.println("The ssn is: " + employee.getSsn());
        
//        Set<Employee> employee2 = new HashSet(employees);
//        employees.clear();
//        employees.addAll(employee2);
//        //Loop for a generic way
//        for(Employee e : employees){
//            System.out.println(e.getFirstName() + " " + e.getLastName()+ 
//                    "  SSN: " + e.getSsn());
        }
    }
}
