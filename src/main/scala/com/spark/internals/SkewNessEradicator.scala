package com.spark.internals

import org.apache.spark.sql.{Column, DataFrame}

object SkewNessEradicator {

  implicit class EnhancedDF(df: DataFrame){

    def skewEradicateJoin(df: DataFrame, lookup: DataFrame, joinExpr:Column, typeofColumn: String ) = {



    }

  }

}
