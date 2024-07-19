## brew 설치
```
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```

### cs setup으로 스칼라 설치하기
- https://www.scala-lang.org/download/
```
brew install coursier/formulas/coursier && cs setup
```

### 스칼라 컴파일러 설치 확인
```
scalac -version
```
> Scala compiler version 2.11.2 -- Copyright 2002-2013, LAMP/EPFL