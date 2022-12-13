import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

public class JsonTestParse {
    @Test
    public void Test5()
    {
          JsonPath response = RestAssured
                  .given()
                  .get("https://playground.learnqa.ru/api/get_json_homework")
                  .jsonPath();
    //      response.prettyPrint();
        String answer2 = response.get("messages.message[1]");
        System.out.print(answer2);
    }
}
