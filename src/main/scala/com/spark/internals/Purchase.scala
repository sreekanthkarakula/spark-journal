package com.spark.internals
import java.sql.Struct

import org.apache.spark
import org.apache.spark.sql.SparkSession

object Purchase {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession.builder.appName("Simple Application").getOrCreate()

    val df = spark.read.option("header", true).csv("/Users/sreekanthreddykarakula/Downloads/data.csv")

    val purchases = df.select("Purchase")

    import spark.implicits._

    purchases.map(row => {

    })

  }

  def convertToArrayofStruct( row: org.apache.spark.sql.Row ): Array[Struct] = {

    

  }

}
