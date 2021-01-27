
## val : immutable
```
  val book = "Programming Scala"
```

## println
```
  println(book)
```

## load scala script file
compile :\*\.scala
interpreter(script) : \*\.sc
```
  :load src/main/scala/progscala2/introscala/upper1.sc
```

## compile scala script file to JVM
using $scalac
```
  scalac -Xscript Upper1 src/main/scala/progscala2/introscala/upper1.sc
  scala Upper1
```
#### file made in root directory
> Upper1.class
> Upper1$.class
> Upper1$$anon$1.class
> Upper1$$anon$1$Upper.class

## reverse engineering

```
  javap -cp . Upper1
```

```
  scalap -cp . Upper1
```
