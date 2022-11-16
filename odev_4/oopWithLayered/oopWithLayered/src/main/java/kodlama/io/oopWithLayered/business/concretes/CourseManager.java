package kodlama.io.oopWithLayered.business.concretes;

import kodlama.io.oopWithLayered.business.abstracts.CourseService;
import kodlama.io.oopWithLayered.dataAcces.abstracts.CourseRepository;
import kodlama.io.oopWithLayered.dataAcces.concretes.InMemoryBrandRepository;
import kodlama.io.oopWithLayered.entities.concretes.Course;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseManager implements CourseService {
    private CourseRepository courseRepositoryInmemory ;
    private Course course;




    @Override
    public List<Course> getAll() {


        return this.courseRepositoryInmemory.getAll();
    }

    @Override
    public void addCourse(Course course) throws Exception {
        for (Course coursee: this.courseRepositoryInmemory.getAll()) {
            if(coursee.getName()!=course.getName()){
                this.courseRepositoryInmemory.add(course);
            }
            else{
                throw new Exception("the course is not added, there is a course with the same name");
            }
        }





    }

    @Override
    public void delete(int id) {
        this.courseRepositoryInmemory.delete(id);
    }



    @Override
    public void update(int id, Course course) {
          for (Course coursee: this.courseRepositoryInmemory.getAll())     {
              if(coursee.getCourseId()==course.getCourseId()){
                  this.courseRepositoryInmemory.update(id,course);
              }
          }

    }
}
