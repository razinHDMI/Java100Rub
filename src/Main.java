import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Переменные
        int initialAccount = 100;
        int depositAmount = 1100;
        int bonusAmountEach100Rubles = 1;
        int minDeposit = 1000;

        //Вычисления
        int bonusRubles;
        if (depositAmount > minDeposit) {
            bonusRubles = depositAmount / bonusAmountEach100Rubles / 100;
        } else {
            bonusRubles = 0;
        }
        int finalAccount = initialAccount + depositAmount + bonusRubles;

        //Вывод результата
        System.out.println("Вы пополнили счёт на " + depositAmount + " рублей. Вам начислено " + bonusRubles + " бонусных рублей. Теперь на Вашем счету " + finalAccount + " рублей.");
    }
}
