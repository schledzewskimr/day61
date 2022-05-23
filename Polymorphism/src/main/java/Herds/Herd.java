package Herds;
import java.util.ArrayList;

public class Herd implements Movable{
    private ArrayList<Movable> movables;

    public Herd(){
        movables = new ArrayList<>();
    }
    public void addToHerd(Movable movable){
        movables.add(movable);
    }
    public void move(int dx, int dy){
        for(Movable movable : movables){
            movable.move(dx,dy);
        }
    }
    public String toString(){
        StringBuilder string = new StringBuilder();
        for (Movable movable : movables) {
            string.append(movable + "\n");
        }
        return string.toString();
    }
}
