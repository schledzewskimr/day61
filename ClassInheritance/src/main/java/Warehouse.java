
public class Warehouse {
    private double capacity;
    private double balance;

    public static void main(String[] args){
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(1.0);
//System.out.println(juice.history()); // [1000.0, 988.7, 989.7]

        juice.printAnalysis();
    }
    public Warehouse(double capacity){
        this.capacity = capacity;
        if (capacity<=0){
            this.capacity = 0;
        }
    }
    public double getBalance(){
        return this.balance;
    }
    public double getCapacity(){
        return this.capacity;
    }
    public double howMuchSpaceLeft(){
        return this.capacity - this.balance;
    }
    public void addToWarehouse(double amount){
        if(amount < 0){
            return;
        }
        if(amount <= howMuchSpaceLeft()){
            this.balance = this.balance + amount;
        }
        else{
            this.balance = this.capacity;
        }
    }
    public double takeFromWarehouse(double amount){
        if (amount < 0){
            return 0;
        }
        if (amount > this.balance){
            double maxFit = this.balance;
            this.balance = 0;
            return maxFit;
        }
        this.balance = this.balance - amount;
        return amount;
    }
    public String toString(){
        return "balance = " + this.balance + ", space left: " + (double)Math.round(howMuchSpaceLeft()*100)/100;
    }
}
