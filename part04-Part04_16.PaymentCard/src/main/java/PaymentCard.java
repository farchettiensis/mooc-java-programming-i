
/**
 *
 * @author fernando.archetti
 */
public class PaymentCard {

    private double balance;
    private final double affordableMealCost;
    private final double heartyMealCost;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
        this.affordableMealCost = 2.6;
        this.heartyMealCost = 4.6;
    }

    public void eatAffordably() {
        if (this.balance >= affordableMealCost) {
            this.balance -= affordableMealCost;
        }
    }

    public void eatHeartily() {
        if (this.balance >= heartyMealCost) {
            this.balance -= heartyMealCost;
        }
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            this.balance += amount;
            if (this.balance > 150) {
                this.balance = 150;
            }
        }
    }

    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
