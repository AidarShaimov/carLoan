package carLoan;
/**
 * Абстрактный класс
 * @author Уразбахтин Тимур
 */
public abstract class Calc {
	/** Поле cтоимость автомобиля */
	protected double carPrice;
	
	/** Поле первоначальный взнос */
	protected double initPay;
	
	/** Поле процентная ставка */
	protected double annualInterestRate;
	
	/** Поле срок кредита в месяцах */
	protected int numberOfMonth;
	
	/**
	 * Возвращает cтоимость автомобиля
	 * @return cтоимость автомобиля
	 */
	public double getcarPrice() {
		return carPrice;	
	}
	
	/**
	 * Присваивает стоимость автомобиля
	 * @param carPrice стоимость автомобиля
	 */
	public void setcarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	
	/**
	 * Возвращает первоначальный взнос
	 * @return первоначальный взнос
	 */
	public double getInitPay() {
		return initPay;	
	}
	
	/**
	 * Присваивает первоначальный взнос
	 * @param initPay первоначальный взнос
	 */
	public void setInitPay(double initPay) {
		this.initPay = initPay;
	}
	
	/**
	 * Возвращает процентную ставку
	 * @return процентную ставку
	 */
	public double getAnnualInterestRate() {
		return annualInterestRate;	
	}
	
	/**
	 * Присваивает процентную ставку
	 * @param annualInterestRate процентную ставку
	 */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	/**
	 * Возвращает срок кредита в месяцах
	 * @return срок кредита в месяцах
	 */
	public double getNumberOfMonth() {
		return numberOfMonth;	
	}
	
	/**
	 * Присваивает срок кредита в месяцах
	 * @param numberOfMonth срок кредита в месяцах
	 */
	public void setNumberOfMonth(int numberOfMonth) {
		this.numberOfMonth = numberOfMonth;
	}
	
	/**
	 * Возвращает стоимость автомобиля
	 * @return стоимость автомобиля
	 */
	public double getCreditAmount() {
		double creditAmount = carPrice - initPay;
		return creditAmount;	
	}
}
