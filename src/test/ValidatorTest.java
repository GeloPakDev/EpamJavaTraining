package test;

import com.company.task2.util.Validator;
import jdk.jshell.VarSnippet;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void checkColorCorrectnessLetters() {
        boolean i = Validator.checkColorCorrectness("REd");
        assertTrue(i);
    }

    @Test
    void checkColorCorrectnessNumbers() {
        boolean i = Validator.checkColorCorrectness("Red2123");
        assertFalse(i);
    }

    @Test
    void checkColorCorrectnessSigns() {
        boolean i = Validator.checkColorCorrectness("RE&");
        assertFalse(i);
    }
}