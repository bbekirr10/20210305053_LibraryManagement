public class Main {
    public static void main(String[] args)
    {
        Library library = new Library();

        HistoryBook historyBook= new HistoryBook("01","NUTUK","MUSTAFA KEMAL ATATÜRK");
        AdventureBook adventureBook = new AdventureBook("02", "The Hobbit", "John Ronald Reuel Tolkien");
        AdventureBook adventureBook1 = new AdventureBook("001", "The Lord of the Rings:Return of the King", "John Ronald Reuel Tolkien");


        library.addItem(historyBook);
        library.addItem(adventureBook);
        library.addItem(adventureBook1);

        System.out.println("\nAll Library Items:");
        library.displayAllItems();
        System.out.println();

        Borrower<HistoryBook> borrower = new Borrower<>("Bekir", historyBook);
        borrower.displayBorrowInfo();
        Borrower<AdventureBook> borrower2 = new Borrower<>("Ali", adventureBook);
        borrower2.displayBorrowInfo();
        Borrower<HistoryBook> borrower3 = new Borrower<>("Muhammet", historyBook);
        borrower3.displayBorrowInfo();


        LibraryUtility utility = new LibraryUtility();
        utility.addToCatalog(historyBook);
        utility.addToCatalog(adventureBook);
        utility.addToCatalog(adventureBook1);
        utility.registerBorrower("Bekir");
        utility.registerBorrower("Ali");
        utility.registerBorrower("Muhammet");

        System.out.println("\nCatalog:");
        utility.displayCatalog();

        System.out.println("\nBorrowers:");
        utility.displayBorrowers();

        System.out.println("\nFiltered Library Items:");
        utility.catalog.stream()
                .filter(item -> item.getTitle().contains("The Hobbit"))
                .forEach(LibraryItem::displayInfo);
        
    }
}