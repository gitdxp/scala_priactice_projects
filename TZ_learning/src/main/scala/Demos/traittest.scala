package Demos

class traittest {

}
trait Human{
  var id:Int
  var name:String
  def sayHello() = "hello " + name
}

trait Action{
  def getAction():String
}

class Student(var id:Int ,var name:String) extends  Human with Action{
  def getAction() = "Action is running"
}

object traittest{
  def main(args: Array[String]): Unit = {
    var stu = new Student(12, "Tom")
    println(stu.getAction())
    println(stu.sayHello())
  }
}