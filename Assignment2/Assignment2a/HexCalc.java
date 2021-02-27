/**
 * 
 */

/**
 * @author avinash.kumar_metacu
 *
 */
public class HexCalc implements Calc {

	private final String HexNumber;
	
	/**
	 * Default constructor
	 */
	public HexCalc() {
		HexNumber = "0";
	}
	/**
	 * class constructor
	 * @param HexNum initialize with HexNum
	 */
	public HexCalc(String HexNum) {
		if(!isHexNumber(HexNum)){
			throw new NumberFormatException("Not Hex Number: " + HexNum);
		} else {
			this.HexNumber = HexNum;
		}
	}
	
	/**
	 * @param HexNum
	 */
	@Override
	public String add(String HexNum){
		if(!isHexNumber(HexNum)){
			throw new NumberFormatException("Not Hex Number: " + HexNum);
		}
		return Integer.toHexString(Integer.parseInt(HexNumber, 16) + Integer.parseInt(HexNum, 16));
	}
	
	/**
	 * @param HexNum
	 */
	@Override
	public String subtract(String HexNum){
		if(!isHexNumber(HexNum)){
			throw new NumberFormatException("Not Hex Number: " + HexNum);
		}
		return Integer.toHexString(Integer.parseInt(HexNumber, 16) - Integer.parseInt(HexNum, 16));
	}

	/**
	 * @param HexNum
	 */
	@Override
	public String multiply(String HexNum){
		if(!isHexNumber(HexNum)){
			throw new NumberFormatException("Not Hex Number: " + HexNum);
		}
		return Integer.toHexString(Integer.parseInt(HexNumber, 16) * Integer.parseInt(HexNum, 16));
	}
	
	/**
	 * @param HexNum
	 */
	@Override
	public String divideBy(String HexNum){
		if(!isHexNumber(HexNum)){
			throw new NumberFormatException("Not Hex Number: " + HexNum);
		}
		return Integer.toHexString(Integer.parseInt(HexNumber, 16) / Integer.parseInt(HexNum, 16));
	}
	
	/**
	 * @param param
	 * @return 
	 */
	public static Boolean isDecimal(String param){
		try{
			Integer.parseInt(param);
			return true;
		}
		catch(NumberFormatException e){
			return false;
		}
	}

	/**
	 * @param param
	 * @return 
	 */
	public static Boolean isHexNumber(String param){
		try{
			Integer.parseInt(param, 16);
			return true;
		}
		catch(NumberFormatException e){
			return false;
		}
	}
	
	/**
	 * Converts Hex Number to its Decimal representation
	 * @param HexNum
	 * @return DecNum
	 */
	public static int HexToDec(String HexNum) {
		if(!isHexNumber(HexNum)){
			throw new NumberFormatException("Not Hex Number: " + HexNum);
		}
		int DecNum = Integer.parseInt(HexNum,16);
		return DecNum;
	}
	
	/**
	 * Converts Decimal Number to its Hex representation
	 * @param HexNum
	 * @return DecNum
	 */
	public static String DecToHex(String DecNum) {
		String HexNum = Integer.toHexString(Integer.parseInt(DecNum, 16)).toUpperCase();
		return HexNum;
	}
	
	/**
	 * Compare two Hex Number,
	 * Return -1, if less than
	 * 0, if equal
	 * 1, if greater than
	 * @param HexNum
	 * @return DecNum
	 */
	@Override
	public int compareTo(String HexNum) {
		if(!isHexNumber(HexNum)){
			throw new NumberFormatException("Not Hex Number: " + HexNum);
		}
		int current = Integer.parseInt(HexNumber,16);
		int other = Integer.parseInt(HexNum, 16);
		if(current > other){
			return 1;
		}
		else if(current < other){
			return -1;
		}
		return 0;
	}
}