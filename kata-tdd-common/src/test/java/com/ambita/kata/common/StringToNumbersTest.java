package com.ambita.kata.common;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringToNumbersTest {

  @Test
  public void testIsEmpty_nullIn() {

    assertTrue(new StringToNumbers().isEmpty(null));
  }

  @Test
  public void testIsEmpty_emptyIn() {

    assertTrue(new StringToNumbers().isEmpty(""));
  }

  @Test
  public void testIsEmpty_stringIn() {

    assertFalse(new StringToNumbers().isEmpty("-1"));
  }

  @Test
  public void testParseNumber_NullIn() {
    assertEquals(Integer.valueOf(0), new StringToNumbers().parseNumber(null));
  }

  @Test
  public void testParseNumber_emptyIn() {
    assertEquals(Integer.valueOf(0), new StringToNumbers().parseNumber(""));
  }

  @Test
  public void testParseNumber_letterIn() {
    assertEquals(Integer.valueOf(0), new StringToNumbers().parseNumber("D"));
  }

  @Test
  public void testParseNumber_positivIn() {
    assertEquals(Integer.valueOf(1), new StringToNumbers().parseNumber("1"));
  }

  @Test
  public void testParseNumber_negativeIn() {
    assertEquals(Integer.valueOf(-1), new StringToNumbers().parseNumber("-1"));
  }
}