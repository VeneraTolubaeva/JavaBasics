package ru.ibs.day3.constructor;

import ru.ibs.day3.constructor.def.DefaultConstructor;
import ru.ibs.day3.constructor.privat.PrivateConstructor;
import ru.ibs.day3.constructor.protect.ProtectedChild;
import ru.ibs.day3.constructor.protect.ProtectedConstructor;

public class Main {
    public static void main(String[] args) {
        //ProtectedConstructor a = new ProtectedConstructor(); создать не можем потому что constructor is protected
        ProtectedConstructor pc = new ProtectedChild();

        //Fail: constructor has default access level
        //DefaultConstructor dc = new DefaultConstructor();

        // Fail: constructor has private access level
        //ProtectedConstructor priv = new PrivateCost

        PrivateConstructor priv = PrivateConstructor.getInstance(); // ¬от так доступ есть
    }
}
