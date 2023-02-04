package property;

public class Main {
    public static void main(String[] args){
        House cl = new House("HDB", "Queenstown", "893sqm", 1200000, false, 2016);

        cl.buy("HDB",1400000);

        cl.buy("HDB",1500000);
    }
}
