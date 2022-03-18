class Bank {
    long[] val;

    public Bank(long[] balance) {
        val = balance;
    }
    
    boolean check(int account) {
        return 1 <= account && account <= val.length;
    }

    public boolean transfer(int account1, int account2, long money) {
        if(!check(account1) && !check(account2))
            return false;
        if(val[account1 - 1] >= money) {
            val[account1 - 1] -= money;
            val[account2 - 1] += money;
            return true;
        }
        return false;
    }
    
    public boolean deposit(int account, long money) {
        if(!check(account))
            return false;
        val[account - 1] += money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(!check(account))
            return false;
        if(val[account - 1] >= money) {
            val[account - 1] -= money;
            return true;
        }
        return false;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */
