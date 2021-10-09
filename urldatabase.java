import java.util.*;
class urldatabase {
		String[] key={" "};
		String[] url={" "};
		int[] count;
		public static int i=0;
	public static void incr()
	{
		i++;
	}
	public void store(String x)
	{
		int leftLimit = 97; // letter 'a'
    		int rightLimit = 122; // letter 'z'
   	 	int targetStringLength = 10;
   	 	Random random = new Random();
    		StringBuilder buffer = new StringBuilder(targetStringLength);
    		for (int i = 0; i < targetStringLength; i++) {
        		int randomLimitedInt = leftLimit + (int) 
          		(random.nextFloat() * (rightLimit - leftLimit + 1));
        		buffer.append((char) randomLimitedInt);
    		}
   	 	String generatedString = buffer.toString();
		key[i]=generatedString;
		url[i]=x;
		count[i]=0;
		incr();
	}
	public void get(String x)
	{
		for(i=0;url[i]!="";i++) {
			if(url[i]==x)
			{
				System.out.println(key[i]);
			}
		}
	}
	public void count(String x)
	{
		for(i=0;url[i]!="";i++) {
			if(url[i]==x)
			{
				System.out.println(count[i]);
			}
		}
	}
	public void list()
	{
		for(i=0;i<url.length();i++) {
			System.out.println(url[i]+" "+count[i]);
		}
	}
	public static void main(String args[])
	{
		switch(args[0]) {
			
			case "store": store(args[1]);
					break;
			case "get": get(args[1]);
					break;
			case "count":count(args[1]);
					break;
			case "list":list();
					break;
			case "exit": break;
		}
					
	}
}