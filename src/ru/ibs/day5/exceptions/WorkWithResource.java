package ru.ibs.day5.exceptions;

public class WorkWithResource {
    public static void main(String[] args) {
        try(Resource resource = new Resource()) {
            resource.open();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main2(String[] args) {
        Resource resource = new Resource();

        try {
            try {
                resource.open();
            } finally {
                resource.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main1(String[] args) {
        Resource resource = new Resource();
        try {
            resource.open();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                resource.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
