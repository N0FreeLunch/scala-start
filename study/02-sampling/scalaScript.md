## 스칼라 스크립트

### 자바의 시작점
```java
public static StartPoint {
    public static void main(String[] args) {
        
    }
}
```
- 자바 애플리케이션의 모든 코드는 main 함수로 부터 시작이 된다. 위의 예제를 보면, 클래스를 만들고, 그 안에 main 메소드를 두어야 코드가 시작된다. 절차 지향의 코드는 메소드로 실행하는 자바의 철학이 반영된 것으로 모든 코드가 클래스로 이뤄진 자바에서 코드가 실행되기 위해서는 메소드가 실행되어야 하고 첫 번째로 시작되는 메소드가 main 메소드가 된다.

### 스칼라 스크립트와 JVM
- 자바는 극단적인 객체지향 언어이다. 모든 코드는 클래스를 기반으로 실행이 된다. 자바를 실행하는 JVM도 이러한 철학 위에 만들어져 클래스의 기반을 두지 않은 절차지향 코드는 바로 실행을 할 수 없으며, 객체에 기반하지 않은 코드는 실행되지 않는다. 클래스에 기반하지 않은 코드를 단독으로 실행하려면, 클래스를 기반으로 하는 코드로 변환해야 JVM에서 실행할 수 있다.
- 스칼라 스크립트는 클래스나 객체에 기반한 코드가 아니다. 따라서 스칼라 컴파일러는 스칼라 스크립트를 JVM에서 실행할 수 있도록 내부적인 변환을 수행한다.
- 스칼라 스크립트를 클래스 기반의 코드로 변환할 수도 있는데, `scalac` 명령어에 `-Xscript` 옵션을 붙여주면 스칼라 스크립트의 파일을 `.class` 파일로 변환해 준다.

### 스칼라 스크립트를 클래스 파일로 변환해 보기
```scala
class Upper {
  def upper(strings: String*): Seq[String] = {
    strings.map((s: String) => s.toUpperCase())
  }
}

val up = new Upper
println(up.upper("Hello", "World!"))
```

```
scalac -Xscript Upper1 src/main/scala/progscala2/introscala/upper1.sc
```

- Upper1라는 파일이 프로젝트 root에 생기고, 다음과 같은 코드로 변환된 것을 확인할 수 있다.
```scala
object Upper1 {
  def main(args: _root_.scala.Array[_root_.scala.Predef.String]): _root_.scala.Unit = ???
}
```