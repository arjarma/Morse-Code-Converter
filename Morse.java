import java.io.*;

class Morse
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String m=br.readLine();
		String str=".-,-...,-.-.,-..,.,..-.,--.,....,..,.---,-.-,.-..,--,-.,---,.--.,--.-,.-.,...,-,..-,...-,.--,-..-,-.--,--...,|,=";
		String a[]=str.split(",");
	String arr1[]=m.split(" ");	
		//System.out.println(c);
		//for(String s:arr1)
		//{
		//System.out.println(s);
		//}
		int j=0;
		char c='\u0000';
		char ch[]=new char[arr1.length];
		while(j<arr1.length)
		{
		for(int i=0;i<a.length-2;i++)
		{
			//char c=65;
			if(arr1[j].equals(a[i]))
			{
				int val=97+i; // 65 for A-Z 97 for a-z
				c=(char)val;
				ch[j]=c;
			//System.out.print("The value of  morse Code "+ arr1[j] +"  is: \t"+c +"\n");		
			}
			}
			
	if(arr1[j].equals(a[a.length-1]))
		{
			int val=10;
			c=(char)val;
			ch[j]=c;
			//System.out.print("new line"+"\n");
		}
		else if(arr1[j].equals(a[a.length-2]))
		{
			int val=9;
			c=(char)val;
			ch[j]=c;
			//System.out.print("\t");
		}
		
		j++;
		}
	String sop=new String(ch);
	System.out.print(sop+"\t");
	}	
}