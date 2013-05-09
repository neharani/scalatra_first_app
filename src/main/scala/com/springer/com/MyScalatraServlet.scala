package com.springer.com

import org.scalatra._
import dispatch._

import scala.xml.{NodeSeq, XML, Text, Node}


class MyScalatraServlet extends Search_applicationStack {

  get("/index") {
    contentType="text/html"
    jade("/index", "title" -> "My First Jade Template")
  }

 	post("/next") {
    contentType="text/html"
    val word = {params("word")}
    val svc = dispatch.url("http://services.aonaware.com//DictService/DictService.asmx/Define?word=" + word)
    val country = (dispatch.Http(svc OK as.String))()
    val xml = XML.loadString(country)
    val definitions = ((xml \\ "Definitions") \\ "Definition")
    val result = ((definitions.foldLeft(List("")){(x:List[String],y:NodeSeq) => (y \\ "WordDefinition").text :: x})).toList
    jade("/result", "title" -> "Word Results", "word" -> word, "definitions" -> result)
 	}

}

 