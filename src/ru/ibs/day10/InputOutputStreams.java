package ru.ibs.day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class InputOutputStreams {
    public static void main(String[] args) {
        File file = new File("files/binary.data");
        /*try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(1);
            fos.write(2);
            fos.write(3);
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        try (FileInputStream fis = new FileInputStream(file)) {
            // Way 1
            /*int n;
            while ((n = fis.read()) != -1) {
                System.out.println(n);
            }*/

            byte[] data = new byte[2];
            int len;
            while ((len = fis.read(data)) != -1) {
                System.out.println(len);
                System.out.println(Arrays.toString(data));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
