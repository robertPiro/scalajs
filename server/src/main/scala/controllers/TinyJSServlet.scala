package controllers
import org.scalatra._
import javax._
class TinyJSServlet extends ScalatraServlet {

  get("/") {
    <html>
      <head> <title>The Scala.js Tutorial</title> </head>
    </html>
    
    <script type="text/javascript" src="/assets/js/scala-js-tutorial-fastopt.js"></script>
  }
}
