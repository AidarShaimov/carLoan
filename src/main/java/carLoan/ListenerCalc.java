package carLoan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Класс обработки полей ввода
 * @author Шаимов Айдар
 */
public class ListenerCalc implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox<String> paymentType = Main.gui.getPaymentType();
		String item = (String) paymentType.getSelectedItem();
		String[] paymentTypeText = Main.gui.getPaymentTypeText();
		JTextField[] arrayTextField = Main.gui.getTextField();

		JLabel monthlyPaymentOutput = Main.gui.getMonthlyPaymentOutput();
		JLabel overpaymentOutput = Main.gui.getOverpaymentOutput();
		JLabel totalPaymentOutput = Main.gui.getTotalPaymentOutput();

		if (!arrayTextField[0].getText().matches("^\\d+(.?)(\\d{1,2})?$") ||
				arrayTextField[0].getText().isEmpty()) {
			arrayTextField[0].setText("0");
		}

		if (!arrayTextField[1].getText().matches("^\\d+(.?)(\\d{1,2})?$") ||
				arrayTextField[1].getText().isEmpty()) {
			arrayTextField[1].setText("0");
		}

		if (!arrayTextField[2].getText().matches("^\\d{1,2}(.?)(\\d{1,2})?$") ||
				arrayTextField[2].getText().isEmpty()) {
			arrayTextField[2].setText("0");
		}

		if (!arrayTextField[3].getText().matches("\\d+") ||
				arrayTextField[3].getText().isEmpty()) {
			arrayTextField[3].setText("0");
		}

		if (!item.isEmpty()) {
			if (item == paymentTypeText[0]) {
				Annuity data = new Annuity(
						Double.parseDouble( arrayTextField[0].getText() ),
						Double.parseDouble( arrayTextField[1].getText() ),
						Double.parseDouble( arrayTextField[2].getText() ),
						Integer.parseInt( arrayTextField[3].getText() ));

				monthlyPaymentOutput.setText(
						String.valueOf( data.getMonthlyPayment() ) + " руб.");
				
				overpaymentOutput.setText(
						String.valueOf( data.getOverpayment() ) + " руб.");
				
				totalPaymentOutput.setText(
						String.valueOf( data.getTotalPayment() ) + " руб.");
			} else if (item == paymentTypeText[1]) {
				Differentiated data = new Differentiated(
						Double.parseDouble( arrayTextField[0].getText() ),
						Double.parseDouble( arrayTextField[1].getText() ),
						Double.parseDouble( arrayTextField[2].getText() ),
						Integer.parseInt( arrayTextField[3].getText() ));

				monthlyPaymentOutput.setText(
						String.valueOf( data.getMaxMonthlyPayment() ) + " ... " +
						String.valueOf( data.getMinMonthlyPayment() ) + " руб.");
				
				overpaymentOutput.setText(
						String.valueOf( data.getOverpayment() ) + " руб.");
				totalPaymentOutput.setText(
						String.valueOf( data.getTotalPayment() ) + " руб.");
			}
		}
	}
}