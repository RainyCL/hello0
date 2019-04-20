package account;

public class Account {
    public double balance;
    public  Account(){};
    public Account(double init) {
        balance=init;
    };
    public double getBalance(){
        return balance;
    }
    public double deposit(double amt){
        balance=balance+amt;
        return balance;
    };
    public double withdraw(double amt) throws OverdraftException{
        balance=balance-amt;
        if(balance<0){
            throw new OverdraftException("余额不足" );
        }
        return balance;
    };
    public class OverdraftException extends Exception{
        public double deficit;
        public  OverdraftException(){}
        public  OverdraftException(String msg){
            super(msg);
        }
        public OverdraftException(String msg,double deficit){
            super(msg);
            this.deficit=deficit;
        }

        public  double getDificit(){
            return  deficit;
        }
    }
    public static void main(String[] args)  {
        Account a=new Account(4000);
        Account b=new Account();
        a.deposit(1000);
        try{
            a.withdraw(6000);
        }catch (OverdraftException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }
}
