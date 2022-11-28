package Axis.app

import java.sql.Connection
import java.sql.DriverManager

class DbConnection {
    fun connect(): Connection {
        val myurl ="jdbc:mysql://localhost:3306/bookstoredb"
        val connection = DriverManager.getConnection(myurl, "root", "12345")
        return connection
    }
}