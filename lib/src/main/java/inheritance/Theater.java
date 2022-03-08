package inheritance;

import java.util.ArrayList;

public class Theater {
   private String name;

    private ArrayList<String> movies=new ArrayList<>();
    public Theater(String name) {
        this.name = name;

    }
    public void addMovies(String M){
        movies.add(M);

    }
    public void removeMovie(String M){
        movies.remove(M);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies=" + movies +
                '}';
    }
}
