package lesson_1;

import org.testng.annotations.Test;

public class VerifyHotelsCom extends DriverWrapper{

    @Test
    public void Tc_1(){
        Hotels cal = new Hotels();
        cal.clickOnCheckIn();
    }

}
