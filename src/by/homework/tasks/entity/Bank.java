package by.homework.tasks.entity;

import by.homework.tasks.exception.AccountNotFoundException;
import by.homework.tasks.exception.NotEnoughMoneyException;

import java.util.HashSet;
import java.util.Set;

public class Bank {

    //2. Создать класс Банк.  В классе банка будет одно поле: коллекция из счетов (Set<Account> accounts)
    private Set<Account> accounts = new HashSet<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

    private Account findAccount(String number) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(number)) {
                return account;
            }
        }
        return null; // если ничего не найдено
    }

    //5. В классе банк реализовать метод перевода денежных средств с одного счёта на другой. Сигнатура метода будет такая:
    //public void transferMoney(String  accountNumberFrom, String accountNumberTo, Double amount)
    //5.1 Если в банке отсутствует номер счёта с которого переводят деньги или номер счёта куда переводят деньги, выбрасывает своё исключение AccountNotFoundException с errorCode= not.found.account
    //5.2 Если на счёте, с которого переводят деньги, сумма меньше переводимой то выбросить своё исключение NotEnoughMoneyException с errorCode=not.enough.money.
    //5.3  Соответсвтенно выполните логику перевода денег в белорусской валюте (отнимаете переводимую сумму со счёта, с которого идёт перевод и прибавляете сумму перевода счёту,на который происходит перевод. При этом сначала надо найти счета по переданным номерам в банке.

    public void transferMoney(String accountNumberFrom, String accountNumberTo, Double amount) {

        Account from = findAccount(accountNumberFrom);
        Account to = findAccount(accountNumberTo);

        if (from == null || to == null) {
            throw new AccountNotFoundException(
                    "Account not found",
                    "not.found.account"
            );
        }

        if (from.getBalance() < amount) {
            throw new NotEnoughMoneyException(
                    "Not enough money",
                    "not.enough.money"
            );
        }

        // перевод
        from.setBalance(from.getBalance() - amount);
        to.setBalance(to.getBalance() + amount);

        System.out.println("Перевод выполнен успешно!");
    }
}