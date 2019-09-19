package example

import scalaj.http._

object Hello extends App {
  println(Http("http://example.com").asString.body)
}

