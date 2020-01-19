package basicsTesting.algorithms;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.*;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class NumberTestsTest {
    private NumberTests numberTests;

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    private static void setUpBeforeClass() throws Exception {
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    private static void tearDownAfterClass() throws Exception {
    }

    @Before
    private void setUp() throws Exception {
        numberTests = new NumberTests();
    }

    @After
    private void tearDown() throws Exception {
    }

    @Test
    private void checkIfPrime() {
    }

    @Test
    private void sumOfDigits() {
    }

    @Test
    private void main() {
    }

    private void testAdd() {
        String test = "equals";
        assertEquals("equals", test);
    }


}
