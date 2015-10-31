package tutorial.webapp

import org.scalajs.dom.html
import fr.iscpif.scaladget.d3._
import fr.iscpif.scaladget.mapping._

import scala.scalajs.js.annotation.JSExport

/**
 * Created by IDEA on 31/10/15.
 */
@JSExport
object LearnD3 {
  @JSExport
  def main(div: html.Div): Unit = {
    //    d3.select(div).append("svg").attr("width", 500)
    //    .attr("height", 500).append("circle").attr("cx", 25)
    //    .attr("cy", 25).attr("r", 25).style("fill", "purple")
    d3.select("body").append("p")
  }
}