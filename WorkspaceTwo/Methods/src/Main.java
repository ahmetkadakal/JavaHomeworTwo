
public class Main {

	public static void main(String[] args) {
		findNumer();
		System.out.println("---------------");
		int number = gather(41,7);
		System.out.println(number);
		System.out.println(cityGive());
		int total =  gatherTwo(2,3,3,6,65,5,5);
		System.out.println(total);
	}

	public static void add() {
		System.out.println("Add");
	}

	public static void delete() {
		System.out.println("Delete");
	}

	public static void update() {
		System.out.println("Update");
	}
	
	public static int gather(int numberOne , int numberTwo) {
		int result = numberOne + numberTwo;
		return result;
	}
	//çok kullanışlı değil
	public static int gatherTwo(int... numbers) {
		int gather = 0;
		for (int number : numbers) {
			gather +=number;
		}
		return gather;
	}
	
	public static  String cityGive() {
		return "Ankara";
	}

	public static void findNumer() {
		int[] numbers = new int[] { 1, 2, 3, 6, 5, 4, 9, 8, 7 };
		int find = 11;
		boolean isThere = false;

		for (int number : numbers) {
			if (number == find) {
				isThere = true;
				break;
			}
		}

		if (isThere) {
			sendMessage("The number you are looking for has been found! : " + find);
		} else {
			sendMessage("Number searched not found! : " + find);
		}
	}

	public static void sendMessage(String message) {
		System.out.println(message);
	}

	/*
	 * public static void sendMessage(int find) {
	 * System.out.println("The number you are looking for has been found! : " +
	 * find); } public static void sendMessageTwo(int find) {
	 * System.out.println("Number searched not found! : " + find); }
	 */

}
