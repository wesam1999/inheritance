package inheritance;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Restaurant extends Department{

 private   int price;

    public Restaurant(String name, int star,int price) {
        super(name, star);
    this.price=price;
    }


    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + super.getName() + '\'' +
                ", number=" + super.getReviews()+'\'' +
                ", price=" + price +'\'' +

                '}';
    }



    public int getPrice() {
        return price;
    }


}
