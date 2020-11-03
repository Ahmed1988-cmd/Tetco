package tests;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ReferenceTrips;
import java.io.FileReader;
import java.io.IOException;

public class CreateTracking extends TestBase

{

    LoginPage logObj;
    ReferenceTrips refObj;

    //First User   
    private static String UserName;
    private static String Password;

    private static String OperationCost;
    private static String AvailableSeats;
    private static String PremiumSeats;


    private static String filePath = "C:\\Users\\ZaZa\\IdeaProjects\\Tetco\\src\\test\\java\\data\\testData.json";

    /**
     * this function for reading test data from json file
     * @throws IOException
     * @throws ParseException
     */


    public void getDataForTesting() throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        FileReader reader = new FileReader(filePath);

        //Read JSON file
        Object dataObj = jsonParser.parse(reader);
        JSONObject resultObj = (JSONObject) dataObj;

        // First User
        UserName = (String) resultObj.get("UserName");
        Password = (String) resultObj.get("Password");

        OperationCost = (String) resultObj.get("OperationCost");
        AvailableSeats = (String) resultObj.get("AvailableSeats");
        PremiumSeats = (String) resultObj.get("PremiumSeats");


    }

    @Test (priority = 1,alwaysRun = true)
    public void CreateTrip() throws IOException, ParseException, InterruptedException {

        getDataForTesting();

        logObj = new LoginPage(driver);
        logObj.Login(UserName,Password);
        refObj =new ReferenceTrips(driver);
        refObj.ReferencesTrips(OperationCost,AvailableSeats,PremiumSeats);
      //  Assert.assertTrue(creaAcounttObj.SucceseMessage.getText().contains("Your message has been successfully sent to our team."));

    }


}

