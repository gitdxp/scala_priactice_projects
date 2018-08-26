//视图界定：是上界和下界的一个扩展
//定义一个函数 完成 两个字符串的拼加
def addTwoString[T <: String](x:T,y:T) = { println(x+"***"+y) }
//调用addTwoString("Hello","World")
//再调用一次：addTwoString(100,200 )
//这是两个数字 ，不是String类型，
//但是 期望得到的结果是 100*****200
//100---> “100”
//视图界定：适用更广泛的范围   
//以上界为例  <:  接收除了所有的子类以外，还允许接收隐式
//										转换过去的类型 
//定义：  <% 
// 使用视图界定来重新定义
def addTwoString[T <% String](x:T,y:T) = { println(x+"%%%%%%"+y) }
//1.String 和 String的子类
//2.还可以是转换成String的类型
//视图界定的时候：一定有一个转换规则  隐式转换函数 
implicit def int2String(n:Int):String = { n.toString }
//执行过程：
//1.调用隐式转换函数 int2String  如果有就调用
//2.再来调用方法，addTwoString
//  <%  