package com.robomwm.samplejarprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created on 10/24/2018.
 *
 * Btw, you shouldn't name your Main class "Main."
 * Usually you'd name it the same as the project name.
 *
 * @author RoboMWM
 */
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("hello");
        try
        {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            System.out.println("looks like you executed the wrong jar (you don't want to run the unshaded one!)");
            return;
        }
        System.out.println("Goodbye.\nWasn't that easy?");
    }
}
