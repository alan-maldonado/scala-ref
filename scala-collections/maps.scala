/* Maps */
// (Key,Value) Pair storage (hash table or dictionary)
val my_map = Map(("a", 1),("b",2),("c",3))

// Indexing
my_map("a")
my_map get "b"

// Additions on Inmutable
my_map = ("z"->99)

// Mutable maps
val my_mut_map = collection.mutable.Map(("x",1),("y",2),("z",3))
my_mut_map += ("z"->99)


// Operations
my_map.values
my_map.keys
