//lazy 的复杂例子，读文件，一个存在，一个不存在
val words = scala.io.Source.fromFile("D:\\dxp\\projects\\scala_projects\\TZ_learning\\src\\main\\scala\\lazytest.txt").mkString
println(words)

lazy val words1 = scala.io.Source.fromFile("D:\\dxp\\projects\\scala_projects\\TZ_learning\\src\\main\\scala\\lazytest.txt").mkString
println(words1)

//不存在文件
lazy val w2 = scala.io.Source.fromFile("d:\\aaa.txt").mkString

//和后面的spark的算子有关系，lazy值