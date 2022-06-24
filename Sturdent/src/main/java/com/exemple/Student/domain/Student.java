package com.exemple.Student.domain;
imoprt javax.persistence.Entity;
@Entity
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String studentName;
    private String course;
    private int fee;
    public Student(){
        super();
    }
    public Student(Long id, String studentName, String course, int fee){
        super();
        this.id = id;
        this.studentName = studentName;
        this.course = course;
        this.fee = fee;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String setCourse(String course){
        return course = course;
    }
    public int getFee(){
        return fee;
    }
    public void setFee(int fee){
        this.fee = fee;
    }
}