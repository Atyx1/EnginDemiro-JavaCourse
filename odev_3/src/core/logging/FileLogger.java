package core.logging;

import entities.Course;

public class FileLogger implements Logger{
    @Override
    public void log(Course course) {
        System.out.println(course.getName()+" File logger ile loglandi");
    }
}
