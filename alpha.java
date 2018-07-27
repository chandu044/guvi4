import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	char ch;
	Scanner sc=new Scanner(System.in);
	ch=sc.next().charAt(0);
	if(ch=='a'||ch=='s'||ch=='d'||ch=='f'||ch=='g'||ch=='h'||ch=='j'||ch=='k'||ch=='l'||ch=='z'||ch=='x'||ch=='c'||ch=='v'||ch=='b'||ch=='n'||ch=='n'||ch=='m'||ch=='q'||ch=='w'||ch=='e'||ch=='r'||ch=='t'||ch=='y'||ch=='u'||ch=='i'||ch=='o'||ch=='p')
	{
		System.out.println("Alphabet");
	}
		else
		{
			System.out.println("No");
		}
	
	}
}
