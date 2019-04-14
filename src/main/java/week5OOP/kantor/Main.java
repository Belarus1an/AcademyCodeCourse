package week5OOP.kantor;

public class Main {
    public static void main(String[] args) {

        double d = CurrencyConverter.convert(Currency.EUR, Currency.PLN);

        System.out.println(d);

        ExchangeOffice ex = new ExchangeOffice(10000);
        ex.showFunds();
        ex.exchange(100, Currency.PLN, Currency.EUR);
        ex.showFunds();
    }
}
