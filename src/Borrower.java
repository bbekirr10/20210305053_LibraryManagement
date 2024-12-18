public class Borrower<T extends LibraryItem>
{
     String name;
     T borrowedItem;
    public Borrower(String name, T borrowedItem)
    {
        this.name = name;
        this.borrowedItem = borrowedItem;
    }

    public String getName()
    {
        return  name;
    }
    public T getBorrowedItem()
    {
        return  borrowedItem;
    }

    public void displayBorrowInfo()
    {
        System.out.println(name + " borrowed: ");
        borrowedItem.displayInfo();
    }
}
