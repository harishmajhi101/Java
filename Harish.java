import java.util.Scanner;
class Harish
{
public static void main(String[]args)
{
	Scanner s=new Scanner(System.in);
	
/*----------prime no using for loop-----------*

    System.out.println("Enter a number: ");
	int num=s.nextInt();
	int count=0;
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			count++;
		}	
	}
	if(count==2)
	{
	System.out.println(num+" is a Prime no ");
	}
	else
	{
		System.out.println(num+" is Not a prime no");
	}
/*--------prime no using while loop----------*
	
	System.out.println("Enter a number: ");
	int num=s.nextInt();
	int i=1;
	int count=0;
	while(i<=num)
	{
		if(num%i==0)
		{
			count++;
		}
		i++;
	}
	if(count==2)
	{
		System.out.println(num+" is a prime no");
	}
	else
	{
		System.out.println(num+" is not a prime no");
	}
	
/*----------prime no using do while loop-------------*

       System.out.println("Enter a number: ");
	   int num=s.nextInt();
	   int i=1;
	   int count=0;
	   do
	   {
		   if(num%i==0)
		   {
			   count++;
		   }
		   i++;
	   }
	   while(i<=num);
	   if(count==2)
	{
		System.out.println(num+" is a prime no");
	}
	else
	{
		System.out.println(num+" is not a prime no");
	}
	
/*----------magic no --------------------*

     int n=226;
	 int temp=n;
     int sum;
      do
      {
		  sum=0;//
		  while(n>0)
		  {
			  sum=sum+(n%10);// 0+6=6+2=8+2=10  0+0=0+1=1
			  n=n/10;//22 2 0 1 0
		  }
		  n=sum;//10 1
	  }	while(sum>9);
	  System.out.println(sum);
	  if(sum==1)
	  {
		  System.out.println(temp+" is a magic no");
	  }
	  else
	  {
		  System.out.println(temp+" is not a magic no ");
	  }

/*-----------harshad no----------------------*/
         
		 int n=45;
         int sum=0;
		 int temp=n;
         do
		 {
			 sum=sum+(temp%10);//8+1=9
			 temp=temp/10;//1 0
		 }while(temp>0);
           if(n%sum==0)
          {
		  System.out.println(n+" is a harshad no");
	      }
	  else
	  {
		  System.out.println(n+" is not a harshad no ");
	  }			   


   }
 }