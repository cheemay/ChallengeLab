/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Dell
 */
public class EqualityDemo {
    public static void main(String[] args) {
//        String s1 = "Hello";
//        String s2 = "Hello";
//        if (s1.equals(s2)){
//            System.out.println("String are equals");
//        }else{
//            System.out.println("Strings are not equals");
//        }
        Person p1 = new Person("Yasir" , "Cheema", "333-33-333");
        Person p2 = new Person("yasir", "Cheema" , "333-33-333");
        Person p3 = new Person("Mai", "Xiong", "444-44-444");
        List<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        Set<Person> peopleSet = new HashSet<>(people);
        for (Person p: peopleSet){
            System.out.println(p);
        
//        Set<Person> people = new HashSet<>();
//        people.add(p1);
//        people.add(p2);
//        people.add(p3);
//        for(Person p: people){
//            System.out.println(p);
        }
        
    }
    
}
