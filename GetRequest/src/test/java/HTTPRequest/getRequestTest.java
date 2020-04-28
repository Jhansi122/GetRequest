package HTTPRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getRequestTest 
{
 @Test
 public void getReq()
 {
	 RestAssured.baseURI ="https://reqres.in/";
	RequestSpecification req= RestAssured.given();
	Response res =req.request(Method.GET,"/api/users/2");
	String body =res.getBody().asString();
	System.out.println("body = " +body);
	int Statuscode = res.getStatusCode();
	System.out.println("Status code = "+Statuscode);
	String StatusLine = res.getStatusLine();
	System.out.println("StatusLine = " +StatusLine);
	long time= res.getTime();
	System.out.println("Time = "+time);
 }
}
