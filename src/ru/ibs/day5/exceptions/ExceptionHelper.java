package ru.ibs.day5.exceptions;

import java.io.EOFException;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Random;

public class ExceptionHelper {
    private final Random random = new Random();

    public void noException() {
        System.out.println("Method without exceptions");
    }
    public void chechedException() throws Exception {
        throw new Exception("Throwing checked exception");
    }

    public void multipleExceptions()
            throws IOException, ClassNotFoundException, InterruptedException {
        // EOFException
        double rand = random.nextDouble();
        if (rand < 0.1) {
            System.out.println("Successful run");
            //throw new RuntimeException("");
        } else if (rand < 0.4) {
            throw new EOFException("EOFExcheption thrown");
        } else if (rand < 0.7) {
            throw new ClassNotFoundException("ClassNotFoundException thrown");
        } else {
            throw new InterruptedException("InterruptedException thrown");
        }
    }

    public void uncheckedException() {
        //System.out.println(3 / 0);
        throw new ArithmeticException("Throwing unchecked exception");
    }
}
