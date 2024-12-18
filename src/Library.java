import java.util.HashMap;
import java.util.Map;

public class Library implements ILibraryManagement
{
    private Map<String, LibraryItem> items = new HashMap<>();

    @Override
    public void addItem(LibraryItem item)
    {
        items.put(item.getId(), item);
        System.out.println(item.getTitle() + " added to the library.");
    }

    public void displayAllItems()
    {
        items.values().forEach(LibraryItem::displayInfo);
    }
}
