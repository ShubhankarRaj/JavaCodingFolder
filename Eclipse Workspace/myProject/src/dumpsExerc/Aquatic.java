package dumpsExerc;

public class Aquatic extends Animals{
	public int fun(int a, int b){
		System.out.println("The sum done by super class: "+super.fun(a,b));
		int c = a*b;
		return c;
	}
}
