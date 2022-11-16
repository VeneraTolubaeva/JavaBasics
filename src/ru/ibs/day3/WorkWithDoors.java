package ru.ibs.day3;

public class WorkWithDoors {
    public static void main(String[] args) {
        Door door = new Door();
        door.setHeight(200);
        door.setWidth(90);

        System.out.println(
                "Height = " + door.getHeight() +
                ", Widht = " + door.getWidth()
        );

        ColoredDoor coloredDoor = new ColoredDoor();
        coloredDoor.setHeight(210);
        coloredDoor.setWidth();
        coloredDoor.setColor("White");

        System.out.println(
                "height = "  + coloredDoor.getHeight();
        );
    }
}
