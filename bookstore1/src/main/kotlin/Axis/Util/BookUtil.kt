package Axis.Util
import Axis.app.DbConnection
import Axis.Modal.Book

class BookUtil {

    var dbConnection= DbConnection()
    var connection=dbConnection.connect()



    fun addBook(book: Book):Int{

        val prepareStmt=connection.prepareStatement("insert into books values(?,?,?,?,?)")
        prepareStmt.setString(1,book.bookID)
        prepareStmt.setString(2,book.title)
        prepareStmt.setString(3,book.author)
        prepareStmt.setString(4,book.category)
        prepareStmt.setFloat(5,book.price)
        val rows = prepareStmt.executeUpdate()

        return rows
    }


    fun selectAllBooks(){
        val books= mutableListOf<Book>()
        val query = connection.prepareStatement("select * from books")
        val result = query.executeQuery()

        while(result.next()){
            val bookID = result.getString("bookID")
            val title= result.getString("title")
            val author= result.getString("author")
            val category= result.getString("category")
            val price= result.getFloat("price")

            books.add(Book(bookID,title,author, category, price))
        }

        for(book in books) {
            println(book)
        }

    }

    fun update(bookID: String, title:String, author: String, category: String, price:Float): Int {


        val prepareStmt = connection.prepareStatement("update books set title=?, author=?, category=?, price=? where bookID=?")
        prepareStmt.setString(1,title)
        prepareStmt.setString(5,bookID)
        prepareStmt.setString(2,author)
        prepareStmt.setString(3,category)
        prepareStmt.setFloat(4,price)

        val rows=prepareStmt.executeUpdate()

        return rows
    }



    fun delete(bookID: String): Int{
        val prepareStmt=connection.prepareStatement("delete from books where bookID=?")
        prepareStmt.setString(1,bookID)
        val rows=prepareStmt.executeUpdate()
        return rows
    }
    fun displaybybookID(bookID: String): MutableList<Book> {
        val books= mutableListOf<Book>()
        val display=connection.prepareStatement("select * from books where bookID=?")
        display.setString(1,bookID)
        val result=display.executeQuery()
        while(result.next()){
            val bookID1 = result.getString("bookID")
            val title= result.getString("title")
            val author= result.getString("author")
            val category= result.getString("category")
            val price=result.getFloat("price")
            books.add(Book(bookID1,title,author,category,price))
        }
        for(books3 in books) {
            println(books3)
        }
        return books
    }

    fun searchByAuthor(author: String): MutableList<Book> {
        val books= mutableListOf<Book>()
        val display=connection.prepareStatement("select * from books where author=?")
        display.setString(1,author)
        val result=display.executeQuery()
        while(result.next()){
            val bookID = result.getString("bookID")
            val title= result.getString("title")
            val author1= result.getString("author")
            val category= result.getString("category")
            val price=result.getFloat("price")
            books.add(Book(bookID,title,author1,category,price))
        }
        for(books1 in books) {
            println(books1)
        }
        return books

    }
    fun searchByTitle(title: String): MutableList<Book>{
        val books= mutableListOf<Book>()
        val display=connection.prepareStatement("select * from books where title=?")
        display.setString(1,title)
        val result=display.executeQuery()
        while(result.next()){
            val bookID = result.getString("bookID")
            val title1= result.getString("title")
            val author= result.getString("author")
            val category= result.getString("category")
            val price=result.getFloat("price")
            books.add(Book(bookID,title1,author,category,price))
        }
        for(books2 in books) {
            println(books2)
        }
        return books
    }


}