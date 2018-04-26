package models

import slick.basic.DatabaseConfig
import slick.jdbc.JdbcProfile

object DB {

  val dbConfig: DatabaseConfig[JdbcProfile] = DatabaseConfig.forConfig("sqlserver")
  val db: JdbcProfile#Backend#Database = dbConfig.db

}
