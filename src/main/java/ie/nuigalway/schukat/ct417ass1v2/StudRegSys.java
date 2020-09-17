/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.schukat.ct417ass1v2;

import ie.nuigalway.schukat.ct417ass1v1.*;
import java.util.Date;
import java.util.HashSet;
import org.joda.time.DateTime;


/**
 *
 * @author Michael
 */
public class StudRegSys {
   final private HashSet<Course> allCourses;
   final private HashSet<Student> allStudents;
   final private HashSet<Subject> allSubjects;
   
   public StudRegSys() {
       allCourses = new HashSet<Course>();
       allStudents = new HashSet<Student>();
       allSubjects = new HashSet<Subject>();
   }
   
   public void addCourse(String name, DateTime start, DateTime end) {
       Course a = new Course(name, start, end);
       allCourses.add(a);
   }
   
   public void addStudent(String name, Date dob, int id, String username) {
       Student s = new Student(name, dob, id, username);
       allStudents.add(s);
   }
   
   public void addSubject(String name) {
       Subject s = new Subject(name);
       allSubjects.add(s);
   }
}
