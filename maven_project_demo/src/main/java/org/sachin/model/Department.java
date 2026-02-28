package org.sachin.model;

public class Department {
    private int dept_id;
    private String departmentName;
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
