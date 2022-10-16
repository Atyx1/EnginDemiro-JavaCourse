package dataAcces;

import entities.Course;

public class HibernateCourseDao implements  CourseDao{
    @Override
    public void addDatabase(Course course) {
        System.out.println(course.getPrice()+" fiyatli "+course.getName()+" kursu "+ course.getCourseCategory()+"kategorisinde "+" Hibernate ile database eklendi ");
    }
}
