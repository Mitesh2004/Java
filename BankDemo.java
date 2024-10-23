class Account {
    String custName;
    int accNo;

    Account() {
        custName = "";
        accNo = 0;
    }

    Account(String custName, int accNo) {
        this.custName = custName;
        this.accNo = accNo;
    }
}

class SavingAccount extends Account {
    double savingBal;
    double minBal;

    SavingAccount() {
        super();
        savingBal = 0;
        minBal = 0;
    }

    SavingAccount(String custName, int accNo, double savingBal, double minBal) {
        super(custName, accNo);
        this.savingBal = savingBal;
        this.minBal = minBal;
    }
}

class AccountDetail extends SavingAccount {
    double depositAmt;
    double withdrawalAmt;

    AccountDetail(String custName, int accNo, double savingBal, double minBal, double depositAmt, double withdrawalAmt) {
        super(custName, accNo, savingBal, minBal);
        this.depositAmt = depositAmt;
        this.withdrawalAmt = withdrawalAmt;
    }

    void display() {
        System.out.println("Customer Name: " + custName);
        System.out.println("Account No: " + accNo);
        System.out.println("Saving Balance: " + savingBal);
        System.out.println("Minimum Balance: " + minBal);
        System.out.println("Deposit Amount: " + depositAmt);
        System.out.println("Withdrawal Amount: " + withdrawalAmt);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        AccountDetail ad = new AccountDetail("John Doe", 123456, 10000, 500, 2000, 1000);
        ad.display();
    }
}
