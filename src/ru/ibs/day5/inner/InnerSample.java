package ru.ibs.day5.inner;

public class InnerSample {
    // All 4 access modifiers are possible here
    public class StringData {
        public String s;
        public String quote() {
            return "\"" + s + "\"";
        }
    }

    public static class A {
        public boolean b;
        public String getDescription() {
            return b ? "Yes" : "No";
        }
    }

    // Inner interfaces are static!
    public interface Inner {
        String getString();
    }

    public static void main(String[] args) {
        InnerSample innerSample = new InnerSample();
        innerSample.classInsideMethod();

        StringData stringData = innerSample.new StringData();
        stringData.s = "Hello, World";
        System.out.println(stringData.quote());

        InnerSample.A a = new A();
        System.out.println(a.getDescription());

        // Anonymous inner class
        InnerSample.Inner in = new Inner() {
            @Override
            public String getString() {
                return "Hello from inner class";
            }
        };
        System.out.println(in.getString());
    }

    public void classInsideMethod() {
        class Data {
            int n;

            @Override
            public String toString() {
                return "n = " + n;
            }
        }

        Data data = new Data();
        data.n = 4;
        System.out.println(data);
    }
}
