package com.huseyinuslu.java101;

import com.huseyinuslu.java101.model.Course;
import com.huseyinuslu.java101.model.Student;
import com.huseyinuslu.java101.model.Teacher;


public class Main {
    /**
     * The program That calculates if students pass the class
     * @Author Huseyin Uslu
     * @Since 18.12.2021
     */

    public static void main(String[] args){

            Course mat = new Course("Matematik", "MAT101", "MAT");
            Course fizik = new Course("Fizik", "FZK101", "FZK");
            Course kimya = new Course("Kimya", "KMY101", "KMY");

            Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
            Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
            Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

            mat.addTeacher(t1);
            fizik.addTeacher(t2);
            kimya.addTeacher(t3);

            Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
            s1.addEntireExamNote(50,20,40);
            s1.addEntirePracticeNote(60,30,50);
            s1.isPass();

            Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
            s2.addEntireExamNote(100,50,40);
            s2.addEntirePracticeNote(90,40,54);
            s2.isPass();

            Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
            s3.addEntireExamNote(50,20,40);
            s3.addEntirePracticeNote(40,50,60);
            s3.isPass();

        }
    }







