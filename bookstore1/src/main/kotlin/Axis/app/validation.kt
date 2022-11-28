package Axis.app

import Axis.app.exception.bookexception

class validation {

    fun validateCategory(category:String){

        if ((category!="Science") && category!="Fiction" && category!="Technology" && category!="Others"){
            throw bookexception("Invalid book Exception -category ")
        }
    }
    fun validatePrice(price:Float){
        if (price<0){
            throw bookexception("Invalid book exception - price")
        }
    }

    fun validateBookID(bookID:String){
        if (!(bookID.startsWith("B") && (bookID.length==4)))
            throw bookexception("Invalid book exception- bookId")
    }




}