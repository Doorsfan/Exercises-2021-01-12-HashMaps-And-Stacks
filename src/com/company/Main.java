package com.company;

import java.util.HashMap;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        //Initialize the Hashmap that we are going to use for illustrating some method calls
        HashMap<String, Student> students = new HashMap();

        //Put in 4 students that have a social security number and a respective Student
        students.put("19911205-1111", new Student("19911205-1111", "Alan", 29));
        students.put("19701201-2222", new Student("19701201-2222", "Joe", 50));
        students.put("19801001-3333", new Student("19801001-3333", "Tobias", 40));
        students.put("19950822-4444", new Student("19950822-4444", "Ralf",25));

        System.out.println("Getting student with Social Security number of: 19911205-1111");
        Student Alan = students.get("19911205-1111");

        //When we print out an element, it defaults to providing info with it's toSTring() method
        //All objects in Java inherit from the Object class, which contains a toString() method, so we can override it
        //to utilize other string presentations of our liking
        System.out.println(Alan);


        System.out.println();

        //Illustrating removing from an HashMap
        System.out.println("Removing " + students.get("19701201-2222").getName());
        students.remove("19701201-2222");

        //Illustrating looping through a hashmap with using keySet()
        System.out.println("Printing out social security numbers in students.");
        for(String personNummer : students.keySet()){
            System.out.println(personNummer);
        }

        //Illustrating looping through a hashmap with using values()
        System.out.println("Printing out information about each student in students.");
        for(Student person : students.values()){
            System.out.println(person.toString());
        }
        System.out.println();

        //Exercises for Stacks

        //Intialize our Stack of Students
        Stack<Student> myStudents = new Stack<>();
        myStudents.push(new Student("20000810-5555", "Bert", 20));
        //Since we need an object to actually search for it in a Stack, i save Sofia before putting her
        // in the stack, so we can search for her
        Student sofia = new Student("20000825-6666", "Sofia", 20);
        myStudents.push(sofia);

        myStudents.push(new Student("20000102-8888", "Johanna", 21));

        //Illustrating usage of peek() on a Stack
        System.out.println("Peeking at top element of Stack: \n" + myStudents.peek());

        //Illustrating usage of search() on a Stack, which requires the object to be searched for
        System.out.println(myStudents.search(sofia));

        //Illustrating the usage of pop() with a while loop and size() of Stack
        //When the object is returned from pop(), and used in System.out.println, it's implicitly
        //converted to a String, with it's toString() method
        while(myStudents.size() > 0){
            System.out.println(myStudents.pop());
        }
    }
}