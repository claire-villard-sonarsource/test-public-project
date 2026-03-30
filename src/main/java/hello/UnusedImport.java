/*
 * Copyright (C) 2009-2021 SonarSource SA
 * All rights reserved
 * mailto:info AT sonarsource DOT com
 */
package hello;

import java.math.BigInteger;

public class UnusedImport {

  private UnusedImport() {
    // utility class
  }

  public static boolean isBlank(String nullable) {
    return nullable == null || nullable.isEmpty() || nullable.matches("\\s+");
  }
}
