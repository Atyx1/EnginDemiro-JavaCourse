import business.CategoryManager;
import business.CourseManager;
import core.logging.DatabaseLogger;
import core.logging.EmailLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import dataAcces.HibernateCourseDao;
import entities.Category;
import entities.Course;
import entities.Educator;

public class Main {
    public static void main(String[] args) throws Exception {
         Logger[] loggers= {new DatabaseLogger(),new EmailLogger()};
      Category category = new Category("Backend");
      Educator educator = new Educator("Engin demirog",3);
        Educator educator1 = new Educator("Mustafa Coskun",3);
        Educator educator2 = new Educator("Bahriye Akaya",3);
      Course course = new Course(educator,category,"JAVA",150);
        Course course_1 = new Course(educator,category,"JAVA",0);
        Course course_2 = new Course(educator2,category,"C#",12);
        Course course_3 = new Course(educator1,category,"PHP",34);

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);


        courseManager.add(course_2);
        courseManager.add(course);
        courseManager.add(course_1);

        courseManager.add(course_3);




    }
}
