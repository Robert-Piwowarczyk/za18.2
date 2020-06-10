import java.util.List;

public class FilteringMachine {

    public List<Integer> filterOutNotEvenNumbers(List<Integer> numberList) {
        return null;
    }

    public List<Integer> filterOutLowerNumbersThan20(List<Integer> numberList) {
        return null;
    }

    public List<Book> convertToBooks(List<String> titles) {
        return null;
    }

    // Metoda powinna przekształcić tytuły na książki i zwrócić tylko te które rozpoczynają się od słowa "Gra"
    public List<String> convertToBooksAndReturnOnlyStartingWithGra(List<String> titles) {

        List<Book> books = List.of(new Book("Potop"),new Book("Gra o tron"),
                new Book("Winetoo na tropach apaczy"));
        books.stream()
                .filter(title-> title.startsWith("Gra"))
                .map(title-> new Book(title))
                .forEach(System.out::println);
    }
}
