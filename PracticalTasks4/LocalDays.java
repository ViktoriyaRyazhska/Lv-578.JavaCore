package PracticalTasks4;

public enum LocalDays{
	EN("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"),
	RU("�����������", "�������", "�����", "�������", "�������", "�������", "�����������"),
	UA("��������", "³������", "������", "������", "ϒ������", "������", "�����");
	private String days[];

	LocalDays(String ... days) {
		this.days = days;
	}
	
	public String getDay(int i) {
		if(0 < i && i <= days.length) {
			i--;
			return days[i];
		}
		return "ERROR. Wrong input!";
	}
}
