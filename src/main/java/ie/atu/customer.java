package ie.atu;

public class customer extends person {
    public customer() {
    }
    private String cusNum;
    private boolean mailingList;

    public customer(String name, String address, String phoneNumber, String cusNum, boolean mailingList) {
        super(name, address, phoneNumber);
        this.cusNum = cusNum;
        this.mailingList = mailingList;
    }

    public String getCusNum() {
        return cusNum;
    }

    public void setCusNum(String cusNum) {
        this.cusNum = cusNum;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return super.toString() + "customer{" +
                "cusNum='" + cusNum + '\'' +
                ", mailingList=" + mailingList +
                '}';
    }
}
