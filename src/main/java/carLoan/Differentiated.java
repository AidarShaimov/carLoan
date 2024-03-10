package carLoan;
/**
 * Класс для расчета дифференцированных платежей на основе абстрактного класса Calc
 * @author Уразбахтин Тимур
 */
public final class Differentiated extends Calc {
	/**
	 * Конструктор - создание нового объекта
	 * @param carPrice cтоимость автомобиля
	 * @param initPay первоначальный взнос
	 * @param annualInterestRate процентная ставка
	 * @param numberOfMonth срок кредита в месяцах
	 */
	public Differentiated(double carPrice,
			double initPay,
			double annualInterestRate,
			int numberOfMonth) {
		this.carPrice = carPrice;
		this.initPay = initPay;
		this.annualInterestRate = annualInterestRate;
		this.numberOfMonth = numberOfMonth;
	}
	
	/**
	 * Возвращает платеж по основному долгу
	 * @return платеж по основному долгу
	 */
	public double getPaymentOfPrincipal() {
		double paymentOfPrincipal = getCreditAmount() / getNumberOfMonth(); 
		return paymentOfPrincipal;
	}
	
	/**
	 * Возвращает платеж по процентам за месяц
	 * @param creditBalance - остаток задолженности по кредиту
	 * @return платеж по процентам за месяц
	 */
	public double getInterestPayment(double creditBalance) {
		double interestPayment = (creditBalance * (getAnnualInterestRate() / 100) * 30) / 365;
		return interestPayment;    
	}
	
	/**
	 * Возвращает ежемесячный платеж
	 * @param creditBalance остаток задолженности по кредиту
	 * @return ежемесячный платеж
	 */
	public double getMonthlyPayment(double creditBalance) {
		double monthlyPayment = getPaymentOfPrincipal() + getInterestPayment(creditBalance);
		return monthlyPayment;
	}
	
	/**
	 * Возвращает минимальный ежемесячный платеж
	 * @return минимальный ежемесячный платеж
	 */
	public double getMinMonthlyPayment() {
		double minMonthlyPayment = getPaymentOfPrincipal() + getInterestPayment(
				getCreditAmount() - ( getPaymentOfPrincipal() * ( getNumberOfMonth() - 1 )));
		return Math.round(minMonthlyPayment * 100.0) / 100.0;
	}
	
	/**
	 * Возвращает максимальный ежемесячный платеж
	 * @return максимальный ежемесячный платеж
	 */
	public double getMaxMonthlyPayment() {
		double maxMonthlyPayment = getPaymentOfPrincipal() + getInterestPayment( getCreditAmount() );
		return Math.round(maxMonthlyPayment * 100.0) / 100.0;
	}
	
	/**
	 * Возвращает выплату за весь срок кредита
	 * @return выплата за весь срок кредита
	 */
	public double getTotalPayment() {
		double totalPayment = 0;
		double paymentOfPrincipal = getPaymentOfPrincipal();
		double creditAmount = getCreditAmount();
		
		for(int month = 0; month < getNumberOfMonth(); month++) {
			totalPayment += getMonthlyPayment(creditAmount);
			creditAmount = creditAmount - paymentOfPrincipal;
		}
		
		return Math.round(totalPayment * 100.0) / 100.0;    
	}
	
	/**
	 * Возвращает переплату по кредиту
	 * @return переплата по кредиту
	 */
	public double getOverpayment() {
		double overpayment = getTotalPayment() - getCreditAmount();
		return Math.round(overpayment * 100.0) / 100.0;
	}
}