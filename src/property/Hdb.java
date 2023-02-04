package property;
public class Hdb extends House {
    private Boolean forAllRace;

    //Constructor
    public Hdb(String town, String size, double price, int builtYear,
            Boolean forAllRace) {
        super("HDB", town, size, price, false, builtYear);
        this.forAllRace = forAllRace;
        

    }

    public Boolean getForAllRace() {return forAllRace;}
    public void setForAllRace(Boolean forAllRace) {this.forAllRace = forAllRace;}


    public void buy(double price){
        // super.getIsAvailable();
        if (!super.getIsAvailable()){
            System.out.printf("This HDB has been sold.\n");
        }else
        System.out.printf("You bought a HDB in %s. Congratulations on purchasing your for $%.2f. This is a good buy.\n", super.getTown(), price);
        super.setIsAvailable(false);
    }

    //Operator overriding
    @Override
    public void remainingLease(){
        int leaseLeft =  (99 -(2023 - super.getBuiltYear()));
        System.out.printf("There is %d years left in the lease.\n", leaseLeft);
    }

    
}
