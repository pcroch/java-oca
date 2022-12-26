package Oca.Examen3;

import java.util.*;

class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student[" + name + ", " + age + "]";
    }

//    public boolean equals(Student obj) {
//        if(obj instanceof Student) {
//            Student stud = (Student)obj;
//            if(this.name.equals(stud.name) && this.age == stud.age) {
//                return true;
//            }
//        }
//        return false;
//    }
}

public class Question44 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("James", 25));
        students.add(new Student("James", 27));
        students.add(new Student("James", 25));
        students.add(new Student("James", 25));

        students.remove(new Student("James", 25));
        System.out.println(students.get(0) == students.get(2)); // false
        System.out.println(students.get(0).equals(students.get(2))); // false
        System.out.println(students.get(0).toString().equals(students.get(2).toString())); // true
        for (Student stud : students) {
            System.out.println(stud);
        }
    }

//    public static void main(String[] args) {
//        List<Integer> students = new ArrayList<>();
//        students.add(new Integer("1"));
//        students.add(new Integer("12"));
//        students.add(new Integer("1"));
//        students.add(new Integer("13"));
//
//        System.out.println(students.get(0) == students.get(2));
//        System.out.println(students.get(0).equals(students.get(2)));
//        System.out.println(new Integer("1") == new Integer("1"));
//        System.out.println(new Integer("1").equals(new Integer("1")));
//    }
}
