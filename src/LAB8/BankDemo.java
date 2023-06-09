package LAB8;

import java.util.Scanner;

class Bank {
    protected int interest;
    Scanner sc;

    void getRateOfInterest() {
        System.out.print("Bank rate: ");
        sc = new Scanner(System.in);

        interest = sc.nextInt();
    }
}

class SBI extends Bank {
    Scanner sc;

    void getRateOfInterest() {
        System.out.print("SBI rate: ");
        sc = new Scanner(System.in);

        super.interest = sc.nextInt();
    }
}

class ICICI extends Bank {
    Scanner sc;

    void getRateOfInterest() {
        System.out.print("ICICI rate: ");
        sc = new Scanner(System.in);

        super.interest = sc.nextInt();
    }
}

class AXIS extends Bank {
    Scanner sc;

    void getRateOfInterest() {
        System.out.print("AXIS rate: ");
        sc = new Scanner(System.in);

        super.interest = sc.nextInt();
    }
}

public class BankDemo {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.getRateOfInterest();

        ICICI icici = new ICICI();
        icici.getRateOfInterest();

        AXIS axis = new AXIS();
        axis.getRateOfInterest();
    }
}
