package com.taxiPark.menu.addCar.addCarFromFile;

import com.taxiPark.WorkWithFile;
import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

class AddingCarsFromFileTest extends TestCase {

    AddingCarsFromFile addingCarsFromFile = new AddingCarsFromFile();

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();


    @BeforeEach
    public void setUp(){
        System.setOut(new PrintStream(byteArrayOutputStream));
    }

    @Test
    public void testAdd() {
        addingCarsFromFile.workWithFile = Mockito.mock(WorkWithFile.class);

        doNothing().when(addingCarsFromFile.workWithFile).addCars(null);

        addingCarsFromFile.add(null);

        verify(addingCarsFromFile.workWithFile, times(1)).addCars(null);
    }

    /*@Test
    void addCarsFromFile() {
    }*/

    @Test
    public void testDownloadCars() {
    }
}