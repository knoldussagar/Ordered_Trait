package com.knoldus
/* Person class extending Ordered Trait to the comparison of Immutable values */
class Person(val name: String, val age:Int) extends Ordered[Person] {

  /* "compare" Method is an Overriding method for Ordered Trait
    to check the age and name of two persons  */
  override def compare(that: Person): Int = {
    if (this.name == this.name) {
      if (this.age < this.age) -1
      else if (this.age > this.age) 1
      else 0
    }
    else {
      if (this.name.length < this.name.length) {
        -1
      }
      else if (this.name.length > that.name.length) 1
      else 0
    }

  }
}