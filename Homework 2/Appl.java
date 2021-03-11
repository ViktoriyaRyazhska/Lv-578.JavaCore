public class Appl {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Petro","Petrenko");
        Person p3 = new Person("Mykola","Mykolenko");
        Person p4 = new Person("Dmytro","Dmytrenko");
        Person p5 = new Person("Illia", "Illenko");

        p1.input();
        p2.input();
        p3.input();
        p4.input();
        p5.input();

        p1.output();
        p2.output();
        p3.output();
        p4.output();
        p5.output();

        p1.changeName("Ivan","Ivanenko");
        p1.output();


    }
}
