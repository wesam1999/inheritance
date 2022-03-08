package inheritance;

import java.util.ArrayList;

public class Shop {
    private String name;
    private String description;
    private int  numberOfDollarSigns;
    private ArrayList<Review> arr=new ArrayList<>();

    public Shop(String name, String description, int numberOfDollarSigns) {
        this.name = name;
        this.description = description;
        this.numberOfDollarSigns = numberOfDollarSigns;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numberOfDollarSigns=" + numberOfDollarSigns +
                '}';
    }
    public void addReview(Review a){
        arr.add(a);

    }

}
