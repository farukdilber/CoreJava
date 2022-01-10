package sorular;

import java.util.Scanner;

public class RegistryInterface{

    private Registry theRegistry = new Registry();
    Scanner input = new Scanner(System.in);

    public RegistryInterface(Registry theRegistry)
    {
    
  doMenu();
    }
    public void doMenu()
    {
        boolean done = false;

        while (!done)
        {
            try
            {
                System.out.println("\nRegistry Main Menu\n*******************\n");
                System.out.println("1. Add a Student \n2. Delete a Student"
                        + "\n3. Print Registry\n0. Quit");

                System.out.println("Select Option [1, 2, 3, 0] :>");
                String userDecission = input.nextLine();

                int decission = Integer.parseInt(userDecission);

                switch (decission)
                {
                    case 0:
                        System.out.println("System Closing Down..");
                        break;

                    case 1:
                        doAddStudent();
                        break;

                    case 2:
                        doDeleteStudent();
                        break;

                    case 3:
                        doPrintRegistry();
                        break;

                    default:
                        System.out.println("\nPlease Enter in a valid"
                                + " Menu Option");
                        doMenu();
                        break;
                }
                done = true;
            }catch(Exception e)
            {
                System.out.println("Incorrect Value Entered, Try Again....");
            }
        }
    }


private void doAddStudent()
    {
        String addMore;
        do
        {
            System.out.println("\nAdd New Student\n***********\n");

            try
            {
                System.out.println("Enter Students Forename :>");
                String fName = input.next();

                System.out.println("Enter Student Surname :>");
                String sName = input.next();

                System.out.println("Enter Student ID Number :>");
                int idNum = input.nextInt();

                theRegistry.addStudent(new Student(fName, sName, idNum));

            } catch (Exception e)
            {
                System.out.println("\nERROR OCCURED: Incorect Value Entered"
                        + "\nTry Again... \nStudent Was NOT added");
            }


            System.out.println("\nAdd Another Student (Y/N) : >");
            addMore = input.next();



        } while (!"n".equals(addMore));
    }

    private void doDeleteStudent()
    {
        String another;
        do
        {
            System.out.println("\nDelete Student\n***********\n");
            System.out.println("Enter Student ID To Delete :>");
            try
            {
                int studID = input.nextInt();
                theRegistry.deleteStudent(studID);

            } catch (Exception e)
            {
                System.out.println("\nERROR OCCURED: Incorect Value Entered"
                        + "\nTry Again...\n");
            }

            System.out.println("\nDelete Another? (Y/N)");
            another = input.next();


        } while (!"n".equals(another));
    }

    private void doPrintRegistry()
    {

        System.out.println("\nPrinting Registry\n***********\n");

        if(theRegistry.studentList.size() == 0)
        {
            System.out.println("The Student Record System Contains No Student"
                    + " Records, Please Add Students\n\n");
        }else if (theRegistry.studentList.size() > 0) {
        	 System.out.println("The Student Record System Contains : ");
		}
        
        else
        {
           System.out.println(theRegistry.format()); 
            System.out.println("\n****Printing Finished........");
        }

        doMenu();

    }
     
    
    
}
