package com.design.pattern.chain_of_responsibilities.github;

public class Main {
    public static void main(String[] args) throws Exception {
        Bank bank = new Bank(100f);
        Paypal paypal = new Paypal(200f);
        UnionPay unionPay = new UnionPay(300);
        bank.setNext(paypal);
        paypal.setNext(unionPay);

        bank.pay(259f);
    }
}
