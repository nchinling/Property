import javax.lang.model.element.TypeElement;

public class House{

    //members
    private String type;
    private String town;
    private double size;
    private double price;
    private Boolean isFreehold;
    private int builtYear;

    //constructor
    public House(String type, String town, double size, double price, Boolean isFreehold, int builtYear){
        this.type = type;
        this.town = town;
        this.size = size;
        this.price = price;

    }
}