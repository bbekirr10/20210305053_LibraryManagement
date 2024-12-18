public class HistoryBook extends LibraryItem
{
    String author;

    public HistoryBook(String id, String title, String author)
    {
        super(id, title);
        this.author = author;
    }

    public String getAuthor()
    {
        return author;
    }

    @Override
    public void displayInfo()
    {
        System.out.println("History Book ID: " + getId() + ", Title: " + getTitle() + ", Author: " + author);
    }
}
