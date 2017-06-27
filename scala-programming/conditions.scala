// Coditions
// if, else if, and else

/*
   if(boolean){
     do something
   }else if(boolean){
     do something else
   }else if(boolean){
     do something else
   }else{
     do something if none of the booleans were true
   }
*/

// In Scala delopers typically omit semicolons

val x = "hey there"
if (x.endsWith("e")){
  println("the value x ends with e")
}

// Logical Operators
// AND &&
println((1 == 2) && (2 == 2)) // false
println((1 == 1) && (2 == 2)) // true
// OR ||
println((1 == 2) || (2 == 2)) // true
println((1 == 1) || (2 == 2)) // true
// NOT !
println(!(1==1)) // false
println(!(2==1)) // true
