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
}
