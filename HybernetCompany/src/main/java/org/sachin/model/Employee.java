package org.sachin.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jdk.jfr.Enabled;

import java.sql.Date;


@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "employee_id")
    private int emp_id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "hire_date")
    private Date hireDate;
    @Column(name = "job_title")
    private String jobTitle;
    @Column(name = "salary")
    private Double salary;
    @Column(name = "manager_id")
    private Integer managerId;
    @Column(name = "department_id")
    private Integer dept_id;

    public Employee() {
        super();
    }

    public Employee(int emp_id,String fname,
                    String lname, String email,
                    String phoneNumber,Date hire,
                    String jobTitle,Double salary,
                    Integer managerId,Integer dept_id)
                   {
        this.emp_id = emp_id;
        this.firstName = fname;
        this.lastName = lname;
        this.email =email;
        this.phoneNumber = phoneNumber;
        this.hireDate = hire;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.managerId = managerId;
        this.dept_id = dept_id;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int id) {
        this.emp_id = id;
    }
    public void setFirstName(String name) {
        this.firstName = name;
    }
    public void setLastName(String name) {
        this.lastName = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public Double getSalary() {
        return salary;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public  void setPhoneNumber(String number){
        this.phoneNumber = number;
    }


    @Override
    public String  toString() {
        return "[ " + "Employee id : " + this.emp_id + " "
                + ", Name : " + this.firstName  + " "
                + this.lastName + ", email : " + this.email + ", PhoneNumber : "
                + this.phoneNumber + ", Hire Date : " + this.hireDate + " JobTitle : "
                + this.jobTitle + ", Salary : " +  this.salary + ", Manager Id : "
                + this.managerId + ", DepartMent Id : " + this.dept_id + "]";
    }
}

