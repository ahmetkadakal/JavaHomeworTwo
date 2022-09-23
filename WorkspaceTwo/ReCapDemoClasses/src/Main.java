
public class Main {

	public static void main(String[] args) {
		FourTransactions forTransactions = new FourTransactions();
		int[] numberArray = {50000,3,6,56,36636,636,525,9852};
		System.out.println(forTransactions.gather(numberArray));
		System.out.println(forTransactions.extraction(3,6));
		System.out.println(forTransactions.divide(12,6));
		System.out.println(forTransactions.multiplacition(3,6));
		

	}

}
