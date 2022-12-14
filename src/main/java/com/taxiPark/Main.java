package com.taxiPark;

import com.taxiPark.menu.MainMenuTaxiPark;
import com.taxiPark.menu.addCar.addCarFromFile.AddingCarsFromFile;
import com.taxiPark.park.AutoPark;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] arg) {

        Scanner scanner = new Scanner(System.in);

        logger.info("Програма почала роботу.");

        AddingCarsFromFile addCarsFromFile = new AddingCarsFromFile();
        addCarsFromFile.addCarsFromFile(AutoPark.getCars());

        MainMenuTaxiPark taxiPark = new MainMenuTaxiPark();
        taxiPark.openTaxiParkProgramme(scanner, AutoPark.getCars());
    }
}
