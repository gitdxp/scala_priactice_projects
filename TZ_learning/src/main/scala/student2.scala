class student2 {
  private var stuName:String = "Tom"
  private val stuAge:Int = 23
}

object student2{
  def main(args:Array[String]) = {
    var s2 = new student2
    println(s2.stuName)
    println(s2.stuAge)
    //s2.stuName_("tom")???
  }
}
/*
    1.scala 定义了私有变量后，会自动生成它的get 和 set方法
    private var  strName:String
      get:strName
      set:strName_
    2.如果只有get没有set
      将属性定义成常量 val
    3.不希望生成get set方法，private[this]
        该属性只属于私有

 */
