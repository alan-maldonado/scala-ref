/* DataFrame Operations */

// http://spark.apache.org/docs/latest/api/scala/index.html#org.apache.spark.sql.functions$

import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()

val df = spark.read.option("header","true").option("inferSchema","true").csv("./data/citigroup2006_2008.csv")

df.printSchema()

/* Filtering data*/
// This import is needed to use the $-notation
import spark.implicits._

// $-notation
df.filter($"Close" > 500).show()
// df.filter("Close > 500").show() // SLQ

// Count
df.filter($"Close">500).count()

// Triple ===
df.filter($"High"===484.40).show()
// df.filter("High = 484.40").count() // SQL

df.filter($"Close"<480 && $"High"<480).show()
// df.filter("Close<480 AND High < 484.40").show() //SQL

// Collect results into a scala object (Array)
val High484 = df.filter($"High"===484.40).collect()

// Correlation
df.select(corr("High","Low")).show() // Pearson Correlation
