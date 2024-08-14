## scalac
- `scalac`는 커멘드라인 명령어로 `.scala` 확장자를 가진 scala 코드 파일을 `.class`라는 확장자를 가진 자바 파일로 변환한다.

### 예제
```scala
/**
 * path: Repository root
 * scalac src/main/scala/progscala2/introscala/scalac.scala
 * 
 * path: src/main
 * scalac scala/progscala2/introscala/scalac.scala
 */
package progscala2.introscala

object Upper {
  def main(args: Array[String]) = {
    args.map(_.toUpperCase()).foreach(printf("%s ", _))
    println("")
  }
}
```
- 위의 파일을 scalac 명령으로 변환을 하면, 지정한 네임스페이스 `progscala2.introscala`에 해당하는 경로에 자바 클래스 파일이 만들어진다.
- 기준은 `scalac` 명령어를 실행한 지점을 기준으로 생성이 되며, 프로젝트 루트에서 명령어를 실행 했으므로 프로젝트 루트에 progscala2 라는 폴더가 생긴다.
- 이 폴더는 `progscala2/introscala`으로 구성이 되며, 이 경로에 '클래스명.class' 꼴의 파일이 생성되어 있다. 여기서는 파일명은 `scalac.scala`이었지만, 클래스명인 `Upper.class`라는 파일이 생성된다.
- `cd src/main`을 통해서 `src/main` 경로에서 `scalac scala/progscala2/introscala/scalac.scala` 명령어를 실행하면, `src/main/progscala2/introscala/Upper.class` 경로에 클래스 파일이 생성된다.
