# scala-start

## install jvm
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

### exit scala console
```
  :quit
```

## install scala compiler
```
  sudo apt-get install scala
```

## 
```
  scala -version
```
