package ru.l.insegnante43;


public class Course implements ICourse{

    String nameCourse;

    @Override
    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public Course(String nameCourse) {
        this.nameCourse = nameCourse;
    }
}


