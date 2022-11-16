package kodlama.io.oopWithLayered.webApi.controllers;

import kodlama.io.oopWithLayered.business.abstracts.CourseService;
import kodlama.io.oopWithLayered.entities.concretes.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api/course")
public class CourseControllers {
    private CourseService courseService;
     @Autowired
    public CourseControllers(CourseService courseService) {
        this.courseService = courseService;
    }
     @GetMapping(path="/getAll")
      public void getAll()  {
         this.courseService.getAll();
      }
      @PostMapping(path="/add")
    public void add(Course course) throws Exception {
         this.courseService.addCourse(course);
      }
      @DeleteMapping(path="/delete")
      public void delete(int id){
         this.courseService.delete(id);
      }
      @PutMapping(path="/update")
     public void update(int id, Course course) {
         this.courseService.update(id,course);
     }





}
