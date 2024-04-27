import Entities.Accounts.Account;
import Entities.Agencies.Agency;
import Entities.Clients.Client;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        Locale locale = Locale.US;
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        String agencyNumber = sc.next();
        System.out.print("\nPor favor, digite o número da conta: ");
        int accountNumber = sc.nextInt();
        System.out.print("\nInsira seu nome: ");
        String clientName = sc.next();
        System.out.print("\nInsira o saldo da conta: ");
        Double amount = sc.nextDouble();

        Agency agency = new Agency(agencyNumber);
        Account account = new Account(accountNumber, amount);

        Client client = new Client(clientName, agency, account);

        System.out.println("\n"+client);

        sc.close();
    }
}

