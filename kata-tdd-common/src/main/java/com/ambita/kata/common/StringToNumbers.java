package com.ambita.kata.common;

public class StringToNumbers {

  private static final String REGEX_FOR_NUMBER = "^-?[0-9]\\d*(\\.\\d+)?$";

  Boolean isEmpty(String numberString) {
    return numberString == null || numberString.isEmpty();
  }

  Integer parseNumber(String number) {
    if (number == null || !number.matches(REGEX_FOR_NUMBER)) {
      return 0;
    }

    return Integer.parseInt(number);
  }

  public int add(String numbers, String delimiter) {
    if (isEmpty(numbers)) {
      return 0;
    }
    int sum = 0;
    StringBuilder errorContent = new StringBuilder();
    String tmpNumbers = numbers.replace("\n", delimiter);
    for (String number : tmpNumbers.split(delimiter)) {
      int nr = parseNumber(number);
      sum += nr;

      if (nr < 0) {
        if (errorContent.length() > 0) {
          errorContent.append(",");
        }
        else if (errorContent.length() < 0) {

        }
        else {

        }
        errorContent.append(nr);
      }
    }
    if (errorContent.length() > 0) {
      throw new NumberFormatException("Number(s) " + errorContent.toString() + " is not allowed");
    }
    return sum;
  }
}

