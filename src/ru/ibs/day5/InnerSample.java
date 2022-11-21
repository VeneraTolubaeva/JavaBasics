package ru.ibs.day5;

public class InnerSample {
    public class StringData {
        public String s;
        public String quote() {
            return "\"" + s + "\"";
        }
    }
    public static void main(String[] args) {
        InnerSample innerSample = new InnerSample();
        InnerSample.classInsideMethod();
    }
    public void classInsideMethod() {
        class Data {
            int n;
        }
    }
}
