package carLoan;

import javax.swing.JOptionPane;
/**
 * Класс для показа диалогового окна после нажатия на кнопку выход
 * @author Шаимов Айдар
 */
public class Exit {
	/**
	 * Конструктор - создание нового объекта для показа диалоговое окно
	   и закрытия программы
	 * @param exitText текст окна
	 * @param exitHat заголовок окна
	 */
	public Exit(String exitText, String exitHat) {
		int exit = JOptionPane.showConfirmDialog(null,
	            exitText,
	            exitHat,
	            JOptionPane.YES_NO_OPTION,
	            JOptionPane.WARNING_MESSAGE);
		
		if (JOptionPane.YES_OPTION==exit) {
			System.exit(1);
		}
	}
}