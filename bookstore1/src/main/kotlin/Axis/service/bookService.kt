package Axis.service
import Axis.Modal.Book
import Axis.Util.BookUtil

    class bookService {
        private var bookUtil=BookUtil()

        fun addBook(book: Book){
            val records=bookUtil.addBook(book)
            if (records>0) println("$records rows inserted successfully")
            else println("record not found")
        }

        fun display(){
            return  bookUtil.selectAllBooks()
        }


        fun updateBook(bookID: String,title: String,author: String,category: String, price :Float ){
            val records=bookUtil.update(bookID,title,author,category,price)
            if (records>0) println("$records rows updated successfully")
            else println("record not found")
        }

        fun deleteBook(bookID: String){
            val records=bookUtil.delete(bookID)
            if (records > 0) println("$records rows deleted successfully")
            else println("record not found")
        }
        fun displaybybookID(bookID: String): MutableList<Book> {
            return  bookUtil.displaybybookID(bookID)
        }
        fun searchByAuthor(author: String): MutableList<Book> {
            return  bookUtil.searchByAuthor(author)
        }
        fun searchByTitle(title: String): MutableList<Book>{
            return  bookUtil.searchByTitle(title)
        }


    }
