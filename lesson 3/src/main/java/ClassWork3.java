import java.util.*;

public class ClassWork3 {
    private final Map<String, List<String>> dayMap;

    public ClassWork3() {
        dayMap = new HashMap<>();
        dayMap.put("1", List.of("Monday", "понеділок", "Lundi"));
        dayMap.put("2", List.of("Tuesday", "вівторок", "Mardi"));
        dayMap.put("3", List.of("Wednesday", "середа", "Mercredi"));
        dayMap.put("4", List.of("Thursday", "четвер", "Jeudi"));
        dayMap.put("5", List.of("Friday", "п'ятниця", "Vendredi"));
        dayMap.put("6", List.of("Saturday", "субота", "Samedi"));
        dayMap.put("7", List.of("Sunday", "неділя", "Dimanche"));

    }

    public void task1(int a, int b, int c) {
        if (a % 2 != 0) {
            System.out.println("a is odd");
        }
        if (b % 2 != 0) {
            System.out.println("b is odd");
        }
        if (c % 2 != 0) {
            System.out.println("c is odd");
        }
    }

    public List<String> task2(String day) {
        dayMap.get(day);
        switch (day) {
            case "1":
                return dayMap.get("1");
            case "2":
                return dayMap.get("2");
            case "3":
                return dayMap.get("3");
            case "4":
                return dayMap.get("4");
            case "5":
                return dayMap.get("5");
            case "6":
                return dayMap.get("6");
            case "7":
                return dayMap.get("7");
            default:
                return Collections.emptyList();

        }
    }

    public String task3(String country) {
        if (Continent.AFRICA.getCountries().contains(country)) {
            return Continent.AFRICA.toString();
        }
        if (Continent.ANTARCTICA.getCountries().contains(country)) {
            return Continent.ANTARCTICA.toString();
        }
        if (Continent.AUSTRALIA.getCountries().contains(country)) {
            return Continent.AUSTRALIA.toString();
        }
        if (Continent.EURASIA.getCountries().contains(country)) {
            return Continent.EURASIA.toString();
        }
        if (Continent.NORTH_AMERICA.getCountries().contains(country)) {
            return Continent.NORTH_AMERICA.toString();
        }
        if (Continent.SOUTH_AMERICA.getCountries().contains(country)) {
            return Continent.SOUTH_AMERICA.toString();
        }
        return "Wrong country";
    }

    public  void task4() {
        List<Product> products = new ArrayList<>();
        Product mostQuantity;
        Product mostExpensive;
        products.add(new Product("P1", 12.5, 300));
        products.add(new Product("P2", 16.5, 100));
        products.add(new Product("P3", 14.5, 500));
        products.add(new Product("P4", 2.5, 50));
        products.add(new Product("P5", 6.5, 200));
        mostExpensive = mostQuantity = products.get(0);
        for (Product product : products) {
            if (mostQuantity.getQuantity() < product.getQuantity()) {
                mostQuantity = product;
            }
            if (mostExpensive.getPrice()<product.getPrice()){
                mostExpensive = product;
            }
        }
        System.out.println("Most quantity : " + mostQuantity);
        System.out.println("Most expensive : " + mostExpensive );

    }
}
