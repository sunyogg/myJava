public class Shelf {

    private Dimensions dimensions;
    private int numOfRows;
    private int numOfColumns;


    public Shelf(Dimensions dimensions, int numOfRows, int numOfColumns) {
        this.dimensions = dimensions;
        this.numOfColumns = numOfColumns;
        this.numOfRows = numOfRows;
    }

    public void takeBook(String bookName) {
        System.out.println("Took book '" + bookName + "' from the shelf.");
    }

    public void keepBook(String bookName) {
        System.out.println("Kept '" + bookName + "' on the shelf.");
    }

    public int getNumOfRows() {
        return numOfRows;
    }

    public int getNumOfColumns() {
        return numOfColumns;
    }

    public void cleanShelf() {
        System.out.println("Cleaning shelf...");
    }
}
