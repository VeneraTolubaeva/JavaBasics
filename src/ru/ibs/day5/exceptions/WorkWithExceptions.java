package ru.ibs.day5.exceptions;

import java.io.EOFException;
import java.io.IOException;

public class WorkWithExceptions {
    public static void main(String[] args) {
        ExceptionHelper helper = new ExceptionHelper();

        for (int i = 0; i < 15; i++) {
            try {
                helper.multipleExceptions();
            } catch (IOException e) {
                System.out.println("- IOException");
            // Child exceptions must be caught first!
            //} catch (EOFException e) {
            //    System.out.println(" - EOFException");
            } catch (ClassNotFoundException e) {
                System.out.println("- ClassNotFoundException");
            } catch (InterruptedException e) {
                System.out.println("- InterruptedException");
            }
        }
    }

    public static void main1(String[] args) {
        ExceptionHelper helper = new ExceptionHelper();

        try {
            helper.noException();
        } finally {
            System.out.println("Finally without exception");
        }

        try {
            helper.chechedException();
            helper.uncheckedException();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally with exception");
        }

        try {
            helper.uncheckedException();
        } catch (Exception e) {
            // Threre are 2 "consoles" in java: out and err
            // StackTrace uses err console
            System.err.println(e.getMessage());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("The end");
    }
}
