package com.axis.dbconnection

import java.sql.DriverManager

data class userd(var id:     Int, val name: String)

fun main(){

    val myurl="jdbc:mysql://localhost:3306/kotlindb"
    val connection = DriverManager.getConnection(myurl, "root", "12345")
    println(" Connection established successfully!!")

    //   insert query -Create
    val res = connection.createStatement().executeUpdate("insert into users values(1,'Ravi')")
    val res1 = connection.createStatement().executeUpdate("insert into users values(2,'Prash')")
    val res2 = connection.createStatement().executeUpdate("insert into users values(3,'Maosan')")
    val res3 = connection.createStatement().executeUpdate("insert into users values(4,'Souchan')")




    if (res > 0) {
        println("successfully inserted record into users db !!!")
    } else {
        println("Insert Not sucessfull")
    }
}

