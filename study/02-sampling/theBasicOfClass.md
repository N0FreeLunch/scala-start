## 클래스의 기본

Upper.sc
```
class Upper {
  def upper(strings: String*): Seq[String] = {
    strings.map((s: String) => s.toUpperCase())
  }
}

val up = new Upper
println(up.upper("Hello", "World!"))
```

- strings의 타입은 `String*`으로 가변 길이의 문자열 타입을 받는다. 곧, upper 함수를 사용할 때 upper('a'), upper('a', 'b'), upper('a', 'b', 'c') 등으로 계속 인자를 받을 수 있다는 의미이다.
- 가변 길이 문자열은 함수 내부에서 시퀀스 타입의 값이 되는데, 시퀀스 객체는 map이란 메소드를 가진다. map 메소드는 `(s: String) => s.toUpperCase()`라는 문자열을 받아서 대문자의 문자열을 반환하는 람다 함수를 받아 시퀀스의 모든 원소에 대해 람다함수를 적용한 결과를 원소로 하는 새로운 시퀀스를 얻는다.
- 반환 타입은 Seq으로 원소의 타입을 String 타입으로 한다. 시퀀스는 인덱싱된 배열과 비슷한 특징을 갖는데, 자바스크립트의 예를 들면 `['a', 'b', 'c']`에서 0번 인덱스가 'a', 1번 인덱스가 'b', 2번 인덱스가 'c'라는 특성을 갖는 것과 비슷하다.
- `val`으로 선언한 `up` 변수에는 객체를 넣을 수 있으며 이 변수는 재할당이 불가능하다. up 변수에 담긴 객체의 `upper` 메소드를 통해서 2개의 문자열을 시퀀스로 받아서 그 결과를 시퀀스로 반환한다.
