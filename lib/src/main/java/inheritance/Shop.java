package inheritance;

public class Shop extends Department{

    private String description;
    private int  numberOfDollarSigns;


    public Shop(String name, int star,String description,int numberOfDollarSigns)  {
        super(name, star);
        this.description=description;
        this.numberOfDollarSigns=numberOfDollarSigns;

    }


    @Override
    public String toString() {
        return "Shop{" +
                "name='" + super.getName() + '\'' +
                "star='" + super.getNumber() + '\'' +
                "description='" + description + '\'' +
                ", numberOfDollarSigns=" + numberOfDollarSigns +
                '}';
    }
}
