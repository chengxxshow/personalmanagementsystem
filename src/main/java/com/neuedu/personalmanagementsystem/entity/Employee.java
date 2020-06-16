package com.neuedu.personalmanagementsystem.entity;

import java.util.Date;

public class Employee {
    private Integer id;

    private String empno;

    private String ename;

    private Date hiredate;

    private Date birthday;

    private String job;

    private Integer gender;

    private Integer status;

    private Integer deptno;

    private Date departuredate;

    private String eduback;

    private String notes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno == null ? null : empno.trim();
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename == null ? null : ename.trim();
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public Date getDeparturedate() {
        return departuredate;
    }

    public void setDeparturedate(Date departuredate) {
        this.departuredate = departuredate;
    }

    public String getEduback() {
        return eduback;
    }

    public void setEduback(String eduback) {
        this.eduback = eduback == null ? null : eduback.trim();
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empno='" + empno + '\'' +
                ", ename='" + ename + '\'' +
                ", hiredate=" + hiredate +
                ", birthday=" + birthday +
                ", job='" + job + '\'' +
                ", gender=" + gender +
                ", status=" + status +
                ", deptno=" + deptno +
                ", departuredate=" + departuredate +
                ", eduback='" + eduback + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}