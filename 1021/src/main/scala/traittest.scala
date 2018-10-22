package src.main.scala

class traittest {

}
trait Human{
  var id:Int
  var name:String
  def sayHello() = "hello " + name
}

trait Action{
  def getAction(): String
}
class Student(var id:Int, var name:String) extends Human with Action {
  override def getAction(): String = "Action is running"
}
object traittest{
  def main(args: Array[String]): Unit = {
    var stu = new Student(23,"Mike")
    println(stu.sayHello())
    println(stu.getAction())
  }
}
