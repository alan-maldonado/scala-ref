/* Functions */

/*
  def functionName(input1:type,intput2:type): return type = {
    do stuff
  }
*/

def simple(): Unit = {
  println("hey there")
}
simple()

// With parameters
def adder(num1:Int,num2:Int): Int = {
  return num1 + num2
}
adder(2,3)

// Check if a number is prime
def isPrime(numcheck:Int): Boolean = {
  for(n <- Range(2,numcheck)){
    if(numcheck%n == 0){
      return false
    }
  }
  return true
}

// "One Line Functions"
def quickgreet(name:String) = s"hey $name"
def quickadder(num1:Int,num2:Int) = num1+num2
quickgreet("alan")
quickadder(3,4)
