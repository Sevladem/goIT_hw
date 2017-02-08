package homework3;

import java.util.Date;

public class Solution {

    public static void main(String[] args) {

        Course course1 = new Course(new Date(),"course1");
        Course course2 = new Course(new Date(),"course2");
        Course course3 = new Course(new Date(),"course3");
        Course course4 = new Course(new Date(),"course4");
        Course course5 = new Course(new Date(),"course5");

        Course[] courses = {course1,course2,course3,course4,course5};

        Student student1 = new Student("Ann","Smith",8);
        Student student2 = new Student("Smith",courses);

        CollegeStudent collegeStudent1 = new CollegeStudent("Jack","Daniels",7);
        CollegeStudent collegeStudent2 = new CollegeStudent("Daniels",courses);
        CollegeStudent collegeStudent3 = new CollegeStudent("Jack","Daniels",7,"KPI",1,1);

        SpecialStudent specialStudent1 = new SpecialStudent("Jim","Beam",5);
        SpecialStudent specialStudent2 = new SpecialStudent("Beam",courses);
        SpecialStudent specialStudent3 = new SpecialStudent("Jack","Daniels",7,"KPI",1,1,458333575);

    }
}
