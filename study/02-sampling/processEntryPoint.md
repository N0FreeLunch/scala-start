## 프로세스의 진입점

### 자바의 진입점
- 자바의 경우 실행하는 클래스 파일의 main 메소드를 처음 실행한다.

### 스칼라의 진입점
- 스칼라의 경우 실행하는 object 키워드로 만들어진 싱글턴 객체의 main 메소드를 처음 실행한다.

### object 문법을 통한
- 자바의 main 메소드와 비슷한 역할을 하는 것은, object 문법에서 main 메인 메소드를 사용하는 것이다. 
```scala
/**
 * scala -nc src/main/scala/progscala2/introscala/upper2.sc arg1 arg2 arg3
 */
object Upper {
  def main(args: Array[String]) = {
    args.map(_.toUpperCase()).foreach(printf("%s ", _))
    println("")
  }
}
```
- 명령줄로 실행을 할 때, `arg1 arg2 arg3`를 추가로 적어서 인자를 전달했다. 이는 main 메소드의 `args: Array[String]`으로 전달된다. 모든 대상이 문자열인 배열의 형태로 `['arg1', 'arg2', 'arg3']`과 같은 형태로 전달된다.
- `_`는 args 배열 안의 각 문자열 'arg1', 'arg2', 'arg3'를 받는다.
- `printf("%s ", _)`에 의해 `_`값이 출력되고, `println("")`에 의해 마지막은 개행이 된다.
