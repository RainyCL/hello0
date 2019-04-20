package account;

public class CheckingAccount extends Account {
    public double overdraftProtection;
    public CheckingAccount(double balance){
        super(balance);
    }
    public CheckingAccount(double balance,double protect){
        super(balance);
        this.overdraftProtection=protect;

    }
    public double  withdraw(double amt) throws  OverdraftException{
        double a;
        if(amt>this.balance+overdraftProtection){
            OverdraftException e=new OverdraftException();
            e.deficit =amt -(this.balance+overdraftProtection);
            throw new OverdraftException("透支额度超标",e.getDificit());
        }
        else{
            overdraftProtection =overdraftProtection+this.balance-amt;
            return overdraftProtection;}
    }
    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount(5000,3000);
        try {
            ca.withdraw(9000);
            System.out.println("账户余额:" + ca.getBalance() + "\n透支额度:" + ca.overdraftProtection);
        } catch (OverdraftException e) {
            System.out.println("超过透支额度" + e.getDificit() + "元");
            e.printStackTrace();
        }
    }
}
