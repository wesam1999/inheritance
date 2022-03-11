package inheritance;

import java.util.ArrayList;

public class Theater extends Department {

    private ArrayList<String> movies=new ArrayList<>();

    public Theater(String name, int star) {
        super(name, star);
    }

    public void addMovies(String M){
        movies.add(M);

    }
    public void removeMovie(String M){
      if (movies.contains(M)){movies.remove(M);}else {
          System.out.println("we already have the Movies"+movies);
      }

    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + super.getName() + '\'' +
                "number='" + super.getReviews() + '\'' +
                ", movies=" + movies +
                '}';
    }
}
