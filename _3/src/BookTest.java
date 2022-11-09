public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("JK Rowling", "Harry Potter", 2019);

        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Наименование: " + book.getName());
        System.out.println("Год написания: " + book.getYear());

        book.setAuthor("Джоан Роулинг");
        book.setName("Гарри Поттер");
        book.setYear(1995);

        System.out.println("\nОбновлёныне данные:");
        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Наименование: " + book.getName());
        System.out.println("Год написания: " + book.getYear());
    }
}
