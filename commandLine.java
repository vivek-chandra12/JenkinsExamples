import java.util.*;
class commandLine
{
	public static void main(String[] args)
	{
		if(args.length<1)
		{
			System.out.println(" invalid");
		}
		else
		{
			System.out.println("name:"+args[0]+"\ndob:"+args[1]);
		}
	}
}

