package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/Features",
		glue = {"stepDefintions"},
//		tags = "@searchsku "
		tags = "@cart or @order",
        plugin = {"json:target/cucumber.json"}
		)

// ***Done*** ///
/*wish list, currencies, add to cart, filter, register, login,
 reset pass, hover, follow us, search, slider, compare, tags, order
 */

//***Not YET*** ///
//searchsku, negative login

public class testRunner {

}
