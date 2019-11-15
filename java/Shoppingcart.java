import java.util.*;
import java.io.*;

 class Firstoutput   										//	class 
{
int n,i=0;											
static List1 l[]=new List1[12];								//	array of objects
static List1 l1[]=new List1[12];							//	static keyword
static List1 l2[]=new List1[12];
static List1 l3[]=new List1[12];

Scanner sc1=new Scanner(System.in);							//	scanner class
	Firstoutput()											//	constructor
	{
		System.out.println("Choose from the folowing\n");		
		System.out.println("1.Login  2.Create Account");
		
	}	
	
	void chose(int n)											//method
	{
	
	System.out.println("You chose option " +n);
		if (n==2){											//if-else statement(conditional statement)
	try{																	//try-catch (exception handling)
		
		 FileOutputStream fout=new FileOutputStream("createaccount.txt",true);		//file handling using file outputstream
			System.out.println("Enter UserId");
			 String s2=sc1.next();												//string
 			byte b[]=s2.getBytes();												//conversion from string to bytes
			String s4=" ";			
 			byte b2[]=s4.getBytes();
			
 			fout.write(b);													
			fout.write(b2);
 			
 			
 			
 			
			
 			 
			System.out.println("Enter Password");
 			String s3=sc1.next();
 			byte b1[]=s3.getBytes();
			
			String s5=" ";
 			byte b3[]=s5.getBytes();
			String s7="\n";
			byte b4[]=s7.getBytes();
 			fout.write(b1);
			fout.write(b3);
			fout.write(b4);
 			
 			fout.close();

 			System.out.println("New Account Created");
		}catch(Exception e){System.out.println(e);}
 			
	}
			
     
 			
 			
	if (n==1){
	try{																				//exception handling
		Scanner sc2=new Scanner(System.in);												//scanner input
		FileInputStream fin=new FileInputStream("createaccount.txt");					//file handling using file inputstream
 		int i=0,j,flag=0;
		System.out.println("Enter Userid :");
		String uid=sc2.next();															//user input
		
		
		
 		while((i=fin.read())!=-1){													//while loop
		for(j=0;j<uid.length();j++)														//for loop
			{
				if((char)i == uid.charAt(j))									//if-else
		{
		System.out.println("Account exists enter password:"); 
		String pwd=sc2.next();

		System.out.println("Login successful, Enjoy Shopping!");

		return;
 		}
		else{

		 System.out.println("Account does not exist!Create new account");			
		 Firstoutput f2=new Firstoutput();										//class object
		 int q=sc2.nextInt();
		 f2.chose(q);															//method calling											
		return;}}
 		fin.close();}
		}catch(Exception e){System.out.println(e);}								//exception handling
	
			
}
}
 
public   class List1 							//nested class
{
	
	String name;
	int price;
	public void save(String n,int p)			
	{
		this.name=n;						//this keyword
		this.price=p;
	}
	
	public String get_name()
	{
		return name;
	}

	public int get_price()
	{
		return price;
	}

	


}
public  class Page2 extends List1				//inheritence
{
	 int i;
	
