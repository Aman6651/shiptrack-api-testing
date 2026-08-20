import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
public class ShipmentApiTest { @Test void shipmentStatusContract() { given().baseUri("https://httpbin.org").when().get("/status/200").then().statusCode(200); } }