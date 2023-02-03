package api_test;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Test_Put {


   @Test
    public void test_1_put(){

       JSONObject request = new JSONObject();

       request.put("name","Nibir");
       request.put("job","Teacher");

       System.out.println(request);
       System.out.println(request.toJSONString());

       given().
               header("Content-type","Application/Json").
               contentType(ContentType.JSON).
               accept(ContentType.JSON).
       body(request.toJSONString()).
when().
               put("https://reqres.in/api/users/2").
               then().
               statusCode(200).
               log().all();
    }
}
