import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class BizumModel {

    private double totalAmount;
    ArrayList <Transaction> transactions;

    public BizumModel(double totalAmount, ArrayList<Transaction> transactions) {
        this.totalAmount = 0;
        this.transactions = new ArrayList<>();
    }

    public double getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void addAmount(double amount) {
        this.totalAmount += amount;
    }
    public void resetAmount () {
        this.totalAmount = 0;
    }

    public void sendBizum (String who) {
        Transaction newTransaction = new Transaction(totalAmount, who);
        transactions.add(newTransaction);
        resetAmount(); //Para hacer reset a la cantidad del bizum, si este método se irian sumando 20+50+10,...
    }
}
