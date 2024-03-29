package carLoan;
/**
 * Главный класс
 * @author Шаимов Айдар
 */
public class Main {
	/** Поле с типом класса GuiMain */
	protected static GuiMain gui;
	
	/**
	 * main метод
	 * @param args аргументы командной строки
	 */
	public static void main(String[] args) {
		String name = "Калькулятор автокредита";
		String label = "Введите данные необходимые для расчета";
		gui = new GuiMain(name,label);
	}
}