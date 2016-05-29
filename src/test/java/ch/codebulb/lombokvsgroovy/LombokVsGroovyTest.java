package ch.codebulb.lombokvsgroovy;

import ch.codebulb.lombokvsgroovy.builder.BuilderLombok;
import org.junit.Test;
import static org.junit.Assert.*;

import ch.codebulb.lombokvsgroovy.def.*;
import ch.codebulb.lombokvsgroovy.builder.*;
import ch.codebulb.lombokvsgroovy.canonical.*;
import ch.codebulb.lombokvsgroovy.delegate.*;
import ch.codebulb.lombokvsgroovy.exceptions.*;
import ch.codebulb.lombokvsgroovy.extensions.ExtensionsLombok;
import ch.codebulb.lombokvsgroovy.gettersetter.*;
import ch.codebulb.lombokvsgroovy.immutable.*;
import ch.codebulb.lombokvsgroovy.logging.LoggingLombok;
import ch.codebulb.lombokvsgroovy.nonnull.*;
import ch.codebulb.lombokvsgroovy.util.UtilLombok;
import ch.codebulb.lombokvsgroovy.wither.WitherLombok;
import java.util.Arrays;
import java.util.logging.Logger;
import lombok.experimental.ExtensionMethod;

@ExtensionMethod(ExtensionsLombok.class)
public class LombokVsGroovyTest {
    
    public LombokVsGroovyTest() {
    }
    
    @Test
    public void testDef() {
        assertEquals(String.class, DefGroovy.value.getClass());
        assertEquals(String.class, DefGroovy.getValue("Hello").getClass());
        assertEquals(Integer.class, DefGroovy.getValue(123).getClass());
        
        // Not supported for fields in Lombok
        assertEquals(String.class, DefLombok.getValue("Hello").getClass());
        assertEquals(Integer.class, DefLombok.getValue(123).getClass());
    }
    
    @Test
    public void testNonNull() {
        // Not supported in Groovy
        
        assertEquals("Hello null", NonNullLombok.checkNonNull("Hello ", null));
        
        try {
            assertEquals("null World", NonNullLombok.checkNonNull(null, "World"));
            fail();
        }
        catch (NullPointerException ex) {
            assertEquals("cannotBeNull", ex.getMessage());
        }
    }
    
    @Test
    public void testGetterSetter() {
        GetterSetterGroovy groovy = new GetterSetterGroovy();
        assertEquals(10, groovy.getAge());
        groovy.setName("My name");
        assertEquals("My name", groovy.name);
        assertEquals(10, groovy.getAge());
        
        GetterSetterLombok lombok = new GetterSetterLombok();
        assertEquals(10, lombok.getAge());
        lombok.setName("My name");
        assertEquals("My name", lombok.name);
        assertEquals(10, lombok.getAge());
    }
    
    @Test
    public void testConstructors() {
        CombinedGroovy groovy = new CombinedGroovy();
        groovy = new CombinedGroovy("My name", 20);
        
        CombinedLombok lombok = new CombinedLombok();
        lombok = new CombinedLombok("My name", 20);
    }
    
    @Test
    public void testToString() {
        CombinedGroovy groovy = new CombinedGroovy();
        assertEquals("CombinedGroovy(name:null, age:10)", groovy.toString());
        
        CombinedLombok lombok = new CombinedLombok();
        assertEquals("CombinedLombok(name=null, age=10)", lombok.toString());
    }
    
    @Test
    public void testEqualsAndHashCode() {
        CombinedGroovy groovy1 = new CombinedGroovy();
        groovy1.setName("My name");
        groovy1.setAge(1);
        CombinedGroovy groovy2 = new CombinedGroovy();
        groovy2.setName("My name");
        groovy2.setAge(2);
        assertEquals(groovy1, groovy2);
        
        CombinedLombok lombok1 = new CombinedLombok();
        lombok1.setName("My name");
        lombok1.setAge(1);
        CombinedLombok lombok2 = new CombinedLombok();
        lombok2.setName("My name");
        lombok2.setAge(2);
        assertEquals(lombok1, lombok2);
    }
    
    @Test
    public void testCanonical() {
        CanonicalGroovy groovy = new CanonicalGroovy();
        assertEquals("ch.codebulb.lombokvsgroovy.canonical.CanonicalGroovy(null, 10)", groovy.toString());
        
        assertEquals(new CanonicalGroovy("My name", 20), new CanonicalGroovy("My name", 20));
        
        CanonicalLombok lombok = new CanonicalLombok();
        assertEquals("CanonicalLombok(name=null, age=10)", lombok.toString());
        
        assertEquals(new CanonicalLombok("My name", 20), new CanonicalLombok("My name", 20));
    }
    
    @Test
    public void testImmutable() {
        assertEquals("ch.codebulb.lombokvsgroovy.immutable.ImmutableGroovy(10)", new ImmutableGroovy().toString());
        
        assertEquals(new ImmutableGroovy("My name", 20), new ImmutableGroovy("My name", 20));
        
        assertEquals("ImmutableLombok(name=null, age=10)", new ImmutableLombok().toString());
        
        assertEquals(new ImmutableLombok("My name"), new ImmutableLombok("My name"));
    }
    
    @Test
    public void testWither() {
        WitherLombok lombok = new WitherLombok();
        assertEquals("Default name", lombok.getName());
        lombok.setAge(20);
        WitherLombok lombok2 = lombok.withName("My name");
        assertEquals("Default name", lombok.getName());
        assertEquals("My name", lombok2.getName());
        assertEquals(20, lombok2.getAge());
    }
    
    @Test
    public void testBuilder() {
        BuilderGroovy groovy = BuilderGroovy.builder()
                .name("My name").age(20).siblings(Arrays.asList("First", "Second"))
                .build();
        
        BuilderLombok lombok = BuilderLombok.builder()
                .name("My name").age(20).sibling("First").sibling("Second")
                .build();
        
        SimpleBuilderGroovy simpleGroovy = new SimpleBuilderGroovy()
                .name("My name").age(20);
        
        SimpleBuilderLombok simpleLombok = new SimpleBuilderLombok()
                .name("My name").age(20);
    }
    
    @Test
    public void testExceptions() {
        assertEquals(ExceptionsGroovy.UselessException.class, ExceptionsGroovy.tryToDoSomething());
        
        assertEquals(ExceptionsLombok.UselessException.class, ExceptionsLombok.tryToDoSomething());
    }
    
    @Test
    public void testLogger() {
        assertEquals(Logger.class, LoggingLombok.checkLogger());
    }
    
    @Test
    public void testUtil() {
        // Not supported in Groovy
        
        UtilLombok.doSomething();
    }
    
    @Test
    public void testExtensions() {
        // Not supported in Groovy
        
        assertEquals("Hello Lombok, this is World", "World".greetLombok());
    }
    
    @Test
    public void testDelegate() {
        DelegateGroovy groovy = new DelegateGroovy();
        groovy.add(1);
        groovy.add(2);
        groovy.add(3);
        assertEquals(3, groovy.size());
        
        DelegateLombok lombok = new DelegateLombok();
        lombok.add(1);
        lombok.add(2);
        lombok.add(3);
        assertEquals(3, lombok.size());
    }
}
