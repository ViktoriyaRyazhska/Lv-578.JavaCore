import lombok.Getter;

import java.util.List;

@Getter
public enum Continent {
    AFRICA(List.of("Niger", "Mali", "Chad", "Kenia")),
    SOUTH_AMERICA(List.of("Argentina", "Bolivia", "Peru", "Brazil")),
    NORTH_AMERICA(List.of("Honduras", "Jamaica", "Mexico", "United States")),
    EURASIA(List.of("China", "Russia", "Ukraine", "France")),
    AUSTRALIA(List.of("Australia")),
    ANTARCTICA(List.of("Antarctica"));

    public List<String> getCountries() {
        return countries;
    }

    private final List<String> countries;

     Continent(List<String> countries) {
        this.countries = countries;
    }

}
