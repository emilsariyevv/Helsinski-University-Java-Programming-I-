
public class Book {

    private String title;
    private int pages;
    private int publicationyear;

    public Book(String title, int pages, int publicationyear) {
        this.pages = pages;
        this.title = title;
        this.publicationyear = publicationyear;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getPublicationYear() {
        return publicationyear;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.pages + " pages" + ", " + publicationyear;
    }
}
