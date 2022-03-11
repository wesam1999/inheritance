package inheritance;

class Review  {

  private   String body;
   private String author;
   private int number;
   private String moviesName="";

    public Review(int number,String body ,String author) {
      this.number=number;
        this.body = body;
        this.author = author;

    }


public void updateStars(int a){
setNumber(a);


}

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }


    public int getNumber() {
        return number;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setMoviesName(String moviesName) {
        this.moviesName = moviesName;
    }

    @Override
    public String toString() {
        if (moviesName.isEmpty()) {
            return "Review{" +
                    "body='" + body + '\'' +
                    ", author='" + author + '\'' +
                    ", number='" + number + '\'' +
                    '}';
        }else {
            return "Review{" +
                    "body='" + body + '\'' +
                    ", author='" + author + '\'' +
                    ", number='" + number + '\'' +
                    ", movies name='" + moviesName + '\'' +
                    '}';
        }
        }
}
