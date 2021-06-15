import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    // asserts that detectCapitalUse returns true when passed
    // a word whose only capital letter is the first letter
    @Test
    public void detectCapitalUseTest1() {
        myString.setString("Enjoy");
        assertTrue(myString.detectCapitalUse());
    }

    // asserts that detectCapitalUse returns true when
    // passed a word containing only capital letters
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("USA");
        assertTrue(myString.detectCapitalUse());
    }

    // asserts that detectCapitalUse returns true when
    // passed a word containing only lowercase letters
    @Test
    public void detectCapitalUseTest3() {
        myString.setString("gorgonzola");
        assertTrue(myString.detectCapitalUse());
    }

    // asserts that detectCapitalUse returns false when passed a word that
    // begins with a lowercase letter and contains at least one capital letter
    @Test
    public void detectCapitalUseTest4() {
        myString.setString("detectCapital");
        assertFalse(myString.detectCapitalUse());
    }

    // asserts that detectCapitalUse returns false when passed a word that
    // begins with a capital letter and contains other capital and lowercase letters
    @Test
    public void detectCapitalUseTest5() {
        myString.setString("DetectCapital");
        assertFalse(myString.detectCapitalUse());
    }

    // asserts that detectCapitalUse returns
    // true when passed an empty String
    @Test
    public void detectCapitalUseTest7() {
        myString.setString("");
        assertTrue(myString.detectCapitalUse());
    }

}
