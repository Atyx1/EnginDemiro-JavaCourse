package kodlama.io.oopWithLayered.entities.concretes;

import org.springframework.beans.factory.annotation.Autowired;

public class Course {
    private String name;
    private double unitPrice;
    private int courseId;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    private String educator;

    @Autowired
    public Course(Course course) {
    }

    @Autowired
    public Course(String name, double unitPrice, String educator,int courseId) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.educator= educator;
        this.courseId=courseId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) throws Exception {

        if(unitPrice<=0){
        throw new Exception("course's unitprice cannot be smaller than zero or equals ");
        }
        else{
            this.unitPrice=unitPrice;

        }
    }



    public String getEducator() {
        return educator;
    }

    public void setEducator(String educator) {
        this.educator = educator;
    }
}
