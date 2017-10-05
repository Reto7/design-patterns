/**
 * The MIT License
 * Copyright (c) 2014-2016 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.iluwatar.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Composite interface
 *
 * TIPP: Lasst Euch vom Namen "Composite" nicht verwirren. Die Klasse ({@link LetterComposite} entspricht der "Component" (Diagramm Buch S. 214)
 * Die Klassen ({@link Word} und ({@link Sentence} entsprechen je einem "Composite" (aus dem Diagramm Buch S. 214)
 *
 * @todo: implementiere die für eine Composite-Klasse typischen Methoden
 */
public abstract class LetterComposite {

  public void add(LetterComposite letter) {
  }

  public void remove(LetterComposite letter) {
  }

  public LetterComposite getChild(int index) {
    return null;
  }

  public int count() {
    return 0;
  }

  protected abstract void printThisBefore();

  protected abstract void printThisAfter();

  /**
   * Print
   * TIPP: Rekursive Method, ruft sich also selber auf
   */
  public void print() {
    printThisBefore();

    // todo: iteriere über childern

    printThisAfter();
  }
}
