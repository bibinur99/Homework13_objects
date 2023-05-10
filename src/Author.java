import java.util.Objects;
public class Author {
    private String authorName;
    private   String authorSurname;

    public Author(String authorName, String authorSurname) {   // method
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }
    public String getAuthorName() {
        return this.authorName;
    }
    public String getAuthorSurname () {
        return this.authorSurname;
    }

    @Override
    public String toString() {
        return authorName + " " + authorSurname;
    }
    @Override
    public boolean equals(Object other){
        if (this.getClass() != other.getClass()){
            return false;
        } else {
            Author author = (Author) other;
            return Objects.equals(authorName,author.authorName);
        }
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(authorName);
    }

}