/*
协变和
如果一个泛型类，接收的参数的值可以是本身的类型，
或者是子类的类型，这种功能就叫做协变
在泛型参数前加上+号
*/
class Animal{
}

class Bird extends Animal{

}
// 子类，麻雀
class Sparrow extends Bird{

}
//类：吃东西
class EatSomething[+T](t:T){}

object DemoClass1{
	def main(args:Array[String]) = {
		//创建 鸟吃东西的对象
		var c1:EatSomething[Bird] = new EatSomething[Bird](new Bird)
		//创建 一个动物吃东西的对象
		//var c2:EatSomething[Animal] = new EatSomething[Animal](new Animal)
		//问题能否将c1赋值给c2
		//把EatSomething[Bird] 变成 EatSomething[Animal]的子类
		var c2:EatSomething[Animal] = c1
		println("haha")
	}
}