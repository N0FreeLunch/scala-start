# scala-start
- 참고 서적 : \[Book\] 프로그래밍 스칼라 (Programming Scala, ISBN: 9788968489457)

## JVM 설치하기

### 맥북에서 설치하기
- 현재 설치된 JVM 버전 확인하기
```
java -version
```

### 리눅스에서 설치하기
```
sudo apt-get update
sudo apt-get install default-jdk
java --version
```
> openjdk 11.0.9.1 2020-11-04

## install sdkman (for command line cording)
ref. https://sdkman.io/install
```
  sudo apt-get install zip
  sudo apt-get install unzip
  curl -s "https://get.sdkman.io" | bash
  source "$HOME/.sdkman/bin/sdkman-init.sh"
  sdk version
```

## install
ref. https://www.scala-sbt.org/1.x/docs/Installing-sbt-on-Linux.html
```
  sdk list java
```
> Use the Identifier for installation:
> $ sdk install java 11.0.3.hs-adpt

```
  sdk install java 11.0.3.hs-adpt
  sdk install sbt
```

## run sbt
```
  sbt
```

## run scala console in sbt cli
```
  console
```
> scala> writting your scala code

[SCALA PRACTICE with sbt cli](./study)

### exit scala console
```
  :quit
```

## install scala compiler on ubuntu 20.04
```
  sudo apt-get install scala
  sudo apt-get remove scala-library scala
  sudo wget https://downloads.lightbend.com/scala/2.12.3/scala-2.12.3.deb
  sudo dpkg -i scala-2.12.3.deb
  scala -version
```

## build test
make scala code file
```
  scala src/main/scala/progscala2/introscala/upper1.sc
```

## run scala console with $scala
```
  $scala
```
[SCALA PRACTICE with $scala](./01-dollor_scala_cli.md)
