package org.sachin.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
    @Id
    @Column(name = "department_id")
    private int dept_id;
    @Column(name = "department_name")
    private String departmentName;
    @Column(name = "manager_id")
    private Integer managerId;

    public Department() {
        super();
    }
    public Department(int dept_id,
                      String departmentName,
                      Integer managerId) {
        this.departmentName = departmentName;
        this.dept_id = dept_id;
        this.managerId = managerId;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public int getDept_id() {
        return dept_id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public Integer getManagerId() {
        return managerId;
    }

    @Override
    public String toString() {
        return "[" + " Department Id : " + this.dept_id
                + " ,Department Name : " + this.departmentName
                + " , Manager ID : " + this.managerId + " ]";
    }
}
