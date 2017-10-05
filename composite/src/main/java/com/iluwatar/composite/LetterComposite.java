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

/**
 * 
 * Composite interface
 *
 * TIPP: Lasst Euch vom Namen "Composite" nicht verwirren. Die Klasse ({@link LetterComposite} entspricht der "Component" (Diagramm Buch S. 214)
 * Die Klassen ({@link Word} und ({@link Sentence} entsprechen je einem "Composite" (aus dem Diagramm Buch S. 214)
 *
 * @ERL.: implementiere die für eine Composite-Klasse typischen Methoden
 *
 */
public abstract class LetterComposite {

  ArrayList<LetterComposite> listeAllerWordsUndLetters = new ArrayList<>();


  public void add(LetterComposite letter) {
    listeAllerWordsUndLetters.add(letter);
    //System.out.println("--->" +letter.getClass().getName());
  }

  public void remove(LetterComposite letter) {
    listeAllerWordsUndLetters.remove(letter);
  }

  public LetterComposite getChild(int index) {
    //System.out.println("index:");
    return listeAllerWordsUndLetters.get(index);
  }

  public int count() {
    return listeAllerWordsUndLetters.size();
  }

  // ist abstract, muss jeder selber implementieren
  // z.B. beim Sentence ein Punkt am Schluss. Oder bei den Woren ein Leerschlag
  protected abstract void printThisBefore();

  // ist abstract, muss jeder selber implementieren
  // z.B. beim Sentence ein Punkt am Schluss. Oder bei den Woren ein Leerschlag
  protected abstract void printThisAfter();


  /** -----------------------------------------------------------------------------------
   * Print
   * Rekursive Method, ruft sich also selber auf
   * Die ganze Hierarchie runter
   * -----------------------------------------------------------------------------------
   */
  public void print() {

    // wird auf jedem aufgerufen, egal ob letter, word, sentence
    // macht fast nichts, nur z.B. beim Sentence ein Punkt am Schluss. Oder bei den Woren ein Leerschlag
    printThisBefore();

    // ERL.: iteriere über childern      // andere schreibweise: listeAllerWordsUndLetters.forEach(LetterComposite::print);
    for (LetterComposite lc : listeAllerWordsUndLetters) {
      lc.print();
    }


    // wird auf jedem aufgerufen, egal ob letter, word, sentence
    // macht fast nichts, nur z.B. beim Sentence ein Punkt am Schluss. Oder bei den Woren ein Leerschlag
    printThisAfter();

  }
}
