/*
 * MIT License
 *
 * Copyright (c) 2018 Sitraka Ratsimba
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.github.strka.realconvert.unit.temperature;

import static org.junit.Assert.assertEquals;

import com.github.strka.realconvert.util.BigDecimalBuilder;
import org.junit.Test;

public class CelsiusTest {

  @Test
  public void normalize() {
    Celsius c = new Celsius(10.4);
    Kelvin k = c.normalize();
    assertEquals(0, new BigDecimalBuilder().build(283.55).compareTo(k.getValue()));
  }

  @Test
  public void from() {
    Celsius c = new Celsius(10.4);
    Celsius c1 = c.from(new Kelvin(283.55));
    assertEquals(0, c.getValue().compareTo(c1.getValue()));
  }
}