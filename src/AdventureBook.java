public class AdventureBook extends LibraryItem
{
     String author;

    public AdventureBook(String id, String title, String author)
    {
        super(id, title);
        this.author = author;
    }

    public String getIssue()
    {
        return author;
    }

    @Override
    public void displayInfo()
    {
        System.out.println("Adventure Book ID: " + getId() + ", Title: " + getTitle() + ", Author: " + author);
    }
}
