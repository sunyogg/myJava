package myJava.bootcamp.section7.challenge.room;

public class Room {
    private Furniture furniture;
    private myJava.bootcamp.section7.challenge.room.Window window;
    private Door door;

    public Room(Furniture furniture, myJava.bootcamp.section7.challenge.room.Window window, Door door) {
        this.furniture = furniture;
        this.window = window;
        this.door = door;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public Window getWindow() {
        return window;
    }

    public Door getDoor() {
        return door;
    }

    public void cleanRoom() {
        furniture.cleanFurniture();
        window.cleanWindow();
        door.cleanDoor();
        System.out.println("The room is clean now...");
    }
}