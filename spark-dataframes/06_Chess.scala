/* Chess Data */

// Just for fun

import org.apache.spark.sql.SparkSession
val spark = SparkSession.builder().getOrCreate()

val df = (spark.read
  .option("header","true")
  .option("sep","|")
  .option("inferSchema","true")
  .csv("./data/chess_players_july_2017.csv"))

df.printSchema()
/*
  ID Number,
  Name,
  Fed,
  Sex,
  Tit, (Title)
  WTit, (Woman Title)
  OTit, (Other Title)
  FOA, (Fide Online Arena)
  SRtng, (Standard Rating) Main Rating
  SGm, (Standard Games)
  SK, (Standard K)
  RRtng, (Rapid Rating) Games for 10min+0sec to 1:30 hours
  RGm, (Rapid Games)
  Rk, (Rapid K)
  BRtng, (Blitz Rating) Rated Games 5min+3sec, 5+0, 3+2
  BGm, (Blitz Games)
  BK, (Blits K)
  B-day, (Player birtday year)
  Flag
*/
