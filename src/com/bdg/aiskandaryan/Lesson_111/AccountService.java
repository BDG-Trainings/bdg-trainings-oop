package com.bdg.aiskandaryan.Lesson_111;

public class AccountService {
    private Account[] accounts;
    private int accountsCount;
    private final int maxAccountsCount = 10;

    public AccountService() {
        this.accounts = new Account[maxAccountsCount];
        this.accountsCount = 0;
    }


}
