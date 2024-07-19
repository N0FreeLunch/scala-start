## brew 설치
```
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```

### cs setup으로 스칼라 설치하기
- https://www.scala-lang.org/download/
```
brew install coursier/formulas/coursier && cs setup
```

### sdkman 설치
- https://sdkman.io/
```
curl -s "https://get.sdkman.io" | bash
```

- 설치를 하면 `~/.bash_profile` 파일에 다음과 같은 명령문이 생긴다.
```
#THIS MUST BE AT THE END OF THE FILE FOR SDKMAN TO WORK!!!
export SDKMAN_DIR="$HOME/.sdkman"
[[ -s "$HOME/.sdkman/bin/sdkman-init.sh" ]] && source "$HOME/.sdkman/bin/sdkman-init.sh"
```

- bash 쉘 뿐만 아니라 다른 쉘 예를 들어 zsh에서도 SDKMAN의 명령어를 사용하고 싶다면 `~/.zshrc` 파일에 위의 코드를 추가한다. 이미 추가되어 있다면 추가하지 않는다.
- 위의 코드가 추가 되어 있는데도 sdk 명령어가 실행되지 않는다면 `source ~/.zshrc` 명령어로 터미널의 쉘을 다시 로드한다. 
