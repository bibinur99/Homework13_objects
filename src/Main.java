public class Main {
    public static void main(String[] args) {
        System.out.println("HOMEWORK:");

        Author lee = new Author("Harper", "Lee");
        System.out.println(lee);    // to check toString

        Author remark = new Author("Erich Maria", "Remark");
        System.out.println(remark);
        System.out.println();

        Book first = new Book("To kill a Mockingbird", lee, 1960);
        Book second = new Book("Drei Kammeraden", remark, 1936);
        System.out.println(first);
        System.out.println(second);
    }
}