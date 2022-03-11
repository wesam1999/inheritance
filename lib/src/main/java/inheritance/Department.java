package inheritance;

import java.util.ArrayList;

public class Department {
private String name;
private int number ;
private ArrayList<Review> arr=new ArrayList<>();
private double numReviws;
private  double numberFromReview;
private double sum=0;


    public Department(String name, int star) {
        this.name = name;
        this.number = star;
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

    public int getNumber() {
        return number;
    }

    public ArrayList<Review> getArr() {
        return arr;
    }
    public ArrayList<Review> getReviews(){return arr;}

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", star=" + number +
                ", arr=" + arr +
                '}';
    }
}
