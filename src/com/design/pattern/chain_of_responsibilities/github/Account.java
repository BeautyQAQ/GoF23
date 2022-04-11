package com.design.pattern.chain_of_responsibilities.github;

/**
 * 基本账户
 */
public abstract class Account {
    /**
     * 继任
     */
    private Account successor;

    protected float balance;

    /**
     * 设置下一个责任人
     * @param account 账户
     */
    public void setNext(Account account){
        this.successor = account;
    }

    public void pay(float amountToPay) throws Exception{
        if (this.canPay(amountToPay)) {
            System.out.println("Paid "+amountToPay+" using "+this.getClass().getSimpleName());
        }else if (this.successor != null){
            System.out.println("Cannot pay using "+this.getClass().getSimpleName()+" Proceeding ..");
            this.successor.pay(amountToPay);
        }else{
            throw new Exception(" None of the accounts have enough balance");
        }
    }

    public boolean canPay(float amount){
        return this.balance>=amount;
    }
}
