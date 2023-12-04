package org.opentutorials.javatutorials.generic;
class StudentInfo{
	public int grade;
	StudentInfo(int grade){ this.grade = grade; }
}
class EmployeeInfo{
	public int rank;
	EmployeeInfo(int rank){ this.rank = rank; }
}
class Person{
	public Object info;
	person Object(info) {this.info = info; }
}
public class GenericDemo {
	public static void main(String[] args) {
		person p1 = new person('부장');
		EmployeeInfo ei = (EmployeeInfo)p1.info;
		System.out.println(ei.rank);

	}

}
