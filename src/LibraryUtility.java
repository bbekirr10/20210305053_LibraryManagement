import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LibraryUtility
{
    List<LibraryItem> catalog = new ArrayList<>();
    Set<String> borrowers = new HashSet<>();

    public void addToCatalog(LibraryItem item)
    {
        catalog.add(item);
    }

    public void registerBorrower(String borrower)
    {
        borrowers.add(borrower);
    }

    public void displayCatalog()
    {
        catalog.forEach(LibraryItem::displayInfo);
    }

    public void displayBorrowers()
    {
        borrowers.forEach(System.out::println);
    }
}
