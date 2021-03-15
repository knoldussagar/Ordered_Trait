package com.knoldus
/* Object Creation to Compare age and name of two persons */

object Main {
  /* Main Method */
  def main(args: Array[String]): Unit = {

    val personOne = new Person("saguaro", 22) //Immutable Object for person one

    val personTwo = new Person("goal", 25) // Immutable Object for second person
    /* Checking all Values */
    println(personOne < personTwo)

    println(personOne > personTwo)

    println(personOne <= personTwo)

    println(personOne >= personTwo)

  }


}
