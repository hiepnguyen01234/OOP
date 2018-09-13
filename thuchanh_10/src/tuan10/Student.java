package tuan10;

import tuan10.MyException;

public class Student {
	public String studentId;
	public String studentName;
	public float score;
	
	public String getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public float getScore() {
		return score;
	}
	public void setStudentId(String i) {
		studentId =i;
	}
	public void setStudentName(String n) {
		studentName =n;
	}
	public void setScore(float s) {
		score =s;
	}
	
	public Student(String i ,String n ,float s) throws MyException{
		throw new MyException(i,n);
	}
	public String getDetail() {
		return ("student id : "+getStudentId()+"student name : "+getStudentName()+"score : "+getScore());
	}

}
