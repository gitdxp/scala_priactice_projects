//循环
var list = List("w22","we","w23")

//1.
println("*****first*******")
for(s<- list) println(s)
//2
//打印长度大于2 的
for{
  s<-list
  if(s.length > 2)
}
  println(s)
//3
for(s<-list if s.length < 3) println(s)
//在for循环中，还可以使用关键字，yield来产生一个新
//的集合
val newlist  = for{
  s<- list
  s1 = s.toUpperCase
}yield(s1)
