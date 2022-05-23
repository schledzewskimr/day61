public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object object){
        if (this == object){
            return true;
        }
        if (object == null){
            return false;
        }
        if(getClass() != object.getClass()){
            return false;
        }
        Item other = (Item) object;
        if(!this.name.equals(other.name)){
            return false;
        }
        return true;
    }

}