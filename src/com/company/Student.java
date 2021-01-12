package com.company;

/**
 * A basic Student class, used for Illustrating Stack and HashMap interactions/functions
 */
public class Student {
    private String personNummer, name;
    private int age;


    /**
     * Basic constructor for a Student
     * @param personNummer String: Social security number
     * @param name String: Name of the student
     * @param age Int: Age of the student
     */
    public Student(String personNummer, String name, int age){
        this.personNummer = personNummer;
        this.name = name;
        this.age = age;
    }

    /**
     * When an object is implicitly converted to a String, such as when printing out,
     * this method is called upon to give information about the object.
     * Since every Object in Java inherits from the Object class, we can override
     * it's toString() to give our own version of toSTring()
     * @return String: Information about the object
     */
    @Override
    public String toString() {
        return (this.name + " is a student, his/her social security number is: " + this.personNummer + "\n" + this.name + " is " + this.age + " years old.");
    }

    /**
     * Getter for the name of the Student
     * @return String: Name of the Student
     */
    public String getName(){
        return this.name;
    }

    /**
     * Getter for the social security number of the Student
     * @return String: The social security number of the student
     */
    public String getPersonNummer(){
        return this.personNummer;
    }

    /**
     * Getter for the age of the student
     * @return Int: The age of the student
     */
    public int getAge(){
        return this.age;
    }
}
