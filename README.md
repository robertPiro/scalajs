# ScalaJS
This GitPod enables Scala 2 highlighting and is meant as a playground and learning tool 
for Scala JS.

It is a slightly updated setup of an SBT multi-project by [Naoki Takezoe](https://github.com/takezoe/scalatra-scalajs.g8/blob/master/server/src/main/twirl/main.scala.html). However, I left TWIRL, JQuery and other features out, as I want to have a very plain application and understand how it works.
In time I may add those back, arriving essentially at Naoki's setup. 

The idea is to start the server and to develop away on the [Tutorial app](https://www.scala-js.org/doc/tutorial/basic/index.html). For that the server must be running and sbt. 
## Running the Server
To run the server, issue `jetty` in the SBT console. GitPod should notify you of a new port. The port can stay private. Choose to open in browser. Reload the page if it does not work right away. It should get you onto the landing page.

