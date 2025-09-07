public class task2Library 
{
    String bookName;
    String authorName;
    int quantity;
/*Task 2: Create a Library class with bookName, authorName, quantity, and methods to issue,
return, and display books, then test with three book objects. [Book Issue/Return OOP]*/
    task2Library(String bookName, String authorName, int quantity) 
{
    this.bookName = bookName;
    this.authorName = authorName;
    this.quantity = quantity;
}

void issueBook() 
{
    if (quantity > 0) 
    {
        quantity--;
        System.out.println("\nBook Issued: " + bookName);
    }
    else 
    {
       System.out.println("\nSorry, " + bookName + " is not available.");
    }
}
void returnBook() 
    {
    quantity++;
    System.out.println("\nBook Returned: " + bookName+"\n");
    }
    void displayBook() 
    {
        System.out.println("Book: " + bookName + " | Author: " + authorName + " | Quantity: " + quantity);
    }
}

    public void main(String[] args) 
    {
        task2Library book1 = new task2Library("Java Basics", "James Gosling", 3);
        task2Library book2 = new task2Library("OOP Concepts", "Bjarne Stroustrup", 2);
        task2Library book3 = new task2Library("Data Structures", "Donald Knuth", 1);

        book1.displayBook();
        book2.displayBook();
        book3.displayBook();

        book1.issueBook();
        book3.issueBook();
        book3.issueBook(); 

        book3.returnBook();

        book1.displayBook();
        book2.displayBook();
        book3.displayBook();
    }
    
