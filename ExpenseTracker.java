import java.util.ArrayList;

public class ExpenseTracker {
    private ArrayList<Transaction> transactions;

    public ExpenseTracker() {
        transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public double getBalance() {
        double balance = 0;
        for (Transaction t : transactions) {
            if (t.isIncome()) {
                balance += t.getAmount();
            } else {
                balance -= t.getAmount();
            }
        }
        return balance;
    }

    public void showTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t.getDescription() + " - " + (t.isIncome() ? "Income" : "Expense") + ": " + t.getAmount());
        }
    }
}
