public class Main {
    public static void main(String[] args) {
        //using geter seter
        Book b1 = new Book();
        b1.setAuthor("poorna chandra thejasvi");
        b1.setTitle("jugaari cross");
        b1.setPrice(270);
        b1.setPublicationYear(1994);
        b1.discountedPrice(10);
        //  System.out.println(b1.getAuthor() + b1.getPrice() + b1.getTitle() + b1.getPublicationYear());
        b1.displayInfo();
        b1.read();
        b1.getSummary();

        //book
        Book b = new Book("jugari", "pct", 350, 2019);
        b.discountedPrice(30);
        b.displayInfo();
        b.read();
        b.getSummary();


        //EBook
        EBook eb = new EBook("jugari", "pct", 350, 2019, 10);
        //System.out.println(b1.getAuthor() + b1.getPrice() + b1.getTitle() + b1.getPublicationYear() + eb.getFileSize());
        eb.discountedPrice(30);
        eb.displayInfo();
        eb.read();
        eb.getSummary();
    }
}