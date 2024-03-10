package carLoan;
/**
 * ����������� �����
 * @author ���������� �����
 */
public abstract class Calc {
	/** ���� c�������� ���������� */
	protected double carPrice;
	
	/** ���� �������������� ����� */
	protected double initPay;
	
	/** ���� ���������� ������ */
	protected double annualInterestRate;
	
	/** ���� ���� ������� � ������� */
	protected int numberOfMonth;
	
	/**
	 * ���������� c�������� ����������
	 * @return c�������� ����������
	 */
	public double getcarPrice() {
		return carPrice;	
	}
	
	/**
	 * ����������� ��������� ����������
	 * @param carPrice ��������� ����������
	 */
	public void setcarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	
	/**
	 * ���������� �������������� �����
	 * @return �������������� �����
	 */
	public double getInitPay() {
		return initPay;	
	}
	
	/**
	 * ����������� �������������� �����
	 * @param initPay �������������� �����
	 */
	public void setInitPay(double initPay) {
		this.initPay = initPay;
	}
	
	/**
	 * ���������� ���������� ������
	 * @return ���������� ������
	 */
	public double getAnnualInterestRate() {
		return annualInterestRate;	
	}
	
	/**
	 * ����������� ���������� ������
	 * @param annualInterestRate ���������� ������
	 */
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	/**
	 * ���������� ���� ������� � �������
	 * @return ���� ������� � �������
	 */
	public double getNumberOfMonth() {
		return numberOfMonth;	
	}
	
	/**
	 * ����������� ���� ������� � �������
	 * @param numberOfMonth ���� ������� � �������
	 */
	public void setNumberOfMonth(int numberOfMonth) {
		this.numberOfMonth = numberOfMonth;
	}
	
	/**
	 * ���������� ��������� ����������
	 * @return ��������� ����������
	 */
	public double getCreditAmount() {
		double creditAmount = carPrice - initPay;
		return creditAmount;	
	}
}
