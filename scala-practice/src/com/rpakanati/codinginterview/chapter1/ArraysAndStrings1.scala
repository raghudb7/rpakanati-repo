package com.rpakanati.codinginterview.chapter1

/*
 * Implement an algorithm to determine if a string has all unique characters What if you can not use additional data structures?
 */
object ArraysAndStrings1 extends App {

  hasAllUniqueCharacters2("xxx")
  hasAllUniqueCharacters2("abc")

  def hasAllUniqueCharacters(string: String) {
    val hasAllUniqueCharacters = string.size == string.toCharArray.toSet.size
    if (hasAllUniqueCharacters) {
      println("Given string: " + string + " has all unique characters.")
    } else {
      println("Given string: " + string + " does not have all unique characters.")
    }
  }

  def hasAllUniqueCharacters2(string: String) {
    var beginIndex = 0
    string.toCharArray.foreach { c1 =>
      beginIndex += 1
      string.substring(beginIndex, string.size).toCharArray.foreach { c2 =>
        if (c1 == c2) {
          println("Given string: " + string + " does not have all unique characters.")
          return
        }
      }
    }
    println("Given string: " + string + " has all unique characters.")
  }
}