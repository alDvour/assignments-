package Axis.app
import Axis.app.DbConnection
import Axis.Modal.Book
import Axis.app.exception.bookexception
import Axis.service.bookService
import java.util.*

fun main() {
    val Validation = validation()
    val BookService = bookService()
    val sc = Scanner(System.`in`)
    println("---------------------MENU----------------------")
    println(" 1.Add\n 2.Display All\n 3.Modify\n 4.Delete\n 5.Display specific book\n 6.Search book by author\n 7.Search by title\n 8.Exit")
    println("Enter choice")
    var choice = sc.nextInt()
    while (choice < 8) {
        when (choice) {
            1 -> {
                println("enter book ID: ")
                val bookID: String = sc.next()
                try {

                    //validating  book id
                    Validation.validateBookID(bookID)
                }catch(e:bookexception){
                    println(e.message)
                }
                println("Enter title of the book: ")
                val title: String = sc.next()
                println("Enter author of the book:  ")
                val author: String = sc.next()
                println("Enter category of the book: ")
                val category: String = sc.next()
                try {
                    //validating category
                    Validation.validateCategory(category)
                }catch(e:bookexception){
                    println(e.message)
                }
                println("Enter price of the book: ")
                val price: Float = sc.nextFloat()

                //object creation
                val book = Book(bookID, title, author, category, price)
                //function call to bookService
                BookService.addBook(book)

            }

            2 -> {
                //display all rows
                BookService.display()
            }

            3 -> {
                //update book
                println("Enter book Id to update book name ")
                val bookIdToUpdate:String = sc.next()

                println("enter updated book title")
                val booktitleUpdated = sc.next()

                println("enter updated book author")
                val bookAuthorUpdated = sc.next()

                println("enter updated book category")
                val bookCategoryUpdated = sc.next()

                println("enter updated book price")
                val bookPriceUpdated = sc.nextFloat()


                BookService.updateBook(bookIdToUpdate, booktitleUpdated, bookAuthorUpdated, bookCategoryUpdated, bookPriceUpdated)
            }

            4 -> {
                //delete row
                println("enter book id to delete: ")
                val bookIdToDelete = sc.next()
                BookService.deleteBook(bookIdToDelete)

            }
            5 -> {
                println("Enter BookID : ")
                val bookIDdisplay = sc.next()
                BookService.displaybybookID(bookIDdisplay)
            }

            6 -> {
                println("Enter author of the book : ")
                val bookauthor = sc.next()
                BookService.searchByAuthor(bookauthor)
            }
            7 -> {
                println("Enter title of the book : ")
                val bookTitle = sc.next()
                BookService.searchByTitle(bookTitle)
            }

            8 -> {
                println("Program End")
                System.exit(0)
            }
        }

        println("process completed enter choice to continue")
        println(" 1.Add\n 2.Display\n 3.Modify\n 4.Delete\n 5.Display specific book\n 6.Search book by author\n 7.Search by title\n 8.Exit")


        val ch = sc.nextInt()
        choice = ch
    }
}