package business;

import core.logging.Logger;
import dataAcces.CourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private Course course;

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
                if (courseAdd.getPrice()<=0) {
                    System.out.println("!!!!!!!!!!!!!!!!!");
                    throw new Exception("Kursa ismi ayni olamaz ve 0 dan dusuk bir fiyatta kurs yayinlayamazsiniz ");
                } else {
                    throw new Exception("Kurs ismi önce yayinladiğiniz kurslardan herhangi biri ile ayni olamaz");
                }

            } else {
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


}
