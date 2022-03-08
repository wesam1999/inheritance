package inheritance;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Restaurant {
private String name;
 private   double number;
 private   int price;
 private ArrayList<Review> arr=new ArrayList<>();
 private double numReviws;
 private  double numberFromReview;
 private double sum=0;

    public Restaurant(String name,  int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", number=" + sum/numReviws +'\'' +
                ", price=" + price +'\'' +
                "arr='" + arr + '\'' +
                '}';
    }
    public void addReview(Review a){
      arr.add(a);
      numReviws++;

        numberFromReview =(a.getNumber());
        sum=sum+numberFromReview;
    }

    public String getName() {
        return name;
    }

    public double getNumber() {
        return number;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
