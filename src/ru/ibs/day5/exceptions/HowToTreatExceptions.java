package ru.ibs.day5.exceptions;

import java.sql.SQLException;

public class HowToTreatExceptions {
    private ExceptionHelper helper;

    public void First_SwallowException() {
        try {
            helper.chechedException();
            // Do nothing
        } catch (Exception ignored) {

        }
    }

    public void Second_Delegate() throws Exception {
        helper.chechedException();
    }

    public void Third_Wrap() throws SQLException {
        try {
            helper.multipleExceptions();
        } catch (Exception e) {
            throw new SQLException(e);
        }
    }

    public void Fourth_WrapInRuntimeException() {
        try {
            helper.chechedException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        HowToTreatExceptions how = new HowToTreatExceptions();

        try {
            how.Third_Wrap();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
