
public class FourTransactions {
	public int gather(int[] numbers) {
		int result = 0;
		for (int number : numbers) {
			result+=number;
		}
		return result;
	}
	public int extraction(int numberOne , int numberTwo) {
		return numberOne-numberTwo;
	}
	public int multiplacition(int numberOne , int numberTwo) {
		return numberOne*numberTwo;
	}
	public int divide(int numberOne , int numberTwo) {
		return numberOne/numberTwo;
	}
}
