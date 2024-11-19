import java.util.Scanner;
public class calculator
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        //Enter the total number of subjects you have
        System.out.println("Enter the total no of subjects");
        int subjectnum=sc.nextInt();
        int totalmarks=0;
        for(int i=1;i<=subjectnum;i++)
        {
            System.out.println("please enter the marks of subject " +  i + "(out of 100): ");
             totalmarks +=sc.nextInt();
        }
            //To calculate the percentage of average
            double averagepercent=(double)totalmarks/subjectnum;
            // To calculate grade
            char grade;
            if(averagepercent>=90)
            {
                grade='A';
             }
             else if(averagepercent>=80)
             {
                grade='B';
             }
             else if(averagepercent>=70)
             {
                grade='C';
             }
             else if(averagepercent>=60)
             {
                grade='D';
             }
             else
             {
                grade='F';
            }
            //To display the final result
            System.out.println("your result is:");
            System.out.println("your totalmarks is:%.2f\n"+totalmarks);
            System.out.println("your averagepercentage is:%.2f%%\n"+averagepercent);
            System.out.println("And your grade is:"+grade);
        
            sc.close();

        }

    }
    
