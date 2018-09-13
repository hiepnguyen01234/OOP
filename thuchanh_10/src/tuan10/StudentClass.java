package tuan10;

public class StudentClass {
	public String classId;
	public String className;
	
	public String getClassId() {
		return classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassId(String i) {
		classId =i;
	}
	public void setClassName(String n) {
		className =n;
	}
	
	public StudentClass(String i ,String n) throws MyException{
		throw new MyException(i,n);
	}
	public addStudent(Student student) throws MyException{
		throw new MyException(student.getDetail());
	}
	public add(int index ,Student student) throws MyException{
		throw new MyException(index);
	}
	public boolean update(Student) throws MyException{
		return true;
	}
	public Student remove() throws MyException {
		
	}
	public remove(Student student) throws MyException{
		
	}
	public Student remove(int index) throws MyException{
		
	}
	public String getDetail() {
		
	}

}
