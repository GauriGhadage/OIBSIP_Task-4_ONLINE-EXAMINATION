import java.util.HashMap;
import java.util.Scanner;

public class OnlineExamination
{
	Scanner sc=new Scanner(System.in);
	HashMap<String,Integer> data=new HashMap<String,Integer>();
	public void login()
	{
		//user_name and password
		data.put("gauri",044);
		data.put("Akash",005);

		System.out.println("Welcome!!!");
		String user_id;
		int password;
		System.out.println("please Login...");
		System.out.println("Enter UserID: ");
		user_id=sc.next();
		System.out.println("Enter Password: ");
		password=sc.nextInt();
		if(data.containsKey(user_id) && data.get(user_id)==password)
		{
			System.out.println("Login Sucessful!!!");
			menu();
		}
		else
		{
			System.out.println("Invalid login!!!");
			System.out.println("please check Login details and try again");
			login();
		}
	}
	
	public void menu()
	{
		int ch;
		System.out.println("Enter your choice: ");
		System.out.println("1.Update Profile and Passwod");
		System.out.println("2.Start Exam");
		System.out.println("3.Logout");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				data=update();
				menu();
				break;
			case 2:
				start_exam();
				menu();
				break;
			case 3:
				System.exit(0);
				break;
			default :
				System.out.println("Invalid choice!!!");
		}
	}
	
	public HashMap<String,Integer> update()
	{
		String update_user;
		int update_pwd;
		System.out.println("Welcome to your profile!!!");
		System.out.println("Enter Username: ");
		update_user=sc.next();
		System.out.println("Enter Password: ");
		update_pwd=sc.nextInt();
		if(data.containsKey(update_user))
		{
			System.out.println("Enter new Passwod: ");
			update_pwd=sc.nextInt();
			data.replace(update_user,update_pwd);
		}
		else
		{
			System.out.println("User doesn't exist...");
		}
		return data;
	}
	
	public void start_exam()
	{
		long start_time=System.currentTimeMillis();
		long end_time=start_time+30;
		int score=0;
		int ans;
		System.out.println("Start Exam!!!");
		while(System.currentTimeMillis()<end_time)
		{
			System.out.println("You have 5 quetions and time limit is 5 minutes");
			System.out.println("");
			System.out.println("Each quetion for 5 marks and negative marking is there...");
			System.out.println("");
			System.out.println("Q1.Which Environment variable is used to set tha java path?");
			System.out.println("1)MAVEN_path"+"\t"+"2)JavaPATH"+"\t"+"3)JAVA"+"\t"+"4)JAVA_HOME");
			System.out.println("Enter your ans: ");
			ans=sc.nextInt();
			System.out.println("----your Answer is saved----");
			if(ans==4)
			{
				score=score+5;
			}
			else
			{
				score--;
			}
			
			System.out.println("");
			
			System.out.println("Q2.Which of the following is not an OOPS concept in JAVA?");
			System.out.println("1)Polymorphism"+"\t"+"2)Inheritence"+"\t"+"3)compilation"+"\t"+"4)Encapsulation");
			System.out.println("Enter your ans: ");
			ans=sc.nextInt();
			System.out.println("----your Answer is saved----");
			if(ans==3)
			{
				score=score+5;
			}
			else
			{
				score--;
			}
			
			System.out.println("");
			
			System.out.println("Q3.Which exception is thrown when java is out of memory?");
			System.out.println("1)memoryError"+"\t"+"2)OutOfMemoryError"+"\t"+"3)MemoryOutOfBoundException"+"\t"+"4)MemoryFullException");
			System.out.println("Enter your ans: ");
			ans=sc.nextInt();
			System.out.println("----your Answer is saved----");
			if(ans==2)
			{
				score=score+5;
			}
			else
			{
				score--;
			}
			
			System.out.println("");
			
			System.out.println("Q4.What is the extension of java code files?");
			System.out.println("1).js"+"\t"+"2).txt"+"\t"+"3).class"+"\t"+"4).java");
			System.out.println("Enter your ans: ");
			ans=sc.nextInt();
			System.out.println("----your Answer is saved----");
			if(ans==4)
			{
				score=score+5;
			}
			else
			{
				score--;
			}
			
			System.out.println("");
			
			System.out.println("Q5.Which of these keywords is used to define interfaces in Java?");
			System.out.println("1)intf"+"\t"+"2)Intf"+"\t"+"3)interface"+"\t"+"4)Interface");
			System.out.println("Enter your ans: ");
			ans=sc.nextInt();
			System.out.println("----your Answer is saved----");
			if(ans==3)
			{
				score=score+5;
			}
			else
			{
				score--;
			}
			break;
		}
		
		System.out.println("");
		
		System.out.println("you have finished the Exam!!!");
		System.out.println("");
		System.out.println("Congratulations!!!");
		System.out.println("");
		System.out.println("***##your Score is "+""+score+"/50"+"##***");
		System.out.println("");
	}
	
	public static void main(String args[])
	{
		OnlineExamination e1=new OnlineExamination();
		e1.login();
	}
}