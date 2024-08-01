## 위치 지정자 (place holder)
```scala
object Upper {
  def upper(string: String*) = string.map(_.toUpperCase())
}

println(Upper.upper("Hello", "World!"))
```
- `_.toUpperCase()` 코드의 _ 부분이 위치 지정자에 해당한다.
- `string.map(_.toUpperCase())` 부분에서 map()의 괄호 안에 들어가야 하는 코드는 순수 함수가 와야 하며, 스칼라에서 이는 람다 함수를 사용할 수 있다. 이 때 람다 함수 표기법의 `s => s.toUpperCase()` 대신에 파라메터 및 람다 함수의 선언부 표현인 `s =>`를 생략하고 전달되는 인자를 플레이스 홀더(_)으로 표기하는 방법을 사용할 수 있다.
