package Identifier;

import org.junit.*;
import static org.junit.Assert.*;

public class IdentifierTestJUnit {

    Identifier idTest = new Identifier();

    @Test
    public void testValidIdentifier() {
        assertTrue(idTest.validateIdentifier("a"));
        assertTrue(idTest.validateIdentifier("abcDEF"));
    }

    @Test
    public void testInvalidIdentifierStartNumber() {
        assertFalse(idTest.validateIdentifier("01201934"));
    }

    @Test
    public void testInvalidIdentifierSpecialCaracter() {
        assertFalse(idTest.validateIdentifier("_test"));
    }

    @Test
    public void testInvalidIdentifierStartEmpty() {
        assertFalse(idTest.validateIdentifier(" "));
    }

    @Test
    public void testInvalidIdentifierLengthAboveBoundary() {
        assertFalse(idTest.validateIdentifier("abcdefg"));
    }
}
