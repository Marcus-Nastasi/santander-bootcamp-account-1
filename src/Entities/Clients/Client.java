package Entities.Clients;

import Entities.Accounts.Account;
import Entities.Agencies.Agency;

public class Client {

    private final String name;
    private final Agency agency;
    private final Account account;

    public Client(String name, Agency agency, Account account) {
        this.name = name;
        this.agency = agency;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public Agency getAgency() {
        return agency;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return(
            "Olá " + this.getName() + ", obrigado por criar uma conta em nosso banco, sua agência é " +
            this.agency.getNumber() + ", conta " + this.account.getAccountNumber() +
            " e o seu saldo " + this.account.getAmount() + " já está disponível para saque."
        );
    }
}

