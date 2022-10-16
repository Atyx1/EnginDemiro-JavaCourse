package core.logging;

import entities.Course;

public class EmailLogger implements  Logger{
    public void log(Course course) {
        System.out.println(course.getName()+" Email logger ile loglandi");
    }
}
