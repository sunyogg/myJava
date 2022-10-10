public class Furniture {

    private Bed bed;
    private Table table;
    private Chair chair;
    private Shelf shelf;

    public Furniture(Bed bed, Table table, Chair chair, Shelf shelf) {
        this.bed = bed;
        this.table = table;
        this.chair = chair;
        this.shelf = shelf;
    }

    public void cleanFurniture() {
        bed.cleanBed();
        table.cleanTable();
        chair.cleanChair();
        shelf.cleanShelf();
    }

    public Bed getBed() {
        return bed;
    }

    public Table getTable() {
        return table;
    }

    public Chair getChair() {
        return chair;
    }

    public Shelf getShelf() {
        return shelf;
    }
}
