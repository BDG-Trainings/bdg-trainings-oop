package bas;

public class Main {
    public static void main(String[] args) {

        Country cName = Country.findByCountryName("Afghanistan");
        Country cCode = Country.findByNumericCode("380");

        System.out.println(cName);
        System.out.println(cCode);

    }
}
