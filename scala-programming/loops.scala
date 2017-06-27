/* Loops */

/*
  For loops

  for(item <- iterable_sequence){
    do something
  }
*/

// Lists
for(item <- List("a","b","c")){
  println(item)
}

// Range
for(num <- Range(0,3)){
  println(num)
}

for(anything <- Range(0,3)){
  println("hello")
}

/*
  While loops

  while(condition){
    do something
    remeber to affect the condition
  }
*/

var x = 0

while(x < 5){
  println(s"x is currently $x")
  println("x is still less than 5, adding 1 to x")
  x = x+1
}

// Breaks
import util.control.Breaks._

var y = 0

while(y < 10){
  println(s"y is currently $y")
  println("y is still less than 10, adding 1 to y")
  y = y+1
  if(y == 3) break
}
