package property;

import javax.lang.model.element.TypeElement;

public class House{

    //members
    private String type;
    private String town;
    private String size;
    private double price;
    private Boolean isFreehold;
    private int builtYear;
    private Boolean isAvailable = true;

    //constructor
    public House(String type, String town, String size, double price, Boolean isFreehold, int builtYear, String isAvailable){
        this.type = type;
        this.town = town;
        this.size = size;
        this.price = price;
        this.isFreehold = isFreehold;
        this.builtYear = builtYear;
        this.isAvailable = true;

    }

    public House(String type, String town, String size, double price, Boolean isFreehold, int builtYear){
        this.type = type;
        this.town = town;
        this.size = size;
        this.price = price;
        this.isFreehold = isFreehold;
        this.builtYear = builtYear;
        this.isAvailable = true;
    }

    public String getType() {return type;}
    public void setType(String type) {this.type = type;}

    public String getTown() {return town;}
    public void setTown(String town) {this.town = town;}

    public String getSize() {return size;}
    public void setSize(String size) {this.size = size;}

    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}

    public Boolean getIsFreehold() {return isFreehold;}
    public void setIsFreehold(Boolean isFreehold) {this.isFreehold = isFreehold;}

    public int getBuiltYear() {return builtYear;}
    public void setBuiltYear(int builtYear) {this.builtYear = builtYear;}

    public Boolean getIsAvailable() {return isAvailable;}
    public void setIsAvailable(Boolean isAvailable) {this.isAvailable = isAvailable;}


    public void buy(double price){
        if (!this.isAvailable){
            System.out.printf("The %s is not available for sale.\n", this.type);
        }
        else
        System.out.printf("Congratulations on purchasing your house for $%.2f\n",price);
        this.isAvailable = false;
    }

    public void remainingLease(){
        int leaseLeft =  (1000 -(2023 - this.builtYear));
        System.out.printf("There is %d years left in the lease.", leaseLeft);
    }

    //Operator overriding for string
    @Override
    public String toString() {
        return "House [type=" + this.type + ", town=" + this.town + '\''+
        "} $ " + this.price;
    }


}
