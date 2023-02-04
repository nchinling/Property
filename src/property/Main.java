package property;


public class Main {
    public static void main(String[] args){
        House cl = new House("HDB", "Queenstown", "893sqm", 1200000, false, 2016);
        Hdb first = new Hdb("Tiong Bahru","893sqm",1500000,2016,true);
        Hdb second = new Hdb("Kallang","500sqm",700000,2017,true);
        
        cl.remainingLease();

        cl.buy(1400000);

        cl.buy(1500000);

        
        first.buy(3000000);
        first.remainingLease();
        // first.buy(5000000);
        second.buy(600000);
        // first.getForAllRace();
       
    }
}
