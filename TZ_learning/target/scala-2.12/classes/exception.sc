try{
  val words = scala.io.Source.fromFile("d:\\djfldjdj.txt").mkString
}catch{
  case ex:java.io.FileNotFoundException =>{
    println("file noe found")
  }
  case ex:IllegalAccessError =>{
    println("Illegal Argument Exception")
  }
  case _:Exception =>{
    println("other exception")
  }
}finally {
  println("finally block")
}