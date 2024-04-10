import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{
		int number = num;
		while(number>9){
			digitList.add(0, number%10);
			number = number/10;
		}
		digitList.add(0,number);
	    
	}

	public boolean isStrictlyIncreasing()
	{
		for(int i = 1; i < digitList.size(); i++){
			if(digitList.get(i-1)>digitList.get(i)){
				return false;
			}
		}
		return true;

	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
