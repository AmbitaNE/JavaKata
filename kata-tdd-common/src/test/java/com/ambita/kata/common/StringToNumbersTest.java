package com.ambita.kata.common;

import java.math.BigInteger;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringToNumbersTest {

  private static final int EXPECTED_RESULT_ZERO = BigInteger.ZERO.intValue();
  private static final int EXECPTED_RESULT_ONE = BigInteger.ONE.intValue();
  private static final int EXECPTED_RESULT_MINUS_ONE = BigInteger.ONE.negate().intValue();

  @DisplayName("Test null input")
  @Test
  public void testIsEmpty_nullIn() {

    assertTrue(new StringToNumbers().isEmpty(null));
  }

  @DisplayName("Test empty input")
  @Test
  public void testIsEmpty_emptyIn() {

    assertTrue(new StringToNumbers().isEmpty(""));
  }

  @DisplayName("Test input with content")
  @Test
  public void testIsEmpty_stringIn() {

    assertFalse(new StringToNumbers().isEmpty("-1"));
  }

  @DisplayName("Test input that should result in zero")
  @ParameterizedTest
  @ValueSource(strings = {  "","D" })
  public void testParseNumber_ExpectedZero(String value) {
    assertEquals(Integer.valueOf(EXPECTED_RESULT_ZERO), new StringToNumbers().parseNumber(value));
  }

  @DisplayName("Test input Null that should result in zero")
  @Test
  public void testParseNumber_NullInExpectedZero() {
    assertEquals(Integer.valueOf(EXPECTED_RESULT_ZERO), new StringToNumbers().parseNumber(null));
  }

  @DisplayName("Test input that should result in positive number")
  @Test
  public void testParseNumber_positivIn() {
    assertEquals(Integer.valueOf(EXECPTED_RESULT_ONE), new StringToNumbers().parseNumber("1"));
  }

  @DisplayName("Test input that should result in negative number")
  @Test
  public void testParseNumber_negativeIn() {
    assertEquals(Integer.valueOf(EXECPTED_RESULT_MINUS_ONE), new StringToNumbers().parseNumber("-1"));
  }
}