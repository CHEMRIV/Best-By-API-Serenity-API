package ui.swagger.studentinfo;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import ui.swagger.constants.EndPoints;

public class UtilityStep {
    @Step("Getting Version")
    public ValidatableResponse gettingVersion(){

        return SerenityRest.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .get(EndPoints.GET_VERSION)
                .then();
    }

    @Step("Getting HealthCheck")
    public ValidatableResponse gettingHealthCheck() {

        return SerenityRest.given().log().all()
                .contentType(ContentType.JSON)
                .when()
                .get(EndPoints.GET_HEALTHCHECK)
                .then();
    }
}
