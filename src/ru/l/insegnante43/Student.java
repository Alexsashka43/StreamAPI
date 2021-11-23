package ru.l.insegnante43;


import java.util.List;

public class Student extends Course implements IStudent{
    private String name;
    private List<Course> courses;


    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }


    public Student(String name, List<Course> courses) {
        super(name);
        this.courses = courses;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Course> getAllCourses() {
        return courses;
    }
}
