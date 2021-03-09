/**
 * This class is used to find the lcm, hcf of two numbers
 * @author avinash.kumar_metacu
 */
public class MathOps {
	
	/**
	 * this function takes 2 integer number as input and return the hcf of those number recursively as integer form
	 * @param a
	 * @param b
	 * @return HCF
	 */
	public static int getHCF(int a,int b)
	{
		if(a<0 || b<0){
			throw new AssertionError("Negative value");
		}
		//base condition
		if (a == 0){
			return b;
		}
		return getHCF(b % a, a);
	}

	/**
	 * this function takes 2 number as input and return the lcm of those number recursively
	 * @param a
	 * @param b
	 * @return
	 */
	public static int getLCM(int a, int b)
	{
		if(a<0 || b<0){
			throw new AssertionError("Negative value");
		}
		return (a/getHCF(a, b))* b;
	}
}
