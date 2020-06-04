package com.neuedu.personalmanagementsystem.entity;

import java.util.Date;

public class Employee {
    private Integer empId;

    private String empName;

    private Date empHiredate;

    private Integer managerId;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public Date getEmpHiredate() {
        return empHiredate;
    }

    public void setEmpHiredate(Date empHiredate) {
        this.empHiredate = empHiredate;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }
}