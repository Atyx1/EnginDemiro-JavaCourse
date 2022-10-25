package entities;

public class Course {
    static int courseNumber=0;
    private Educator courseEducator;
    private  Category courseCategory;
    private double price;
    private String name;

public Course (Educator courseEducator,Category courseCategory,String name,double price){
    this.setCourseEducator(courseEducator);
    this.setCourseCategory(courseCategory);
    this.name=name;
    this.price=price;
    courseNumber++;

}

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCourseCategory() {
        return courseCategory;
    }

    public void setCourseCategory(Category courseCategory) {
        this.courseCategory = courseCategory;
    }

    public Educator getCourseEducator() {
        return courseEducator;
    }

    public void setCourseEducator(Educator courseEducator) {
        this.courseEducator = courseEducator;
    }
}
