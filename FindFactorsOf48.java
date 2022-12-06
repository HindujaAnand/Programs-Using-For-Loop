package MyFor;

public class FindFactorsOf48 
{
public static void main(String[] args) 
{	
	int number = 48 ;

	for ( int i = 1 ; i <= number ; i = i + 1 )
	{
	if ( number % i == 0 )
	{
	System.out.println(i);
	}
	}
}
}
