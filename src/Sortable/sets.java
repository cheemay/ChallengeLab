/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sortable;

import common.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Dell
 */
public class sets {
    public static void main(String[] args) {
        Employee e1 = new Employee("Cheema", "Yasir", "222-22-2222");
        Employee e2 = new Employee("Smith","John","333-33-3333");
        Employee e3 = new Employee("Cheema","Yasir","222-22-2222");
        Employee e4 = new Employee("Elvardo", "Rick","111-11-1111");
        
        //Sort them in a TreeSet.which remove duplicates and sorts
        Set<Employee> set = new TreeSet<Employee>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        
        //first get the size of the set
        //it remove the duplicates
        System.out.println("The size of the sorted set is: "+ set.size());
        for(Employee e : set){
            System.out.println(e);
        }
        
        //non generic way 
        System.out.println("using Non Generic way of TreeSet ");
        Set set1 = new TreeSet();
        set1.add(e1);
        set1.add(e2);
        set1.add(e3);
        set1.add(e4);
        
        System.out.println("Using non Generic way the TreeSet size " + set1.size());
        
        }
        
    }
    

