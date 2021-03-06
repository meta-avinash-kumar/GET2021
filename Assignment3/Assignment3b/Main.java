import java.util.Arrays;

/**
 * @author avinash.kumar_metacu
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Poly Test: ");
		Poly p1 = new Poly(new double[]{2,3.5}, new double[]{2,1});
		Poly p2 = new Poly(new double[]{3,5}, new double[]{2,1});
		Poly add = Poly.addPoly(p1, p2);
		Poly mul = Poly.multiplyPoly(p1, p2);
		System.out.println(p1.evaluate(4));
		System.out.println(Arrays.toString(add.getCoefficient())+"\n"
				+ Arrays.toString(add.getExponent()));
		System.out.println(Arrays.toString(mul.getCoefficient())+"\n"
				+ Arrays.toString(mul.getExponent()));
		
		
		System.out.println("IntSet Test: ");
		
		IntSet intSet1 = new IntSet(new int[]{1,2,3,4,6});
		IntSet intSet2 = new IntSet(new int[]{3,5,6});
		System.out.println(Arrays.toString(intSet1.getComplement()));
		System.out.println(Arrays.toString(intSet1.union(intSet2)));
		System.out.println(intSet1.isSubSet(intSet2));
		System.out.println(intSet1.isMember(3));
		
		
	}

}
