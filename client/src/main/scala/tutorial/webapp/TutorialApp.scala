package tutorial.webapp
import org.scalajs.dom
import org.scalajs.dom.document

object TutorialApp {
  def main(args: Array[String]): Unit = {
    val text = """
      Finally we are on our way to seeing a little bit more. 
      This text was generated in our TutorialApp displayed via 
      the synthesised JavaScript app. Hello!
    """
//    header(1, document.body, "Landing Page")
//    appendPar(document.body, text)
    Page01(document.body)
  }

  def header(level:Int, targetNode: dom.Node, text: String) = {
    val headerNode = document.createElement(s"h$level")
    headerNode.textContent = text    
    targetNode.appendChild(headerNode)
  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    parNode.textContent = text
    targetNode.appendChild(parNode)
  }

}