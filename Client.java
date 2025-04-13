public class Client {
    public static void main(String[] args) {
        BorrowHandler borrowHandler = new LibraryBorrowHandler();

        Resource book = new Book("The Tell-Tale Heart");
        Resource journal = new Journal("The Computer Journal");
        Resource capstone = new Capstone("Mobile Applications for Mental Health Support");

        Student student1 = new Student("Deen", borrowHandler);
        Student student2 = new Student("Cy", borrowHandler);
        Student student3 = new Student("Chino", borrowHandler);        

        student1.accessResource(book);
        student2.accessResource(journal);
        student3.accessResource(capstone);
    }
}
