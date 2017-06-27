/* Strings */

// Printing
println("hello")

// Concatenation
val fairwell = "Good" + "Bye"

// Repeating
val repeat = "Dance!"*5

// String Length
val st = "hello"
st.length()

// Inserting Objects
val name = "Alan"

// String Interpolation
val greet = s"Hello ${name}"

// printf
printf("A string: %s , an integer %d, a float %f","hi",10,2.5)
printf("A string: %s , an integer %d, a float %1.2f","hi",10,2.5)

// 'f' Interploation
val greet = f"Hello ${name}"
val greet = f"Hello $name"

// String Indexing
f"First letter of name is $name%.1s"


/* Regular Expressions */

// Index Location
val st = "This is a long string"

st.charAt(0)
st.indexOf("a")

// Pattern matching
val st = "term1 term2 term3"

st contains "term1"
st matches "term1"
st matches "term1 term2 term3"

// Slicing
val st = "hello"

st slice (0,2)
st slice (2,st.length)
