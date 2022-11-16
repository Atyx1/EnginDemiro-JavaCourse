package kodlama.io.oopWithLayered.dataAcces.abstracts;

import kodlama.io.oopWithLayered.entities.concretes.Course;

import java.util.List;

public interface CourseRepository {
    List<Course> getAll();

    void add(Course course);
    Course getCourse(int id);
    void delete (int id );

    void update(int id, Course course);
}
