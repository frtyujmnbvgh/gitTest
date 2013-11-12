import geb.*
import geb.junit4.*
import org.junit.Test

import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4)
class GoogleTest extends GebReportingTest {
    @Test
    void "firstLinkText eq Wikipedia"() {
        to GoogleHomePage

		input.with {
			q = "wikipedia"
		}
        at GoogleResultsPage

		assert firstLinkText == "Wikipedia"		
        firstLinkTextMove

        waitFor { at WikipediaPage }
    }
}