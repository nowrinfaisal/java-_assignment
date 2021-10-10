import java.util.*;
import java.io.*;
import java.lang.*;
class urldatabase
{
		Scanner sc=new Scanner(System.in);
		String[] key=new String[10];
		String[] url=new String[10];
		int[] cnt=new int[10];
		int len=0;

	public void store()
	{
		int leftLimit = 97; 
    		int rightLimit = 122; 
   	 	int targetStringLength = 10;
   	 	Random random = new Random();
    		StringBuilder buffer = new StringBuilder(targetStringLength);
    		for (int i = 0; i < targetStringLength; i++) {
        		int randomLimitedInt = leftLimit + (int) 
          		(random.nextFloat() * (rightLimit - leftLimit + 1));
        		buffer.append((char) randomLimitedInt);
    		}
   	 	String generatedString = buffer.toString();  
		key[len]=generatedString;
		System.out.println("Enter a URL--> ");
		String id=sc.nextLine();
		url[len]=id;
		cnt[len]=0;
		len++;
	}

	public void get()
	{
		System.out.println("Enter a url--> ");
		String id=sc.nextLine();
		int j;
		for(j=0;j<len;j++)
		{
				if(id.equals(url[j]))
				{
					cnt[j]=cnt[j]+1;
					System.out.println("Unique key--> "+key[j]);
					break;
				}
		}
	}

	public void count()
	{
		System.out.println("Enter a url--> ");
		String id=sc.nextLine();
		int j;
		for(j=0;j<len;j++)
		{
			if(id.equals(url[j]))
			{
				System.out.println("Count of "+url[j]+" is--> "+cnt[j]);
				break;
			}
		}
	}

	public void list()
	{
		int i;
		for(i=0;i<len;i++) {
			System.out.println("Url--> "+url[i]+" Count--> "+cnt[i]);
		}
	}

	public static void main(String args[])
	{
		urldatabase obj=new urldatabase();
		while(true)
		{
			System.out.println("\nVARIOUS OPERATIONS : ");
			System.out.println("storeurl");
			System.out.println("get");
			System.out.println("count ");
			System.out.println("list ");
			System.out.println("exit ");
			System.out.println("Enter your choice--> ");
			String choice=obj.sc.nextLine();
			switch(choice) {
			
				case "storeurl": 
						obj.store();
						break;
				case "get": 
						obj.get();
						break;
				case "count":
						obj.count();
						break;
				case "list":
						obj.list();
						break;
				case "exit":
						 System.exit(0);

				default:	
						break;
			}
		}
					
	}
}