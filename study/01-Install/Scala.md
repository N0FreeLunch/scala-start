## sdkman으로 스칼라 설치하기

### 설치할 수 있는 스칼라 버전 확인하기
```
sdk list scala
```

### 원하는 스칼라 버전 설치하기
```
sdk install scala 2.11.12
```

### 스칼라 버전 선택하기
```
sdk use scala 2.11.12
```

### 스칼라 컴파일러 설치 확인
```sh
scalac -version
```
> Scala code runner version 2.11.12 -- Copyright 2002-2017, LAMP/EPFL

-------

## brew로 스칼라 설치하기
- sdkman으로 스칼라가 설치되었다면 sdkman이 우선적으로 적용될어 있을 것이다.
- 다음은 sdkman을 사용하지 않을 경우 brew를 사용해서 스칼라를 설치하는 방법이다.
```sh
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```

### 쉘에 명령어 등록하기
```sh
echo 'eval $(/opt/homebrew/bin/brew shellenv)' >> /Users/$USER/.zshrc
```

### 터미널의 쉘 초기화하기
```sh
source ~/.zshrc
```

### cs setup으로 스칼라 설치하기
- https://www.scala-lang.org/download/
```sh
brew install coursier/formulas/coursier && cs setup
```
- 만약 'Your Command Line Tools are too outdated' 라는 메시지가 나오면서, 명령어를 사용할 수 없는 경우 [애플 개발자 사이트](https://developer.apple.com/download/all/)에 로그인을 한 후, (Beta가 아닌) [Command Line Tools for Xcode](https://developer.apple.com/download/all/?q=command%20line%20tool)를 다운로드 한다. 
- 다운받은 파일을 설치하기 전에 기존의 Command Line Tools을 삭제한다.
```sh
sudo rm -rf /Library/Developer/CommandLineTools
```
- 다운 받은 Command Line Tools for Xcode를 실행한다. 다시
```sh
brew install coursier/formulas/coursier && cs setup
```

### 스칼라 설치하기
- https://docs.scala-lang.org/getting-started/index.html
```sh
cs install scala:2.11.12 scalac:2.11.12
```

> Warning: /Users/$USER/Library/Application Support/Coursier/bin is not in your PATH
> To fix that, add the following line to ~/.zshrc
- 위와 같은 메시지가 나오면 다음 명령어에 현재 맥 OS에서 로그인한 유저명으로 '유저명' 부분을 바꾼 명령어를 입력한다.
```
echo 'export PATH="$PATH:/Users/유저명/Library/Application Support/Coursier/bin"' >> ~/.zshrc
```
```
source ~/.zshrc
```
