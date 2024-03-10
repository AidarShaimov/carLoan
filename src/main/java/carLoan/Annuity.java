package carLoan;
/**
 * Класс для расчета аннуитетных платежей на основе абстрактного класса Calc
 * @author Уразбахтин Тимур
 */
public final class Annuity extends Calc {
	/**
	 * Конструктор - создание нового объекта
	 * @param carPrice cтоимость автомобиля
	 * @param initPay первоначальный взнос
	 * @param annualInterestRate процентная ставка
	 * @param numberOfMonth срок кредита в месяцах
	 */
	public Annuity(double carPrice,
			double initPay,
			double annualInterestRate,
			int numberOfMonth) {
		this.carPrice = carPrice;
		this.initPay = initPay;
		this.annualInterestRate = annualInterestRate;
		this.numberOfMonth = numberOfMonth;
	}
	
	/**
	 * Возвращает ежемесячный платеж
	 * @return ежемесячный платеж
	 */
	public double getMonthlyPayment() {
		double monthlyInterestRate = getAnnualInterestRate() / 1200;
		double monthlyPayment = getCreditAmount() * monthlyInterestRate /
			      (1 - (1 / Math.pow( 1 + monthlyInterestRate, getNumberOfMonth() )));
		return Math.round(monthlyPayment * 100.0) / 100.0;
	}
	
	/**
	 * Возвращает выплату за весь срок кредита
	 * @return выплата за весь срок кредита
	 */
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * getNumberOfMonth();
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