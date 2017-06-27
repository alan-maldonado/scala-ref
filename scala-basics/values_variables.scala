/* Variables and Values */

/*
  General Fromat
  val <name>: <type> = <literal>
  var <name>: <type> = <literal>

  val are INMUTABLE
  var are MUTABLE
*/


var myvar: Int = 10
val myval: Double = 2.5


myvar = "hello"
// type mismatch

myvar = 10
myval = 25.5


// Infer data types
var mystring = "my_string"

// (not recommended, but possible)
val `my.string` = "hello"
