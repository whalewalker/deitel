package Java.com.javaChapter5;

public class AutoPolicy {
    private int accountNumber;

    public AutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    private String makeAndModel;
    private String state;



    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        if(state.equals("MA") || state.equals("NJ") || state.equals("NY") ||
                state.equals("PA") || state.equals("CT") || state.equals("ME") || state.equals("NH") || state.equals("VT")){
            this.state = state;
        }else {
            System.out.println("Invalid state, here are the state that are available :" +
                    "CT for Connecticut\nMA for Massachusetts\n");
        }

    }

    public boolean IsNotFaultState(){
        boolean noFaultState = false;
        switch (getState()){
            case "MA": case "NJ": case "NY": case "PA":
            case "CT": case "ME": case "NH":
            case "VT":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }
        return noFaultState;
    }

}
