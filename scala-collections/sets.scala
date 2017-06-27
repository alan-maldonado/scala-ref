/* Sets */
// A collection with no duplicate elements
// can be mutable or inmutable

// Inmutable
val my_set = Set(1,1,2,2,2,3,3,3)

// Mutable
val my_mset = collection.mutable.Set(1,1,2,2,2,3,3,3)
my_mset += 4
my_mset.add(5)

// Operations
my_set.max
my_set.min

// Cast to Set
val my_list = List(1,2,3,1,2,3)

my_list.toSet
