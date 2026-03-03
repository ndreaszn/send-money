import java.time.LocalDateTime;

public class Transaction {

    private double amount;
    private String who;
    private LocalDateTime today;

    public Transaction(double amount, String who,  LocalDateTime today) {
        this.amount = amount;
        this.who = who;
        this.today = LocalDateTime.now();
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getWho() {
        return who;
    }
    public void setWho(String who) {
        this.who = who;
    }

    public LocalDateTime getToday() {
        return today;
    }

}
