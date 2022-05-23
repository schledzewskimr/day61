import java.util.ArrayList;
public class ChangeHistory {
    private ArrayList<Double> history;
    public ChangeHistory(){
        this.history = new ArrayList<>();
    }
    public void add(double status){
        this.history.add(status);
    }
    public void clear(){
        this.history.clear();
    }
    public double maxValue(){
        int largest=0;
        for (int i = 1; i < history.size(); i++) {
            if ( history.get(i) > history.get(largest)) {
                largest = i;
            }
        }
        return history.get(largest);
    }

    public double minValue(){
        int smallest=0;
        for(int i=1;i<history.size();i++){
            if(history.get(i)< history.get(smallest)){
                smallest=i;
            }
        }
        return history.get(smallest);
    }

    public double average(){
        double sum = 0;
        for(Double inventory : history){
            sum += inventory;
        }
        return (double)Math.round(sum/history.size()*100)/100;
    }

    public String toString(){
        return history.toString();
    }
}
