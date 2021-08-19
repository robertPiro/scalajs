import controllers._        //imports all controllers in that subdirectory
import org.scalatra._
import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    //do not add a servlet mapping for "/" (root). The servelet will intercept
    //ALL requests, especially those to /assets/js/... !!!
    val servlet = context.addServlet("TinyJSServlet", new TinyJSServlet)
    servlet.setLoadOnStartup(1)
    servlet.addMapping("/firstTinyJS")
    val servlet1 = context.addServlet("WebAssetServlet", new WebAssetServlet)
    servlet1.setLoadOnStartup(1)
    servlet1.addMapping("/caveats")
  }
}