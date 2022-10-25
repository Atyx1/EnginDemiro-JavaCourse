package business;

import core.logging.Logger;
import entities.Category;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    List<String> categoryName = new ArrayList<String>();
    private  CourseManager courseManager;

    public void showExceptions() throws Exception {
        throw new Exception("Kategori ismi aynı olamaz");
    }


    public void nameCheck(Course course,Category category) throws Exception {
        if (categoryName.isEmpty() == true) {
            categoryName.add(category.getCategoryName());

           courseManager.add(course);


        } else {

            if (categoryName.contains(category.getCategoryName())) {
                      courseManager.showException("Category Name");
            } else {

            categoryName.add(category.getCategoryName());
                courseManager.add(course);
            }

        }

    }

}





