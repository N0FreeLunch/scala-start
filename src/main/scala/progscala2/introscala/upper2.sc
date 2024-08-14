/**
 * scala -nc src/main/scala/progscala2/introscala/upper2.sc arg1 arg2 arg3
 */
object Upper {
  def main(args: Array[String]) = {
    args.map(_.toUpperCase()).foreach(printf("%s ", _))
    println("")
  }
}
