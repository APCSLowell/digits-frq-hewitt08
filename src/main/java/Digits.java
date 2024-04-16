import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{
		digitList = new ArrayList<Integer>();
		if(num==0){
			digitList.add(0);
		}
		int n = num;
		while(n>0){
			digitList.add(0, n%10);
			n = n/10;
		}
	    
	}

	public boolean isStrictlyIncreasing()
	{
		for(int i = 1; i < digitList.size(); i++){
			if(digitList.get(i-1)>=digitList.get(i)){
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
