package ru.l.insegnante43;

import java.util.List;

interface IStudent{
    String getName();
    List<Course> getAllCourses();
}
interface ICourse {
    String getNameCourse();
}

