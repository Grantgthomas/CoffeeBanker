/**
 * Created by Grant on 4/12/2018.
 */
//Start of Income
public class Transaction{
    private double amount;
    private int frequencey;
    private String Company;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public void setFrequencey(int frequencey) {
        this.frequencey = frequencey;
    }

    public double getAmount() {
        return amount;
    }

    public int getFrequencey() {
        return frequencey;
    }

    public String getCompany() {
        return Company;
    }
}
//End of income