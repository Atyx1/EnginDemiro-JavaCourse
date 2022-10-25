package business;

import core.logging.Logger;
import dataAcces.CourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private Course course;
    private CategoryManager categoryManager;
    private CourseDao courseDao;

    private Logger [] loggers;

    List<String>  courseArraylist = new ArrayList<String>();

    public CourseManager(CourseDao courseDao,Logger[] loggers){
        this.courseDao=courseDao;
        this.loggers=loggers;



    }

    public void add(Course courseAdd) throws Exception {
        if (courseArraylist.isEmpty() == true) {
            courseArraylist.add(courseAdd.getName());
            System.out.println("*************");
            courseDao.addDatabase(courseAdd);
            for (Logger logger :
                    loggers) {
                logger.log(courseAdd);
            }
            System.out.println("*************");


        } else {

            if (courseArraylist.contains(courseAdd.getName())) {

                    if (courseAdd.getPrice() <= 0) {
                        System.out.println("!!!!!!!!!!!!!!!!!");
                        showException("Course Name","Course Price ");

                    } else {
                       showException("Course Name");

                    }
                }

            else {
                courseArraylist.add(courseAdd.getName());
                System.out.println("*************");
                courseDao.addDatabase(courseAdd);
                for (Logger logger :
                        loggers) {
                    logger.log(courseAdd);
                }
                System.out.println("*************");
            }

        }
    }

public void showException(String mesaj) throws Exception {
        throw new Exception(mesaj+"FAULT");

}
    public void showException(String mesaj,String mesaj2) throws Exception {
        throw new Exception(mesaj+" FAULT "+mesaj2+"FAULT");
    }
    public void showException(String mesaj,String mesaj2,String mesaj3) throws Exception {
        throw new Exception(mesaj+"FAULT "+mesaj2+"FAULT"+mesaj3+"FAULT");
    }
}
