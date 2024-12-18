abstract class LibraryItem
{
    String id,title;

    public LibraryItem(String id, String title)
    {
        this.id = id;
        this.title = title;
    }

    public String getId()
    {
        return id;
    }
    public String getTitle()
    {
        return title;
    }

    public abstract void displayInfo();

}
