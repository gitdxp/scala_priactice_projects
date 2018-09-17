//映射 key value
//不可变映射 immutable
val scores = Map("Tom"->80,"Mary"->90,"Mike"->50)

//可变映射 mutable
val chinese = scala.collection.mutable.Map("Ketty"->90,"Jerry"->23)

//获取值
chinese("Ketty")
scores("Tom")
//判断值是否存在
chinese.getOrElse("Mary",-1)
//改值
//chinese("Ketty") = 100

//添加新的元素
chinese += "Bob"->12



