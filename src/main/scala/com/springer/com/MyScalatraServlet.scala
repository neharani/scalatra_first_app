package com.springer.com

import org.scalatra._
import scalate.ScalateSupport


import scala.xml.{Text, Node}


class MyScalatraServlet extends Search_applicationStack {

  get("/index") {
    contentType="text/html"
    jade("/index", "title" -> "My First Jade Template")
  }

 	post("/next"){
     <html>
       <body>
        <p>You posted: {params("word")} </p>
       </body>
     </html>
 	}

}

 