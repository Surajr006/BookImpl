public class Book {
    String title;
    String yearOfPublication;
    long ISBN;
    String authorName;
    int noOfPages;
    public void setTitle(String title)
    {
        this.title=title;
    }

    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public void setISBN(long ISBN){
        this.ISBN=ISBN;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public String getTitle() {
        return title;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public String getAuthorName() {
        return authorName;
    }

    public long getISBN() {
        return ISBN;
    }

    public int getNoOfPages() {
        return noOfPages;
    }
}
