## 네임스페이스를 사용한 실행

### 파일 경로를 사용한 실행
```
scala -nc src/main/scala/progscala2/introscala/upper2.sc arg1 arg2 arg3
```

### 네임 스페이스를 이용한 실행
```
scala -cp src/main progscala2.introscala.Upper arg1 arg2 arg3
```
- 옵션은 `-cp`이다. 명령어의 첫 번째 값으로 네임스페이스가 동작하는 최상위 파일의 경로를 지정한다. 여기서는 `src/main`이다.
- 명령어의 두 번째 값으로 `progscala2.introscala.Upper`으로 클래스명을 포함한 네임스페이스 경로를 적는다.
- 마지막으로 전달할 옵션을 적어준다. 여기서는 `arg1 arg2 arg3`이다.
