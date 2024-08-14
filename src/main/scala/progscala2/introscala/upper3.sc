/**
 * scala -nc src/main/scala/progscala2/introscala/upper3.sc arg1 arg2 arg3
 */
object Upper {
  def main(args: Array[String]) = {
    val output = args.map(_.toUpperCase()).mkString(" ")
    println(output)
  }
}
