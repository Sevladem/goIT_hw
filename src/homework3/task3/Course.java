package homework3.task3;

import java.util.Date;

public class Course {

    private Date startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

    public Course(Date startDate,String name){

    }

    public Course(int hourseDuration, String name, String teacherName){

    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public void setHoursDuration(int hoursDuration) {
        this.hoursDuration = hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
