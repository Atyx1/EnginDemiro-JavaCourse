package dataAcces;

import entities.Course;

public class JdbcCourseDao implements CourseDao{

    @Override
    public void addDatabase(Course course) {
        System.out.println(course.getPrice()+" fiyatli "+course.getName()+" kursu "+ course.getCourseCategory()+"kategorisinde "+ " Jdbc ile database eklendi ");
    }
}
