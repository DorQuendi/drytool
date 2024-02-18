package drytool

import scala.scalajs.js
import scala.scalajs.js.annotation.*

import org.scalajs.dom

@main
def Drytool(): Unit =
  dom.document.querySelector("#app").innerHTML = s"""
    <p>Drytool is very cool!</p>
  """