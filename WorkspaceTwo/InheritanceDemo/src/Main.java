
public class Main {

	public static void main(String[] args) {
		TeacherLoanManager teacherLoanManager = new TeacherLoanManager();
		teacherLoanManager.calculate();
		CreditUi creditUi = new CreditUi();
		creditUi.creditCalculater(teacherLoanManager);
		creditUi.creditCalculater(new AgricultureLoanManager());
		creditUi.creditCalculater(new SoldierCredit());

	}

}
