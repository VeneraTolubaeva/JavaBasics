package ru.ibs.day4.interfaces;

import ru.ibs.task.Person;

public interface Bus extends Vehicle {
    // This is essentially constant
    int n = 2;

    // ALL interface methods are public
    void board();
}
