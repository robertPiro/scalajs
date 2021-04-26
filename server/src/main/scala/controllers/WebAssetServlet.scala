package controllers

import org.scalatra._

class WebAssetServlet extends ScalatraServlet {

  /**
  * Serves up the index page for route "/"
  * https://scalatra.org/guides/2.4/views/inline-html.html
  */
   
  //Scalatra bootstrap registeres this servlet already under route /index.
  //So we must use just "/" here. 
  get("/"){  
    contentType="text/html"

    <html>
      <head><title>Test WebAsset</title></head>
      <body>
        <H1>WebAsset Accessibility</H1>
        <p>
        In <code>{addSuffix("ScalatraBootstrap")}</code> a route can be mapped to a servlet
        which in turn then defines actions for the given sub-routes. However, one 
        route should not be mapped to any servlet and that is <code> / </code> (the root). 
        If <code> / </code> is mapped to a servlet, the <code>assets</code> folder is 
        effectively blocked by the servlet and neither scripts nor images can be served.
        A picture showing a VW camper van should be visible on the page.
        </p>
        <img src="/assets/js/vw.jpg" width="300" ></img>
        <small><a href="https://unsplash.com/photos/PtW4RywQV4s">Source</a>: Fedor (@fmdevice) at unsplash </small>
      </body>
    </html>
    }
    
    def addSuffix(arg:String) = s"$arg.scala"
    
}
