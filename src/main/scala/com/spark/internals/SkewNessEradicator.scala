package com.spark.internals

import org.apache.spark.sql.{Column, DataFrame}

object SkewNessEradicator {

  implicit class EnhancedDF(df: DataFrame){

    def skewEradicateJoin(df: DataFrame, lookup: DataFrame, joinExpr:Column, typeofColumn: String, partitionsize: Integer ) = {

      val df_enhanced = lookup.withColumn("skeu_id", Array(Range(0, partitionsize).toList.map(lit): _* ))




    }

  }

}
