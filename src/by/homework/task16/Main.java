package by.homework.task16;


import by.homework.task16.entity.Account;
import by.homework.task16.entity.Bank;
import by.homework.task16.exception.AccountNotFoundException;
import by.homework.task16.exception.NotEnoughMoneyException;

//6. В классе Main создайте пять счетов. Добавьте эти счета в банк (класс Bank)
    public class Main {
        public static void main(String[] args) {

            Bank bank = new Bank();
            Account a1 = new Account(1, "123", "BYN", 500.00);
            Account a2 = new Account(2, "124", "BYN", 1500.00);
            Account a3 = new Account(3, "125", "BYN", 500.00);
            Account a4 = new Account(4, "126", "BYN", 2500.00);
            Account a5 = new Account(5, "127", "BYN", 700.00);

            bank.addAccount(a1);
            bank.addAccount(a2);
            bank.addAccount(a3);
            bank.addAccount(a4);
            bank.addAccount(a5);


            try {
                // перевод
                bank.transferMoney("123", "124", 150.00);

            } catch (AccountNotFoundException e) {
                System.out.println("Откройте счёт в нашем банке для выполнения переводов");

            } catch (NotEnoughMoneyException e) {
                System.out.println("Недостаточно средств для перевода");

            } finally {
                System.out.println("Спасибо, что воспользовались услугами банка");
            }
//
//        для проверки остатков
//        System.out.println(a1);
//        System.out.println(a2);
        }
    }

