package by.htp.Calendar03.main;

import by.htp.Calendar03.main.Calendar.Day;
import by.htp.Calendar03.main.Calendar.Month;
import by.htp.Calendar03.main.Calendar.Week;

/*Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
выходных и праздничных днях.*/

public class Main {

	public static void main(String[] args) {

		Calendar calendar = new Calendar();

		Calendar.Month month = new Calendar().new Month("February");

		Calendar.Week week1 = new Calendar().new Week();

		week1.add(1, false, false, TitleDay.MONDAY);
		week1.add(2, false, false, TitleDay.TUESDAY);
		week1.add(3, false, false, TitleDay.WEDNESDAY);
		week1.add(4, false, false, TitleDay.THURSDAY);
		week1.add(5, false, false, TitleDay.FRIDAY);
		week1.add(6, true, false, TitleDay.SATURDAY);
		week1.add(7, true, false, TitleDay.SUNDAY);

		Calendar.Week week2 = new Calendar().new Week();

		week2.add(8, false, false, TitleDay.MONDAY);
		week2.add(9, false, false, TitleDay.TUESDAY);
		week2.add(10, false, false, TitleDay.WEDNESDAY);
		week2.add(11, false, false, TitleDay.THURSDAY);
		week2.add(12, false, false, TitleDay.FRIDAY);
		week2.add(13, true, false, TitleDay.SATURDAY);
		week2.add(14, true, true, TitleDay.SUNDAY);

		Calendar.Week week3 = new Calendar().new Week();

		week3.add(15, false, false, TitleDay.MONDAY);
		week3.add(16, false, false, TitleDay.TUESDAY);
		week3.add(17, false, false, TitleDay.WEDNESDAY);
		week3.add(18, false, false, TitleDay.THURSDAY);
		week3.add(19, false, false, TitleDay.FRIDAY);
		week3.add(20, true, false, TitleDay.SATURDAY);
		week3.add(21, true, false, TitleDay.SUNDAY);

		Calendar.Week week4 = new Calendar().new Week();

		week4.add(22, false, false, TitleDay.MONDAY);
		week4.add(23, false, true, TitleDay.TUESDAY);
		week4.add(24, false, false, TitleDay.WEDNESDAY);
		week4.add(25, false, false, TitleDay.THURSDAY);
		week4.add(26, false, false, TitleDay.FRIDAY);
		week4.add(27, true, false, TitleDay.SATURDAY);
		week4.add(28, true, false, TitleDay.SUNDAY);

		Calendar.Month month2 = new Calendar().new Month("March");

		Calendar.Week week5 = new Calendar().new Week();

		week5.add(1, false, false, TitleDay.MONDAY);
		week5.add(2, false, false, TitleDay.TUESDAY);
		week5.add(3, false, false, TitleDay.WEDNESDAY);
		week5.add(4, false, false, TitleDay.THURSDAY);
		week5.add(5, false, false, TitleDay.FRIDAY);
		week5.add(6, true, false, TitleDay.SATURDAY);
		week5.add(7, true, false, TitleDay.SUNDAY);

		Calendar.Week week6 = new Calendar().new Week();

		week6.add(8, false, true, TitleDay.MONDAY);
		week6.add(9, false, false, TitleDay.TUESDAY);
		week6.add(10, false, false, TitleDay.WEDNESDAY);
		week6.add(11, false, false, TitleDay.THURSDAY);
		week6.add(12, false, false, TitleDay.FRIDAY);
		week6.add(13, true, false, TitleDay.SATURDAY);
		week6.add(14, true, true, TitleDay.SUNDAY);

		Calendar.Week week7 = new Calendar().new Week();

		week7.add(15, false, false, TitleDay.MONDAY);
		week7.add(16, false, false, TitleDay.TUESDAY);
		week7.add(17, false, false, TitleDay.WEDNESDAY);
		week7.add(18, false, false, TitleDay.THURSDAY);
		week7.add(19, false, false, TitleDay.FRIDAY);
		week7.add(20, true, false, TitleDay.SATURDAY);
		week7.add(21, true, false, TitleDay.SUNDAY);

		Calendar.Week week8 = new Calendar().new Week();

		week8.add(22, false, false, TitleDay.MONDAY);
		week8.add(23, false, true, TitleDay.TUESDAY);
		week8.add(24, false, false, TitleDay.WEDNESDAY);
		week8.add(25, false, false, TitleDay.THURSDAY);
		week8.add(26, false, false, TitleDay.FRIDAY);
		week8.add(27, true, false, TitleDay.SATURDAY);
		week8.add(28, true, false, TitleDay.SUNDAY);

		month.add(week1);
		month.add(week2);
		month.add(week3);
		month.add(week4);

		month2.add(week5);
		month2.add(week6);
		month2.add(week7);
		month2.add(week8);

		calendar.add(month);
		calendar.add(month2);

		print(calendar);

	}

	public static void print(Calendar c) {

		for (Month m : c.getMonths()) {
			System.out.println(m.getTitlMonth());
			for (Week w : m.getWeeks()) {
				for (Day d : w.getDays()) {
					System.out.println(d.getNum() + " " + d.getTitleDay() + " " + d.isHoliday() + " " + d.isWeekend());
				}
			}
		}
	}

}
