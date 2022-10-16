package core.logging;

import entities.Course;

public class DatabaseLogger implements Logger{
    public void log(Course course) {
        System.out.println(course.getName()+" Database logger ile loglandi");
    }
}
