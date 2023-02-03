package api_test;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Test_Post {

    @Test
    public void test_1_post(){

        JSONObject request = new JSONObject();

        request.put("name", "Nibir");
        request.put("job","Teacher");

        System.out.println(request);
        System.out.println(request.toJSONString());

        given().
                body(request.toJSONString()).
                when().
post("https://reqres.in/api/users?page=2").
                then().
                statusCode(201);






    }
}
