package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class PersonTest extends AnyFlatSpec {
//
  "Person" should "return true as age of person2 is greater" in {
    val personOne = new Person("Sagar", 11)
    val personTwo = new Person("Sagar",12)
    val result = personOne < personTwo
    assert(result)
  }

  it should "return false as age of person2 is greater" in {
    val personOne = new Person("Sagar", 11)
    val personTwo = new Person("Sagar",12)
    val result = personOne > personTwo
    assert(!result)
  }

  it should "return true as age of person1 is greater" in {
    val personOne = new Person("Sagar", 12)
    val personTwo = new Person("Sagar",11)
    val result = personOne > personTwo
    assert(result)
  }

  it should "return false as age of person1 is greater" in {
    val personOne = new Person("Sagar", 12)
    val personTwo = new Person("Sagar",11)
    val result = personOne < personTwo
    assert(!result)
  }

  it should "return false as ages are equal (not less than)" in {
    val personOne = new Person("Sagar", 12)
    val personTwo = new Person("Sagar",12)
    val result = personOne > personTwo
    assert(!result)
  }

  it should "return false as ages are equal (not greater than)" in {
    val personOne = new Person("Sagar", 12)
    val personTwo = new Person("Sagar",12)
    val result = personOne < personTwo
    assert(!result)
  }

  it should "return true as person1 can be greater than or equals person2" in {
    val personOne = new Person("Sagar", 12)
    val personTwo = new Person("Sagar",12)
    val result = personOne >= personTwo
    assert(result)
  }

  it should "return true as person1 can be less than or equals person2" in {
    val personOne = new Person("Sagar", 12)
    val personTwo = new Person("Sagar",12)
    val result = personOne <= personTwo
    assert(result)
  }

  it should "return true as length of person1's name is greater" in{
    val personOne = new Person("SagarGoel", 12)
    val personTwo = new Person("Sagar",12)
    val result = personOne > personTwo
    assert(result)
  }

  it should "return false as length of person1's name is greater" in{
    val personOne = new Person("SagarGoel", 12)
    val personTwo = new Person("Sagar",12)
    val result = personOne < personTwo
    assert(!result)
  }

  it should "return true as length of person2's name is greater" in{
    val personOne = new Person("Sagar", 12)
    val personTwo = new Person("SagarGoel",12)
    val result = personOne < personTwo
    assert(result)
  }

  it should "return false as length of person2's name is greater" in{
    val personOne = new Person("SagarGoel", 12)
    val personTwo = new Person("Sagar",12)
    val result = personOne > personTwo
    assert(result)
  }

}