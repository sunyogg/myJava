public class Main {
    public static void main(String[] args) {
        Bed bed = new Bed(new Dimensions(6, 1 ,3), "SleepWell", true);

        Table table = new Table((new Dimensions(3, 2, 1)), false);
        Chair chair = new Chair((new Dimensions(1, 2, 1)), 1, 4, false);
        Shelf shelf = new Shelf((new Dimensions(2, 5, 3)), 7, 2);

        Furniture furniture = new Furniture(bed, table, chair, shelf);
        Window window = new Window((new Dimensions(1, 6, 4)), true);
        Door door  = new Door((new Dimensions(1, 7, 3)), "Kundi", true);

        Room room  = new Room(furniture, window, door);

        // I want to clean the whole room and everything inside it.
        room.cleanRoom();

        // I only want to clean table in the room.
        room.getFurniture().getTable().cleanTable();

        // I want the length of the bed.
        System.out.println(room.getFurniture().getBed().getDimensions().getLength());

        // does the door has lock.
        System.out.println(room.getDoor().isHasLock());
    }
}