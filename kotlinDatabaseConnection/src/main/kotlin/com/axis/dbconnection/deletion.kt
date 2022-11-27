package com.axis.dbconnection

import java.sql.DriverManager

data class usera(var id:     Int, val name: String)

fun main() {

    val myurl = "jdbc:mysql://localhost:3306/kotlindb"
    val connection = DriverManager.getConnection(myurl, "root", "12345")
    println(" Connection established successfully!!")

    //deletion
    val stmt = connection.createStatement()
    val delete_res=stmt.executeUpdate("delete from users where id = 1")
    if( delete_res > 0){
        println("successfully deleted record in users db !!!")
        println("$delete_res rows deleted")
    } else{
        println("Deletion failed")
    }
}