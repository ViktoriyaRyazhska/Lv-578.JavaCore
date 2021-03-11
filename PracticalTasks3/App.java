
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee eIvan = new Employee("Ivan", 1800, 5);
		Employee eKola = new Employee("Kola", 1000, 7.2);
		Employee eIhor = new Employee("Ihor", 1200, 6);
		
		System.out.println(eIvan);
		System.out.println(eKola);
		System.out.println(eIhor);
		System.out.println("TotalSum: " + eIvan.getTotalSum());
		
	}

}
