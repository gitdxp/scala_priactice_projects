//s <: T   //s必须是t的子类
//u >: T   // u 必须是T的父类
class Vehicle{
	def drive() = { println("Driving") }
}

//定义两个子类
class Car extends Vehicle{
	override def drive() = {  println("Car driving") }
}

class Bike extends Vehicle{
	override def drive() = { println("Bike driving") }
}
class Apple{

}

object ScalaUpperBound{
	def takeVehicle[T<: Vehicle](v:T) = {
		v.drive()
	}
	def main(args:Array[String]) = {
		var v1:Vehicle = new Vehicle
		var v2:Car = new Car
		var a1:Apple = new Apple
		takeVehicle(v1)
		takeVehicle(v2)
		//takeVehicle(a1)  // error
	}
}