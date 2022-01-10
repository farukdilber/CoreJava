package sorular;

import java.util.Iterator;
import java.util.LinkedList;

public class Registry {
	 public LinkedList<Student> studentList = new LinkedList<>();
	    public Iterator<Student> iter = studentList.iterator();

	    public Registry()
	    {
	    }

	    public void addStudent(Student aStudent)
	    {
	        Iterator<Student> addIterator = studentList.iterator();

	        while (addIterator.hasNext())
	        {
	            Student ob = addIterator.next();
	            if (ob.getStudentID() == aStudent.getStudentID())
	            {
	                System.out.println("This Student ID "
	                        + ""+ aStudent.getStudentID()+ " Is Already Used"
	                        + "\n Try Adding Again......");
	                return;
	            }
	        }
	        System.out.println("Student "+ aStudent.getForeName() + " "
	                + "" + aStudent.getSurName() +" "
	                + "Successfully Added To System.....");

	        studentList.addLast(aStudent);
	    }

	    public void deleteStudent(int studentID)
	    {
	        Iterator<Student> deleteIterator = studentList.iterator();
	        boolean removed = false;

	        while(deleteIterator.hasNext())
	        {
	            Student ob = deleteIterator.next();

	            if(ob.getStudentID() == studentID)
	            {
	                deleteIterator.remove();
	                removed = true;
	                System.out.println(ob.getForeName() + " " + ob.getSurName() + " Was Succesffully Removed from System. \n");
	            }
	        }
	        if(!removed)
	        {
	            System.out.println("Student ID not found");
	        }
	    }

	    public String format()
	    {
	        StringBuilder sB = new StringBuilder();
	        Iterator<Student> formatIterator = studentList.iterator();

	        while(formatIterator.hasNext())
	        {
	            Student ob = formatIterator.next();
	            sB.append(ob.format());      
	        }
	        return sB.toString();
	    }

	    @Override
	    public String toString()
	    {
	        Iterator<Student> toStringIterator = studentList.iterator();
	        StringBuilder sB = new StringBuilder();

	        while(toStringIterator.hasNext())
	        {
	            Student ob = toStringIterator.next();
	            sB.append(ob.toString()).append("\n");
	        }
	        return sB.toString();
}
}