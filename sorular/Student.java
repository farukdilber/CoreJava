package sorular;

public class Student {
	 private String foreName;
	    private String surName;
	    private int studentID;


	    public Student(String foreName, String surName, int studentID)
	    {
	        this.foreName = foreName;
	        this.surName = surName;
	        this.studentID = studentID;
	    }

	    public String getForeName()
	    {
	        return foreName;
	    }

	    public void setForeName(String foreName)
	    {
	        this.foreName = foreName;
	    }

	    public String getSurName()
	    {
	        return surName;
	    }

	    public void setSurName(String surName)
	    {
	        this.surName = surName;
	    }

	    public int getStudentID()
	    {
	        return studentID;
	    }

	    public void setStudentID(int studentID)
	    {
	        this.studentID = studentID;
	    }

	    @Override
	    public String toString()
	    {
	        return getClass().getSimpleName()+"{" + "foreName=" + foreName + ", surName=" + surName + ", studentID=" + studentID + '}';
	    }

	    public String format()
	    {
	        return String.format("%-5s %-5s \t\t %-5d \n",foreName,surName,studentID);
}
}