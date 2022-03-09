/**
 * Created by Grant on 4/12/2018.
 */
//Start of checkingAccount
public class checkingAccount extends Account{
    private String cardNumber,CVC,Zip;

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCVC(String CVC) {
        this.CVC = CVC;
    }

    public void setZip(String zip) {
        Zip = zip;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCVC() {
        return CVC;
    }

    public String getZip() {
        return Zip;
    }
}
//end of checking account
