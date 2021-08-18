package controllers
import org.scalatra._
import javax._
class TinyJSServlet extends ScalatraServlet {

  get("/") {

    <!-- DOCTYPE html -->
    <html>
      <head>
        <meta charset="UTF-8"></meta>
        <title>Tiny JS Script</title>
      </head>
      <body>
        <H1>The Tiny JS Script</H1>
        <p>
        Please look at the JavaScript console output. In Chrome browser this is best done by
        right-clicking on the output page, then choosing "Inspect" and then going to the Console. 
        It should say: Hello ScalaJS world! 
        </p>
        <p>
        Note that the pesky "Nodebuffer( ..., ...)" is added by the Inline HTML functionality of 
        Scalatra. Test the landing page: Look at the Console there and you will find Hello ScalaJS world!
        as well.
        </p>
        <!-- Include Scala.js compiled code -->
        <script type="text/javascript" src="/assets/js/scala-js-tutorial-fastopt.js"></script>
      </body>
    </html>
    
  }


}
