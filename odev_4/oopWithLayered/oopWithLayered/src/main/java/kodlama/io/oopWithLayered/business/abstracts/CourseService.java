package kodlama.io.oopWithLayered.business.abstracts;

import kodlama.io.oopWithLayered.dataAcces.concretes.InMemoryBrandRepository;
import kodlama.io.oopWithLayered.entities.concretes.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAll();
    void addCourse(Course course) throws Exception;
    void delete (int id );
    void update (int id,Course course);
}
