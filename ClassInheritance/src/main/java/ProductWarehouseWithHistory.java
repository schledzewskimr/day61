public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        this.changeHistory = new ChangeHistory();
        setInitialBalance(initialBalance);
    }
    private void setInitialBalance(double initialBalance){
        changeHistory.add(initialBalance);
        super.addToWarehouse(initialBalance);
    }

    public String history(){
        return changeHistory.toString();
    }

    public void printAnalysis(){
        System.out.println(
                "Product: " + super.getName() + "\nHistory: " + changeHistory + "\nLargest amount of product: " + changeHistory.maxValue() + "\nSmallest amount of product: " + changeHistory.minValue() + "\nAverage: " + changeHistory.average()
        );
    }

    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        changeHistory.add(super.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount){
        double amountTaken = super.takeFromWarehouse(amount);
        changeHistory.add(super.getBalance());
        return amountTaken;
    }
}
