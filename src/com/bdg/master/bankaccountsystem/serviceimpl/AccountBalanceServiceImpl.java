package com.bdg.master.bankaccountsystem.serviceimpl;


import com.bdg.master.bankaccountsystem.entity.AccountBalance;
import com.bdg.master.bankaccountsystem.service.AccountBalanceService;
import com.bdg.master.json.parser.JsonParseResult;
import com.bdg.master.json.parser.JsonParseResults;
import com.bdg.master.json.parser.JsonParser;
import com.bdg.master.json.parser.SimpleJsonParser;

public class AccountBalanceServiceImpl implements AccountBalanceService {


    private final JsonParser accountBalanceJsonParser = new SimpleJsonParser();

    @Override
    public AccountBalance create(final double balance) {
        return new AccountBalance(balance);
    }

    @Override
    public AccountBalance create(final String balanceContent) {
        JsonParseResults results = accountBalanceJsonParser.doParse(balanceContent);
        for (final JsonParseResult jpr : results.getResults()) {
            if (jpr.getJsonKey().equals("balance")) {
                return new AccountBalance(Double.valueOf(jpr.getJsonValue()));
            }
        }
        return null;
    }

    public static void main(String[] args) {
        AccountBalanceService accountBalanceService = new AccountBalanceServiceImpl();
        accountBalanceService.create(100.0);
        String balance = "{\n balance: 23.45 \n }";
        AccountBalance accountBalance = accountBalanceService.create(balance);
        System.out.println("accountBalance = " + accountBalance);
    }
}