	void chose(char opt)
	{
		
	switch (opt)							//switch case
	{
		case 'a': 
		
		for(int i=0;i<12;i++)
		{
			l[i]=new List1 ();				
		}l[0].save("Milk",20);					//method save is called to save items in an array of objects
		l[1].save("Cheese",60);
		l[2].save("Butter",40);
		l[3].save("Bread",40);
		l[4].save("Sauce",70);
		l[5].save("Curd",36);
		l[6].save("Flour",42);
		l[7].save("Rava",38);
		l[8].save("Lentils",52);
		l[9].save("Corn Flour",45);
		l[10].save("Colin",60);
		l[11].save("Cornflakes",60);
		for(i=0;i<12;i++)
	{
		int temp=i+1;

	System.out.println(temp+ " "+l[i].get_name()+" "+ l[i].get_price());			

	}

			 break;

		case 'b':
		for(int i=0;i<12;i++)
		{
			l1[i]=new List1();
		}
		l1[0].save("Shirt",400);
		l1[1].save("Jeans",360);
		l1[2].save("T-shirt",540);
		l1[3].save("Skirt",340);
		l1[4].save("Jacket",700);
		l1[5].save("Hoodie",560);
		l1[6].save("Shoes",240);
		l1[7].save("Socks",38);
		l1[8].save("Suits",750);
		l1[9].save("Saree",545);
		l1[10].save("Shorts",260);
		l1[11].save("Sandals",360);
		for(i=0;i<12;i++)
	{
		int temp=i+1;
		 System.out.println(temp+ " "+l1[i].get_name()+" "+ l1[i].get_price());
		
	}

			  break;	
			  
		case 'c':
		for(int i=0;i<10;i++)
		{
			l2[i]=new List1();
		}
		 l2[0].save("Milk",20);
		l2[1].save("Biscuits",60);
		l2[2].save("Potato chips",40);
		l2[3].save("Nuggets",40);
		l2[4].save("Burger",50);
		l2[5].save("Cold-drink",30);
		l2[6].save("Sandwich",40);
		l2[7].save("Momos",40);
		l2[8].save("Pizza",60);
		l2[9].save("Ice-Cream",45);
		for(i=0;i<10;i++)
	{
		int temp=i+1;
		 System.out.println(temp+ " "+l2[i].get_name()+" "+ l2[i].get_price());
		
	}
		

			  break;
			
		case 'd':
		for(int i=0;i<11;i++)
		{
			l3[i]=new List1();
		}
		l3[0].save("Shirt",400);
		l3[1].save("Soap",36);
		l3[2].save("Shampoo",50);
		l3[3].save("Conditioner",60);
		l3[4].save("Wiper",70);
		l3[5].save("Freshner",60);
		l3[6].save("Serum",40);
		l3[7].save("Hair-oil",40);
		l3[8].save("Washing powder",55);
		l3[10].save("Body-lotion",60);
		for(i=0;i<11;i++)
	{
		int temp=i+1;
		 System.out.println(temp+ " "+l3[i].get_name()+" "+ l3[i].get_price());
		
	}
		
			  break;
	}
	
}		



}
}







public  class Shoppingcart extends Firstoutput				//inheritence
{
public static void main(String args[])
{	
	
	System.out.println("Welcome to MyKart! Your only shopping destination!");
	Scanner sc=new Scanner(System.in);						//scanner class
		Firstoutput f1 = new Firstoutput();					//outer class object creation
		Firstoutput.Page2 pg = f1.new Page2();					//nested class object creation
	int n=sc.nextInt();
	f1.chose(n);
	System.out.println("Pick the category you want to shop from (a,b,c,d)");
	System.out.println("a.Grocery \n b.Clothing \n c.Snacks \n d.Bathroom accessories");
	char opt= sc.next().charAt(0);
	String item=" " ;
	int quan =0;
	int i=0,check=0,bill=0;
	
	pg.chose(opt);
	for(; ;)
	{	System.out.println("Please add your items to the cart (please specify the name as given)");
		item=sc.next();
		System.out.println("Specify the quantity");
		quan=sc.nextInt();
		if(opt=='a'){
		for(i=0;i<12;i++)
		{
			if(l[i].get_name().equals(item)==true)				//checking if two strings are equal
			{
				check=1;
				bill=bill+l[i].get_price()*quan;
				
				break;
			}
		}
	}
		else if(opt=='b'){
			for(i=0;i<12;i++)
			{
				if(l1[i].get_name().equals(item)==true)
				{
					check=1;
					bill=bill+l1[i].get_price()*quan;
					
					break;
				}
			}
		}

		else if(opt=='c'){
				for(i=0;i<12;i++)
				{
					if(l2[i].get_name().equals(item)==true)
					{
						check=1;
						bill=bill+l2[i].get_price()*quan;
						
						break;
					}
				}
			}
		else if(opt=='d'){
					for(i=0;i<12;i++)
					{
						if(l3[i].get_name().equals(item)==true)
						{
							check=1;
							bill=bill+l3[i].get_price()*quan;
							
							break;
						}
					}
				}

if(check==0)
{
	System.out.println("Please try again, invalid item!");
	continue;												//continue keyword
}
	
System.out.println("Press 1 to continue shopping and 0 to exit!");
int p=sc.nextInt();
if(p==0){break;}																//break keyword
else
{
	check=0;
	continue;
}}
System.out.println("Your Total Purchase is "+bill+ " "+"Thanks for shopping with us!Hope to see you soon!" ); 
}
}