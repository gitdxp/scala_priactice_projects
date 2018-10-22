//模式匹配
//根据一个变量的值，判断 是做加法运算，还是做减法运算
var ch1 = '-'
var flag = 0
ch1 match{
  case '+' => flag = 1
  case '-' => flag = -1
  case _ => flag = 0
}
println(flag)

