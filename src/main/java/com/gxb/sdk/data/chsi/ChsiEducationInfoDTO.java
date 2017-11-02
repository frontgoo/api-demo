package com.gxb.sdk.data.chsi;


import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class ChsiEducationInfoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 入学时间
     */
    private Date enrolDate;

    /**
     * 毕（结）业时间
     */
    private Date graduateDate;

    /**
     * 毕业院校
     */
    private String university;

    /**
     * 专业
     */
    private String major;

    /**
     * 学历类别
     */
    private String degreeType;

    /**
     * 学制
     */
    private Double schoolYears;

    /**
     * 学习形式（普通全日制）
     */
    private String educationStyle;

    /**
     * 学历层次
     */
    private String degree;

    /**
     * 校（院）长姓名
     */
    private String headmaster;

    /**
     * 毕结业结论
     */
    private String result;

    /**
     * 证书编号
     */
    private String certificateNo;

    /**
     * 最高学历标识(1:是;0 非)
     */
    private Integer highestEduFlag;

    /**
     * 毕业照
     */
    private String graduationPhoto;

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

    public Date getEnrolDate() {
        return enrolDate;
    }

    public void setEnrolDate(Date enrolDate) {
        this.enrolDate = enrolDate;
    }

    public Date getGraduateDate() {
        return graduateDate;
    }

    public void setGraduateDate(Date graduateDate) {
        this.graduateDate = graduateDate;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public Double getSchoolYears() {
        return schoolYears;
    }

    public void setSchoolYears(Double schoolYears) {
        this.schoolYears = schoolYears;
    }

    public String getEducationStyle() {
        return educationStyle;
    }

    public void setEducationStyle(String educationStyle) {
        this.educationStyle = educationStyle;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getHeadmaster() {
        return headmaster;
    }

    public void setHeadmaster(String headmaster) {
        this.headmaster = headmaster;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo;
    }

    public Integer getHighestEduFlag() {
        return highestEduFlag;
    }

    public void setHighestEduFlag(Integer highestEduFlag) {
        this.highestEduFlag = highestEduFlag;
    }

    public String getGraduationPhoto() {
        return graduationPhoto;
    }

    public void setGraduationPhoto(String graduationPhoto) {
        this.graduationPhoto = graduationPhoto;
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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}