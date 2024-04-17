package xml_json_validation;

import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class JSONValidator {
    String pathToSchema = "JSONchecks/schema.json";

@Test
    public void checkJson(){
    given()
            .when()
            .get("https://petstore.swagger.io/v2/pet/2")
            .then()
            .body(matchesJsonSchemaInClasspath(pathToSchema));
}
}
