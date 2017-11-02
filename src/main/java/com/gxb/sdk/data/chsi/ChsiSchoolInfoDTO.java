package com.gxb.sdk.data.chsi;


import java.io.Serializable;
import java.util.Date;

/**
 * @author
 */
public class ChsiSchoolInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别,0(未知)、1(男)、2（女）
     */
    private Integer sex;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 民族
     */
    private String nation;

    /**
     * 证件号码
     */
    private String credentialsNum;

    /**
     * 毕业院校
     */
    private String university;

    /**
     * 学历层次
     */
    private String degree;

    /**
     * 专业
     */
    private String major;

    /**
     * 学制
     */
    private Double schoolYears;

    /**
     * 学历类别
     */
    private String degreeType;

    /**
     * 学习形式（普通全日制）
     */
    private String educationStyle;

    /**
     * 分院
     */
    private String branch;

    /**
     * 系（所、函授站）
     */
    private String series;

    /**
     * 班级
     */
    private String className;

    /**
     * 学号
     */
    private String studentNum;

    /**
     * 入学时间
     */
    private Date enrolDate;

    /**
     * 毕业时间
     */
    private Date graduateDate;

    /**
     * 学籍状态
     */
    private String status;

    /**
     * 毕业照
     */
    private String graduationPhoto;

    /**
     * 录取照片
     */
    private String enrolPhoto;

    private Date createdAt;

    private Date updatedAt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getCredentialsNum() {
        return credentialsNum;
    }

    public void setCredentialsNum(String credentialsNum) {
        this.credentialsNum = credentialsNum;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Double getSchoolYears() {
        return schoolYears;
    }

    public void setSchoolYears(Double schoolYears) {
        this.schoolYears = schoolYears;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getEducationStyle() {
        return educationStyle;
    }

    public void setEducationStyle(String educationStyle) {
        this.educationStyle = educationStyle;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public Date getEnrolDate() {
        return enrolDate;
    }

    public void setEnrolDate(Date enrolDate) {
        this.enrolDate = enrolDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGraduationPhoto() {
        return graduationPhoto;
    }

    public void setGraduationPhoto(String graduationPhoto) {
        this.graduationPhoto = graduationPhoto;
    }

    public String getEnrolPhoto() {
        return enrolPhoto;
    }

    public void setEnrolPhoto(String enrolPhoto) {
        this.enrolPhoto = enrolPhoto;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Date getGraduateDate() {
        return graduateDate;
    }

    public void setGraduateDate(Date graduateDate) {
        this.graduateDate = graduateDate;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}