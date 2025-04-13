public class LibraryBorrowHandler implements BorrowHandler {
    
    public void handleBorrow(String studentName, Resource resource) {

        System.out.println("A " + resource.getType() + " titled '" + resource.getTitle() + "' was borrowed by "+ studentName + ".");
    
    }

}