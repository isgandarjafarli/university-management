package model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    
    // Fields for the Department class
    private String departmentName;
    private List<Employee> employees;  // List of employees in the department
    private List<Course> courses;      // List of courses offered by the department

    // Constructor to initialize the department name and empty lists for employees and courses
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    // Getter for the department name
    public String getDepartmentName() {
        return departmentName;
    }

    // Method to add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Method to remove an employee from the department
    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    // Method to get a list of all employees in the department
    public List<Employee> getEmployees() {
        return employees;
    }

    // Method to add a course to the department
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Method to get a list of all courses offered by the department
    public List<Course> getCourses() {
        return courses;
    }

    // Method to find an employee by their position
    public Employee findEmployeeByPosition(String position) {
        for (Employee employee : employees) {
            if (employee.getPosition().equalsIgnoreCase(position)) {
                return employee;
            }
        }
        return null;  // No employee found with the given position
    }

    // Optionally, you can add more methods for managing the department's operations
}
