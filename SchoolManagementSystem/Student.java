package SchoolManagementSystem;
/**This class is responsible for keeping the
*track of students fees,name,grade & fees paid
*/
public class Student {
private int id;
private String name;
private int grade;
private int feesPaid;
private int feesTotal;
/**
 * Fees for every student is 30.000$
 * Fees paid initially is 0
 * @param id id for the student unique
 * @param name name of the student
 * @param grade grade of the student
 */
public Student(int id,String name,int grade) {
	this.feesPaid=0;
	this.feesTotal=30000;
	this.id=id;
	this.name=name;
	this.grade = grade;
}
//Not going to alter students name and students ID.
/**
 * Used to update the student's grade
 * @param grade new grade of the student
 */
public void setgrade(int grade) {
	this.grade=grade;
}
/**
 * Keep adding the fees to feesPaid field
 * Add the fees to fees paid
 * The school is going receive the funds.
 * 
 * @param fees the fees the student pays
 */
public void uptadeFeesPaid(int fees) {
	feesPaid+=fees;
}
}
