package org.Level_1.ejercici_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DniCalculatorTest {

    @Test
    void CalculateLetterTest() {
        assertEquals('F', dniCalculator.calculateLetter(98432210));
        assertEquals('J', dniCalculator.calculateLetter(22520877));
        assertEquals('F', dniCalculator.calculateLetter(52436741));
        assertEquals('B', dniCalculator.calculateLetter(14569752));
        assertEquals('A', dniCalculator.calculateLetter(12345552));
        assertEquals('H', dniCalculator.calculateLetter(44157511));
        assertEquals('Y', dniCalculator.calculateLetter(54144789));
        assertEquals('V', dniCalculator.calculateLetter(23488905));
        assertEquals('M', dniCalculator.calculateLetter(64157746));
        assertEquals('Y', dniCalculator.calculateLetter(44715893));
    }

}
