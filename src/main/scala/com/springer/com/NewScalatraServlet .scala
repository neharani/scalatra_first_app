package com.springer.com

import org.scalatra._
import scalate.ScalateSupport


class NewScalatraServlet extends Search_applicationStack {

  	post("/"){
     <html>
       <body>
        <p>You posted: {params("submission")} </p> 
       </body>
     </html>
 	}
  
}

 