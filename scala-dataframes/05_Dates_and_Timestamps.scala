// Dates and TimeStamps

// http://spark.apache.org/docs/latest/api/scala/index.html#org.apache.spark.sql.functions$@add_months(startDate:org.apache.spark.sql.Column,numMonths:Int):org.apache.spark.sql.Column


import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()

val df = spark.read.option("header","true").option("inferSchema","true").csv("./data/citigroup2006_2008.csv")
df.printSchema()

df.select(month(df("Date"))).show()
df.select(year(df("Date"))).show()

// Mean per Year
val df2 = df.withColumn("Year",year(df("Date")))

val dfavgs = df2.groupBy("Year").mean()
dfavgs.select($"Year",$"avg(Close)").show()
