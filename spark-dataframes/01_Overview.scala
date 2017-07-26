/* Dataframes */

// http://spark.apache.org/docs/latest/api/scala/index.html#org.apache.spark.sql.Dataset

// Start Spark Session
import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()

// Create a DataFrame (DataSet) from Spark Session read csv
val df = spark.read.option("header","true").option("inferSchema","true").csv("./data/citigroup2006_2008.csv")

df.head(5) // returns an Array
println("\n")
for(line <- df.head(5)){
  println(line)
}

df.columns

df.printSchema()

df.describe()

// Select Single Column
df.select("Volume").show()

// Multiple Columns
df.select($"Date",$"Close").show(2)

// New Columns
val df2 = df.withColumn("HighPlusLow",df("High")-df("Low"))
// Show result
df2.columns
df2.printSchema()

df2.head(5)

// Renaming
df2.select(df2("HighPlusLow").as("HPL"),df2("Close")).show()
