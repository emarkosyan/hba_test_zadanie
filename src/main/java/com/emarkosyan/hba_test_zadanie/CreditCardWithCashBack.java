package com.emarkosyan.hba_test_zadanie;

public class CreditCardWithBonus extends CreditCard {

    private final double cashback;

    public CreditCardWithBonus(long BALANCE, long creditLimit, double cashback) {
        super(BALANCE, creditLimit);
        this.cashback = cashback;
    }

    @Override
    public boolean toPay(long sum) {
        boolean success = super.toPay(sum);
        if(success && sum >= 5000) {
            setBALANCE(getBALANCE() + (long)(sum * cashback));
        }
        return success;
    }

    @Override 
    public void getBankAccountInfo() {
        super.getBankAccountInfo();
        System.out.println(getCashback());
    }

    public double getCashback() {
        return cashback;
    }
}
