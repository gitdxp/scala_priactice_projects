//隐式转换函数 
class Fruit(name:String){
	def getFruitName():String ={name}
}

//猴子：Monkey
class Monkey(f:Fruit){
	def say() = { println("Monkey like " + f.getFruitName)  }
}

object ImplicitDemo{
	//定义一个隐式转换函数
	implicit def fruit2Monkey(f:Fruit):Monkey = {new Monkey(f)}

	def main(args:Array[String]) = {
		//创建水果对象变量
		var f:Fruit = new Fruit("香蕉")
		//希望:直接调用f.say()方法， 问题，f是水果对象，say方法是Monkey
		//方法，能否将Fruit对象转换成Monkey对象
		//定义一个隐式转换函数 
		f.say()
		//可读性降低了

/*
		var M:Monkey = new Monkey(f)
		M.say()
*/



	}
}
