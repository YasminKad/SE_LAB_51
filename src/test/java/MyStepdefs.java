import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    private Calculator calculator;
    private double value1;
    private double value2;
    private double result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("^Two input values, (\\d+) and (\\d+)$")
    public void twoInputValuesAnd(double arg0, double arg1) {
        value1 = arg0;
        value2 = arg1;
    }
    @When("^I calculate sqrt\\(a/b\\)$")
    public void iSqrtTheSubtractionOfValues(){
        result = calculator.calculateResult(value1,value2);
        System.out.print(result);
    }

    @Then("^I expect the result (\\d+)\\.(\\d+)$")
    public void iExpectTheResult(double arg0){
        Assert.assertEquals(arg0, result);
    }
}
