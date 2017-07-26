// LOGISTIC REGRESSION CLASSIFIER
// https://spark.apache.org/docs/latest/ml-classification-regression.html

import org.apache.spark.ml.classification.LogisticRegression
import org.apache.spark.sql.SparkSession

val spark = SparkSession.builder.getOrCreate()

// $example on$
// Load training data
val training = spark.read.format("libsvm").load("./data/sample_libsvm_data.txt")

val lr = (new LogisticRegression()
  .setMaxIter(10)
  .setRegParam(0.3)
  .setElasticNetParam(0.8))

// Fit the model
val lrModel = lr.fit(training)

// Print the coefficients and intercept for logistic regression
println(s"Coefficients: ${lrModel.coefficients} Intercept: ${lrModel.intercept}")
