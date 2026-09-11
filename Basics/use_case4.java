public class use_case4 {
    public static void main(String[] args) {
        double balance = 5000.0;
        double withdrawAmount = 7500.0;
        try{
            withdrawAmount(balance,withdrawAmount);

        }
        catch(InsufficientBalanceException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Transaction completed");
        }
 
        // TODO: call withdraw() inside a try block,
        // catch InsufficientBalanceException,
        // and use finally to print "Transaction attempt completed."
    }
    static class InsufficientBalanceException extends Exception{
        InsufficientBalanceException(String msg){
            super(msg);
        }
    }
 
    static void withdrawAmount(double balance , double amount) throws InsufficientBalanceException{
        if(balance<amount ) throw new InsufficientBalanceException("Balance insufficient");
        System.out.println("Withdrawl successful with balance : "+(balance-amount));
    }
}


