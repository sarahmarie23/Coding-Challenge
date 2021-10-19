class Bank {
    long[] balance;
    int numberOfAccts;

    public Bank(long... balance) {
        this.balance = balance;
        this.numberOfAccts = balance.length;
    }
    
    public boolean transfer(int account1, int account2, long money) {
        
        if(account1 > numberOfAccts || account1 < 1){ // invalid account number
            return false;
        }
        if(account2 > numberOfAccts || account2 < 1){ // invalid account number
            return false;
        }
        
        if(balance[account1-1] < money){ // not enough money to transfer 
            return false;
        } 
        
        balance[account1-1] -= money;
        balance[account2-1] += money;
        
        return true;
    }
    
    public boolean deposit(int account, long money) {
        
        if(account > numberOfAccts || account < 1){ // invalid account number
            return false;
        }
        if(money > 0){
            balance[account-1] += money;
        } 
        
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        
        if(account > numberOfAccts || account < 1){ // invalid account number
            return false;
        }
        
        
        if(balance[account-1] < money){ // not enough money to withdraw 
            return false;
        } 
        balance[account-1] -= money;
        
        return true;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */
