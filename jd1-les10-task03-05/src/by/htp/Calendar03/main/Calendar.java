package by.htp.Calendar03.main;

import java.util.ArrayList;
import java.util.List;

/*Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
выходных и праздничных днях.*/

public class Calendar {

	private List<Month> months;

	public Calendar() {
		months = new ArrayList<Month>();
	}

	public void add(Month m) {
		months.add(m);
	}

	class Month {
		private String TitlMonth;
		private List<Week> weeks;

		public Month() {
			weeks = new ArrayList<Week>();
		}

		public Month(String TitlMonth) {
			this.TitlMonth = TitlMonth;
			weeks = new ArrayList<Week>();
		}

		public void add(Week w) {
			weeks.add(w);
		}

		public List<Week> getWeeks() {
			return weeks;
		}

		public void setWeeks(List<Week> weeks) {
			this.weeks = weeks;
		}

		public String getTitlMonth() {
			return TitlMonth;
		}

		public void setTitlMonth(String titlMonth) {
			TitlMonth = titlMonth;

		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((TitlMonth == null) ? 0 : TitlMonth.hashCode());
			result = prime * result + ((weeks == null) ? 0 : weeks.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Month other = (Month) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (TitlMonth == null) {
				if (other.TitlMonth != null)
					return false;
			} else if (!TitlMonth.equals(other.TitlMonth))
				return false;
			if (weeks == null) {
				if (other.weeks != null)
					return false;
			} else if (!weeks.equals(other.weeks))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Month [TitlMonth=" + TitlMonth + ", weeks=" + weeks + "]";
		}

		private Calendar getEnclosingInstance() {
			return Calendar.this;
		}
	}

	class Week {
		private List<Day> days;

		public Week() {
			days = new ArrayList<Day>();

		}

		public void add(int num, boolean isWeekend, boolean isHoliday, TitleDay titleDay) {
			days.add(new Day(num, isWeekend, isHoliday, titleDay));
		}

		public List<Day> getDays() {
			return days;
		}

		public void setDays(List<Day> days) {
			this.days = days;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((days == null) ? 0 : days.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Week other = (Week) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (days == null) {
				if (other.days != null)
					return false;
			} else if (!days.equals(other.days))
				return false;
			return true;
		}

		private Calendar getEnclosingInstance() {
			return Calendar.this;
		}

		@Override
		public String toString() {
			return "Week [days=" + days + "]";
		}

	}

	class Day {

		private int num;
		private boolean isWeekend;
		private boolean isHoliday;
		private TitleDay titleDay;

		public Day() {

		}

		public Day(int num, boolean isWeekend, boolean isHoliday, TitleDay titleDay) {
			this.num = num;
			this.isWeekend = isWeekend;
			this.isHoliday = isHoliday;
			this.titleDay = titleDay;
		}

		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}

		public boolean isWeekend() {
			return isWeekend;
		}

		public void setWeekend(boolean isWeekend) {
			this.isWeekend = isWeekend;
		}

		public boolean isHoliday() {
			return isHoliday;
		}

		public void setHoliday(boolean isHoliday) {
			this.isHoliday = isHoliday;
		}

		public TitleDay getTitleDay() {
			return titleDay;
		}

		public void setTitleDay(TitleDay titleDay) {
			this.titleDay = titleDay;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + (isHoliday ? 1231 : 1237);
			result = prime * result + (isWeekend ? 1231 : 1237);
			result = prime * result + num;
			result = prime * result + ((titleDay == null) ? 0 : titleDay.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Day other = (Day) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (isHoliday != other.isHoliday)
				return false;
			if (isWeekend != other.isWeekend)
				return false;
			if (num != other.num)
				return false;
			if (titleDay != other.titleDay)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Day [num=" + num + ", isWeekend=" + isWeekend + ", isHoliday=" + isHoliday + ", titleDay="
					+ titleDay + "]";
		}

		private Calendar getEnclosingInstance() {
			return Calendar.this;
		}

	}

	public List<Month> getMonths() {
		return months;
	}

	public void setMonths(List<Month> months) {
		this.months = months;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((months == null) ? 0 : months.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calendar other = (Calendar) obj;
		if (months == null) {
			if (other.months != null)
				return false;
		} else if (!months.equals(other.months))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Calendar [months=" + months + "]";
	}

}
