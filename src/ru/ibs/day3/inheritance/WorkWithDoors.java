package ru.ibs.day3.inheritance;

import ru.ibs.day3.inheritance.ColoredDoor;
import ru.ibs.day3.inheritance.Door;

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
        coloredDoor.setWidth(100);
        coloredDoor.setColor("White");

        System.out.println(
                "Height = " + door.getHeight() +
                        ", Widht = " + door.getWidth() +
                        ", Color = " + coloredDoor.getColor()
        );
        Door cdoor = new ColoredDoor();
        cdoor.setHeight(200);
        cdoor.setWidth(80);
        ((ColoredDoor)cdoor).setColor("Yellow");

        System.out.println(
                "Height = " + cdoor.getHeight() +
                        ", Width = " + cdoor.getWidth() +
                        ", Color = " + ((ColoredDoor)cdoor).getColor()
        );
        }
}
