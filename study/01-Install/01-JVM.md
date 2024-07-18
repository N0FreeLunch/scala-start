## JVM이란?

- 자바를 컴파일 했을 때 만들어지는 바이트 코드를 컴퓨터가 실행할 수 있는 프로그램이다.
- 자바, 스칼라, 클로저 등을 JVM 계열 언어라고 부르는데, 이들은 컴파일러를 통해 JVM이 실행할 수 있는 바이트 코드의 파일을 생성하기 때문이다.

### 맥북에 JVM 설치하기

#### 기존의 JVM이 존재하는지 확인하기
- 먼저 JVM을 설치하기 전에 이미 설치된 JVM이 존재하는지 확인해야 한다.
```
java -version
```
> Java(TM) SE Runtime Environment (build 17.0.8+9-LTS-211)
> Java HotSpot(TM) 64-Bit Server VM (build 17.0.8+9-LTS-211, mixed mode, sharing)
- 위의 메시지를 보면 Runtime Environment라고 표현 되어 있다. 
- JVM은 여러 회사에서 만드는데, 그 중 하나가 HotSpot JVM이다. 위의 정보를 통해서 HotSpot JVM의 버전을 알 수 있다.

#### 현재 설치된 모든 JDK 버전 확인하기
```
/usr/libexec/java_home -V
```
> 21.0.2 (arm64) "Oracle Corporation" - "OpenJDK 21.0.2" .../Library/Java/JavaVirtualMachines/openjdk-21.0.2/Contents/Home
> 17.0.8 (arm64) "Oracle Corporation" - "Java SE 17.0.8" /Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home
