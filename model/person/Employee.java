package model.person;

import java.time.LocalDate;
import java.util.ArrayList;
import model.Course;
import model.Department;
import model.Room;
import util.Enums.FacultyType;

public interface Employee {
    int getId();
    String getFullName();
    LocalDate getHireDate();
    boolean isAvailable();
    
    Department getDepartment();
    FacultyType getPosition();
    Room getOfficeLocation();
    ArrayList<Course> getCoursesTaught();
    
    void assignCourse(Course course);
    void setDepartment(Department department);
    void setPosition(FacultyType position);
    void setOfficeLocation(Room office);
    void setHireDate(LocalDate hireDate);
}
