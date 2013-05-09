package com.springer.com

import org.scalatra._
import scalate.ScalateSupport


import scala.xml.{Text, Node}


class MyScalatraServlet extends Search_applicationStack {

  
  get("/home"){ 
    <html>
      <body>
        <h1>Hello, world..!</h1>
       
		<form action={url("/next")} method='POST'>
           Enter some keyword: <input name="submission" type='text'/>
           <input type='submit'/>
        </form>
	
	  </body>
	</html>

  }

 	post("/next"){
     <html>
       <body>
        <p>You posted: {params("submission")} </p> 
       </body>
     </html>
 	}

}

 