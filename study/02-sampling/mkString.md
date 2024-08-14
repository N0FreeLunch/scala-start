## mkString
### Refernces
- https://www.scala-lang.org/api/2.13.1/scala/Array.html#mkString(sep:String):String

### 설명
Array 타입의 메소드이며, 배열의 모든 문자열을 인자로 받은 구분자 문자열로 연결한 문자열을 반환한다.

### 예제
```scala
/**
 * scala -nc src/main/scala/progscala2/introscala/upper3.sc arg1 arg2 arg3
 */
object Upper {
  def main(args: Array[String]) = {
    val output = args.map(_.toUpperCase()).mkString(" ")
    println(output)
  }
}
```
- 인자로 `arg1 arg2 arg3`를 받아서 배열은 `['arg1', 'arg2', 'arg3']`의 형태가 된다. 이를 공백 스페이스로 연결한 결과는 `arg1 arg2 arg3`이고 `output`에 할당된다.
