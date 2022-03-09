/**
 * Created by Grant on 4/12/2018.
 */
//Start of account class
public class Account {
    private int AccountAge;
    private double Balance;
    private String Bank;
    //might need to make a transation class

    public Account(){};

    public Account(String Bank,int Balance){
        this.Balance = Balance;
                this.Bank = Bank;
    }


    double getBalance(){
        return this.Balance;
    }
    int getAccountAge(){
        return this.AccountAge;
    }
    String getBank(){
        return this.Bank;
    }

    void setBalance(int x){
        this.Balance = x;
    }

    void setAccountAge(int x){
        this.AccountAge =x;
    }

    void setBank(String x){
        this.Bank =x;
    }

}
//End of account class
