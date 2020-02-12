package com.jmorata;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.jmorata.RomanNumeralConverter.romanFor;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class RomanNumeralConverterShould {

    @Test
    @Parameters({
            "1, I",
            "2, II",
            "3, III",
            "4, IV",
            "5, V",
            "7, VII",
            "9, IX",
            "10, X",
            "18, XVIII",
            "30, XXX",
            "36, XXXVI",
            "40, XL",
            "50, L",
            "90, XC",
            "100, C",
            "400, CD",
            "500, D",
            "900, CM",
            "1000, M",
            "1430, MCDXXX",
            "2799, MMDCCXCIX",
    })
    public void
    convert_arabic_numbers_into_roman_numerals(int arabic, String roman) {
        assertThat(romanFor(arabic)).isEqualTo(roman);
    }

}