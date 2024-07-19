## 자바 설치하기
- 현 시점에서 스칼라3이 나왔지만, 책의 예제를 보고 배우는 것을 중점으로 하므로 2.11 버전을 사용한다.
- [호환성 확인 표](https://docs.scala-lang.org/overviews/jdk-compatibility/overview.html)를 보면 JDK 11 버전과 스칼라 2.11이 호환성이 있음을 알 수 있다.

<table>
  <thead>
    <tr>
      <th style="text-align: center">JDK</th>
      <th style="text-align: center">3</th>
      <th style="text-align: center">2.13</th>
      <th style="text-align: center">2.12</th>
      <th style="text-align: center">2.11</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td style="text-align: center">23 (ea)</td>
      <td style="text-align: center">3.3.5*</td>
      <td style="text-align: center">2.13.15*</td>
      <td style="text-align: center">2.12.20*</td>
      <td style="text-align: center">&nbsp;</td>
    </tr>
    <tr>
      <td style="text-align: center">22</td>
      <td style="text-align: center">3.3.4*</td>
      <td style="text-align: center">2.13.13</td>
      <td style="text-align: center">2.12.19</td>
      <td style="text-align: center">&nbsp;</td>
    </tr>
    <tr>
      <td style="text-align: center">21 (LTS)</td>
      <td style="text-align: center">3.3.1</td>
      <td style="text-align: center">2.13.11</td>
      <td style="text-align: center">2.12.18</td>
      <td style="text-align: center">&nbsp;</td>
    </tr>
    <tr>
      <td style="text-align: center">17 (LTS)</td>
      <td style="text-align: center">3.0.0</td>
      <td style="text-align: center">2.13.6</td>
      <td style="text-align: center">2.12.15</td>
      <td style="text-align: center">&nbsp;</td>
    </tr>
    <tr>
      <td style="text-align: center">11 (LTS)</td>
      <td style="text-align: center">3.0.0</td>
      <td style="text-align: center">2.13.0</td>
      <td style="text-align: center">2.12.4</td>
      <td style="text-align: center">2.11.12</td>
    </tr>
    <tr>
      <td style="text-align: center">8 (LTS)</td>
      <td style="text-align: center">3.0.0</td>
      <td style="text-align: center">2.13.0</td>
      <td style="text-align: center">2.12.0</td>
      <td style="text-align: center">2.11.0</td>
    </tr>
  </tbody>
</table>

### JDK 11 설치
설치할 수 있는 자바 버전 확인
```
sdk list java
```
- 여러 벤더들의 jdk 버전이 나온다. 인텔리제이 IDE에서 사용할 것이므로 `JetBrains | 11.0.14.1 | jbr | | 11.0.14.1-jbr`를 선택한다.
```
sdk install java 11.0.14.1-jbr
```

#### 설치된 버전 확인하기
```
java --version
```
> openjdk 11.0.14.1 2022-02-08
> OpenJDK Runtime Environment JBR-11.0.14.1.1-2043.11-jcef (build 11.0.14.1+1-b2043.11)
> OpenJDK 64-Bit Server VM JBR-11.0.14.1.1-2043.11-jcef (build 11.0.14.1+1-b2043.11, mixed mode)
- 위와 같이 11 버전이 default가 된 것을 확인할 수 있다. 
