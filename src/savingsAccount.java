/**
 * Created by Grant on 4/12/2018.
 */
//start of savings account
public class savingsAccount extends Account{
    double interestRate,withdrawlLimit;

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setWithdrawlLimit(double withdrawlLimit) {
        this.withdrawlLimit = withdrawlLimit;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getWithdrawlLimit() {
        return withdrawlLimit;
    }
}
//end of savings account
