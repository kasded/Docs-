package lv.javaguru.HomeWork4;

public class Book {
    private String author;
    private String title;
    private int pageCount;

    Book(String author, String title, int pageCount) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return this.author.equals(book.author)
            && this.title.equals(book.title)
            && this.pageCount == book.pageCount;
    }

    @Override
    public String toString(){
        return "Book: { "
                + " author: " + author
                + ", title: " + title
                + ", page count: " + pageCount
                + " } ";
    }
}