public class University {
    public static void main(String[] args) {
        Student aaron = new Student("Aaron");
        Student laser = new Student("Laser");
        Resource book = new Book("The Silent Patient");
        Resource journal = new Journal("Journal 101");

        BorrowingService borrowingService = new BorrowingService();

        System.out.println(borrowingService.borrowResource(journal, laser));
        System.out.println(borrowingService.borrowResource(book, aaron);
    }
}
