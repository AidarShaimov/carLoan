package carLoan;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Класс графического интерфейса
 * @author Шаимов Айдар
 */
public class GuiMain {
	private JComboBox<String> paymentType;

	private JLabel labelCarPrice = new JLabel("Стоимость автомобиля:");
	private JLabel labelInitPay = new JLabel("Первоначальный взнос:");
	private JLabel labelRate = new JLabel("Процентная ставка:");
	private JLabel labelMonth = new JLabel("Срок кредита в месяцах:");

	private JTextField dataCarPrice = new JTextField(10);
	private JTextField dataInitPay = new JTextField(10);
	private JTextField dataRate = new JTextField(10);
	private JTextField dataMonth = new JTextField(10);

	private JLabel monthlyPaymentOutput = new JLabel("");
	private JLabel overpaymentOutput = new JLabel("");
	private JLabel totalPaymentOutput = new JLabel("");

	private String[] paymentTypeText = {
				"Аннуитетный",
				"Дифференцированный"
			};
	
	private JLabel[] arrayLabel = {
				labelCarPrice,
				labelInitPay,
				labelRate,
				labelMonth
			};
	
	private JTextField[] arrayTextField = {
				dataCarPrice,
				dataInitPay,
				dataRate,
				dataMonth
			};
	
	private JFrame guiMain;
	private JPanel panel;

	/**
	 * Конструктор - создание нового объекта
	 * @param name название приложения
	 * @param label заголовок приложения
	 */
	public GuiMain(String name, String label) {
		guiMain = new JFrame("CarLoan");
		guiMain.setTitle(name);
		guiMain.setBounds(500,300,400,640);
		guiMain.setResizable(false); 
		
		panel = new JPanel();
		panel.setLayout(null);
		guiMain.add(panel);
			
		JLabel labelInfo = new JLabel(label);
		labelInfo.setBounds(60,0,300,30);
		panel.add(labelInfo);
		
		paymentType = new JComboBox<String>(paymentTypeText);
		paymentType.setBounds(30,40,150,30);
		panel.add(paymentType);
		
		labelCarPrice.setBounds(30,70,250,30);
		panel.add(labelCarPrice);
		dataCarPrice.setBounds(30,110,150,30);
		panel.add(dataCarPrice);
		
		labelInitPay.setBounds(30,140,250,30);
		panel.add(labelInitPay);
		dataInitPay.setBounds(30,170,150,30);	
		panel.add(dataInitPay);
		
		labelRate.setBounds(30,200,250,30);
		panel.add(labelRate);
		dataRate.setBounds(30,230,150,30);
		panel.add(dataRate);
		
		labelMonth.setBounds(30,260,250,30);
		panel.add(labelMonth);
		dataMonth.setBounds(30,300,150,30);
		panel.add(dataMonth);
		
		JLabel monthlyPaymentLabel = new JLabel("\n"
				+ "Ежемесячный платеж:");
		monthlyPaymentLabel.setBounds(30,360,250,30);
		panel.add(monthlyPaymentLabel);
		
		monthlyPaymentOutput.setBounds(30,390,250,30);
		monthlyPaymentOutput.setEnabled(false);
		panel.add(monthlyPaymentOutput);
		
		JLabel overpaymentLabel = new JLabel("\n"
				+ "Переплата по кредиту:");
		overpaymentLabel.setBounds(30,420,250,30);
		panel.add(overpaymentLabel);
		
		overpaymentOutput.setBounds(30,450,250,30);
		overpaymentOutput.setEnabled(false);
		panel.add(overpaymentOutput);
		
		JLabel totalPaymentLabel = new JLabel("\n"
				+ "Выплата за весь срок кредита:");
		totalPaymentLabel.setBounds(30,480,250,30);
		panel.add(totalPaymentLabel);
		
		totalPaymentOutput.setBounds(30,510,250,30);
		totalPaymentOutput.setEnabled(false);
		panel.add(totalPaymentOutput);
		
		JButton buttonCalculate = new JButton("Расчет платы");
		buttonCalculate.setBounds(20,550,150,40);
		ActionListener actionCalculate = new ListenerCalc();
		buttonCalculate.addActionListener(actionCalculate);
		panel.add(buttonCalculate);
		
		JButton buttonExit = new JButton("Выход");
		buttonExit.setBounds(270,550,100,40);
		ActionListener actionListener = new ListenerButton();
		buttonExit.addActionListener(actionListener); 
		panel.add(buttonExit);
		
		guiMain.setVisible(true);
		guiMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	/**
	 * Возвращает компонент-контейнер, который содержит другие компоненты
	   пользовательского интерфейса
	 * @return компонент-контейнер
	 */
	public JPanel getPanel() {
		return panel;
	}

	/**
	 * Возвращает массив заголовков полей ввода
	 * @return массив заголовков полей ввода
	 */
	public JLabel[] getLabel() {
		return arrayLabel;
	}

	/**
	 * Возвращает массив полей ввода
	 * @return массив полей ввода
	 */
	public JTextField[] getTextField() {
		return arrayTextField;
	}

	/**
	 * Возвращает заголовки для типа платежа
	 * @return заголовки для типа платежа
	 */
	public String[] getPaymentTypeText() {
		return paymentTypeText;
	}

	/**
	 * Возвращает поле вывода ежемесячного платежа
	 * @return поле вывода ежемесячного платежа
	 */
	public JLabel getMonthlyPaymentOutput() {
		return monthlyPaymentOutput;
	}

	/**
	 * Возвращает поле вывода переплаты по кредиту
	 * @return поле вывода переплаты по кредиту
	 */
	public JLabel getOverpaymentOutput() {
		return overpaymentOutput;
	}

	/**
	 * Возвращает поле вывода выплаты за весь срок кредита
	 * @return поле вывода выплаты за весь срок кредита
	 */
	public JLabel getTotalPaymentOutput() {
		return totalPaymentOutput;
	}

	/**
	 * Возвращает поле выбора типа платежа
	 * @return поле выбора типа платежа
	 */
	public JComboBox<String> getPaymentType() {
		return paymentType;
	}
}