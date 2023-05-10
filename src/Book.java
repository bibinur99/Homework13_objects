import java.util.Objects;
public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, Author author, int year) {   // method
        this.name = name;
        this.author = author;
        this.year = year;
    }
    public String getName() {    // название книги
        return this.name;
    }

    public int getYear() {        // год издания
        return this.year;
    }
    public void setYear(int year) {   // год издания
        this.year = year;
    }

   @Override
   public String toString( ) {
        return name + ", " + author.getAuthorName()+ " " + author.getAuthorSurname()+", "+ year;
   }

   @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        } else {
            Book book = (Book) other;
            return Objects.equals(name, book.name);
        }
   }
   @Override
   public int hashCode() {
        return java.util.Objects.hash(name);
   }

}