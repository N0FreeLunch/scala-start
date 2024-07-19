## SBT

### SBT란?
- 스칼라의 표준 빌드 툴이다.

### sbt 설치
- https://www.scala-sbt.org/1.x/docs/Installing-sbt-on-Mac.html
```
brew install sbt
```
- 간단한 설치를 위해 brew로 설치하는 방법을 사용한다.

### 라이브러리 종속성 설치하기
```
sbt test
```
> [info] [launcher] getting org.scala-sbt sbt 1.4.6  (this may take some time)...
> [info] [launcher] getting Scala 2.12.12 (for sbt)...
> [info] welcome to sbt 1.4.6 (JetBrains s.r.o. Java 11.0.14.1)
- 위와 같은 정보가 뜨는 것을 확인할 수 있다.

### sbt console 사용해보기
```sh
$ sbt
```
- sbt를 실행을 하고, `lsbt:scala-start>`라는 메시지가 나오면 `console`을 입력하여 REPL에 접근할 수 있다.
```
lsbt:scala-start> console
```

#### 예제
```scala
1 + 2
```
> res0: Int = 3
- `:quit` 명령을 통해서 REPL환경에서 나갈 수 있다. 'ctl + D'로 종료할 수도 있다.


