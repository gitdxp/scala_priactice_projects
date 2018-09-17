import scala.collection.mutable.ArrayBuffer

//scala 数组
//1.定长数组
val a = new Array[Int](10)
val b = new Array[String](3)
var c = Array("Tom","Marry","Mike")

//2.变长数组 ArrayBuffer
val d = new ArrayBuffer[Int]()
// add elements
d+=3
d+=56
d+=23
d+=(3,345,76,4)
d.trimEnd(2)  //去掉尾部两个元素
//ArrayBuffer  -> Array
d.toArray
d.foreach(println)
d.map(println)

val myArray = Array(2,3,4,4,5,6,3)
myArray.max
myArray.min
myArray.sum
myArray.sortWith(_ > _)
//降序排列




