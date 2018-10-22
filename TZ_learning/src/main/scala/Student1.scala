class Student1 {
  private var stuName:String = "Tom"
  private var stuAge:Int = 23
  def getStuName():String = stuName
  def setStuName(newName:String) = this.stuName = newName

  def getStuAge():Int = stuAge
  def setStuAge(newAge:Int) = this.stuAge = newAge

}

//开发一个测试程序，来创建学生对象
//object对象的名字和类的名字可以不一样，如果一样，Object对象
//就叫做这个类伴生对象
object Student1{
  def main(args:Array[String]) = {
    var s1 = new Student1
    println(s1.getStuName()+"\t"+s1.getStuAge())

    s1.setStuName("Mary")
    s1.setStuAge(20)
    println(s1.getStuName()+"\t"+s1.getStuAge())

    println(s1.stuName+"\t"+s1.stuAge+"get");
  }
}
