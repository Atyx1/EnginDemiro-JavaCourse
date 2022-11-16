package kodlama.io.oopWithLayered.dataAcces.concretes;

import kodlama.io.oopWithLayered.business.abstracts.CourseService;
import kodlama.io.oopWithLayered.dataAcces.abstracts.CourseRepository;
import kodlama.io.oopWithLayered.entities.concretes.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryBrandRepository implements CourseRepository {

   List<Course>  courses;

    public InMemoryBrandRepository() {

        courses=new ArrayList<Course>();
        courses.add(new Course("JAVA",24.99,"Ahmet Güneş",1));
        courses.add(new Course("C#",25.99,"Engin Demirog",2));
        courses.add(new Course("PHP",30.99,"Mustafa Can",3));
        courses.add(new Course("KOTLİN",45.99,"Selami Vurdan",4));



    }



    @Override
    public List<Course> getAll() {
        return courses;
    }
    public void add(Course course){
        this.courses.add(course);
    }
    @Override
    public Course getCourse(int id){
     return courses.stream().filter(course -> course.getCourseId() == id).findFirst().get();
    }
    @Override
    public void delete (int id ){
        Course course =getCourse(id);
        this.courses.remove(course);
    }

    @Override
    public void update(int id, Course course) {
       Course course1= courses.stream().filter(Course -> course.getCourseId() == id).findFirst().get();
        course1 = new Course(course);

    }
}
