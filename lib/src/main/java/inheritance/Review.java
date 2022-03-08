package inheritance;

class Review  {

  private   String body;
   private String author;
   private int number;

    public Review(int number,String body ,String author) {
      this.number=number;
        this.body = body;
        this.author = author;

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

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
