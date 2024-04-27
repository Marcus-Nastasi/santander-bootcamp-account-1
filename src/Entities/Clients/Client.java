package Entities.Clients;

import Entities.Accounts.Account;
import Entities.Agencies.Agency;

public class Client {

    private String name;
    private Agency agency;
    private Account account;

    public Client(String name, Agency agency, Account account) {
        this.name = name;
        this.agency = agency;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
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

