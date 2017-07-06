/* Missing data */

import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()

val df = spark.read.option("header","true").option("inferSchema","true").csv("./data/containsnull.csv")

df.printSchema()
df.show()

// You basically have 3 options with Null values
// 1. Just keep them, maybe only let a certain percentage through
// 2. Drop them
// 3. Fill them in with some other value

// Drop any rows with any amount of na values
df.na.drop().show()

// Drop any rows that have less than a minimum Number
// of NON-null values ( < Int)
df.na.drop(2).show()

// Fill in the Na values with Int
df.na.fill(100).show()

// Fill in String will only go to all string columns
df.na.fill("Emp Name Missing").show()

// Be more specific, pass an array of string column names
df.na.fill("Specific",Array("Name")).show()

// Fill in Sales with average sales.
df.describe().show()

df.na.fill(400.5).show()
