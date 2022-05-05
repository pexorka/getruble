public class Main {
    public static void main(String[] args) {
        int account = 1000; //цена билета
        int accountReplenishment = 2000; //сумма пополнения счета
        int finalAccount; // сумма счета
        int numberBonusrubles = accountReplenishment / 100; // количество бонусов
        if (accountReplenishment >= 1000) {

            finalAccount = account + accountReplenishment + numberBonusrubles;
            System.out.println("Сумма вашего счета: " + (finalAccount));
            System.out.println("Количество бонусных рублей: " + (numberBonusrubles));
        } else {
            finalAccount = account + accountReplenishment;
            System.out.println("Сумма вашего счета: " + (finalAccount));
            System.out.println("Количество бонусных рублей: 0");

        }

    }
}
