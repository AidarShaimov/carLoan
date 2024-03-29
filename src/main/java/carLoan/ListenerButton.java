package carLoan;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Класс прослушиватель кнопок
 * @author Шаимов Айдар
 */
public class ListenerButton implements ActionListener {
	@Override
	/**
	 * При нажатии на кнопку выход создает объект класса Exit
	 */
	public void actionPerformed(ActionEvent e) {
		String exitText="Выйти??";
		String exitHat="Завершение работы пррограммы";
		new Exit(exitText, exitHat);
	}
}