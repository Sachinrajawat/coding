public class LibraryItem {
    private String itemID;
    private String title;
    private String author;
    public void checkout(){
        System.out.println("Checout");
    }
    public void returnItem(){
        System.out.println("Returning the item");
    }
}
class Book extends LibraryItem {
    private String ISBN;
    
}
class Magazine extends LibraryItem{
    private String IssueNum;
}
class DVD extends LibraryItem{
    private int duration;
}
