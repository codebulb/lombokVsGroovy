package ch.codebulb.lombokvsgroovy

import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import static org.junit.Assert.*
import groovy.transform.CompileStatic
import lombok.experimental.ExtensionMethod
import ch.codebulb.lombokvsgroovy.extensions.ExtensionsLombok

@CompileStatic
@ExtensionMethod(ExtensionsLombok.class)
class GroovyTest {
    @Test
    public void testExtensions() {
        assertEquals("Hello Groovy, this is World", "World".greetGroovy())
        
        // Not supported by Groovy
//        assertEquals("Hello Lombok, this is World", "World".greetLombok())
    }
}
