package api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RequestIn {

     RequestSpecification reqSpec = new RequestSpecBuilder()
            .setBaseUri("https://reqres.in")
            .setBasePath("/api")
            .log(LogDetail.ALL)
            .build();

     ResponseSpecification resSpec = new ResponseSpecBuilder()
             .expectStatusCode(200)
             .expectStatusLine("HTTP/1.1 200 OK")
             .log(LogDetail.ALL)
             .build();


     private static String getRequestString(String firstParm, String secondParm){

         return String.format("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:oor=\"http://www.oorsprong.org/\">\n" +
                 "   <soapenv:Header/>\n" +
                 "   <soapenv:Body>\n" +
                 "      <oor:IsAnagram>\n" +
                 "         <oor:sWord1>%s</oor:sWord1>\n" +
                 "         <oor:sWord2>%s</oor:sWord2>\n" +
                 "      </oor:IsAnagram>\n" +
                 "   </soapenv:Body>\n" +
                 "</soapenv:Envelope>", firstParm,secondParm);

     }


     @Test
    public void getListOfUsers(){
         given()
                 .spec(reqSpec)
                 .when()
                 .get("/users?page=1")
                 .then()
                 .spec(resSpec)
                 .body("data.id[0]", equalTo(1));
     }


     @Test
    public void xmlPost(){
         given()
                 .log().ifValidationFails(LogDetail.ALL)
                 .header("Content-Type", "text/xml; charset=utf-8")
                 .body(getRequestString("true", "eurt"))
                 .when()
                 .post("http://webservices.oorsprong.org/websamples.anagram/anagramservice.wso")
                 .then()
                 .log().all()
                 .assertThat().body("Envelope.Body.IsAnagramResponse.IsAnagramResult", equalTo("true"));
         System.out.println("123");
     }





}
