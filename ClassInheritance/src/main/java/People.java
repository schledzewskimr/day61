import java.util.ArrayList;

public class People {
    public static void main(String[] args){
        ArrayList<Person> persons = new ArrayList<Person>();

        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);
    }
    public static void printPersons(ArrayList<Person> persons){
        for(Person person:persons){
            System.out.println(person.toString());
        }
    }
    public static class Person{
        private String name;
        private String address;
        public Person(String name, String address){
            this.name = name;
            this.address = address;
        }
        public String toString(){
            return name + "\n   "+ address;
        }
    }
    public static class Student extends Person{
        private String name;
        private String address;
        private int credits;

        public Student(String name, String address) {
            super(name, address);
            this.name = name;
            this.address = address;
            this.credits = 0;
        }
        public int credits(){
            return credits;
        }
        public void study(){
            credits++;
        }
        public String toString(){
            return this.name + "\n     " + this.address + "\n     Study credits: " + this.credits;
        }
    }
    public static class Teacher extends Person{
        private String name;
        private String address;
        private int pay;
        public Teacher(String name, String address, int pay) {
            super(name, address);
            this.name = name;
            this.address = address;
            this.pay = pay;
        }
        public String toString(){
            return this.name + "\n     " + this.address + "\n     Salary: " + this.pay + " Euro/month";
        }
    }
}
