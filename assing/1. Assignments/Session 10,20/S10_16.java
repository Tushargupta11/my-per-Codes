import java.util.Scanner;
class Player
{
    String name;
	Player()
	{
		name="Mohit";
	}
}
class Cricket_Player extends Player
{
	Cricket_Player()
	{
		System.out.println(name+"is a cricket player");
	}
}
class Football_Player extends Player
{
		Football_Player()
	{
		System.out.println(name+"is a football player");
	}
}
class Hockey_Player extends Player
{
		Hockey_Player()
	{
		System.out.println(name+"is a hockey player");
	}
}

class S10_16 
{
	public static void main(String []ar)
	{
	    Cricket_Player c=new Cricket_Player();
	    Football_Player f=new Football_Player();
		Hockey_Player h=new Hockey_Player();
	}
}