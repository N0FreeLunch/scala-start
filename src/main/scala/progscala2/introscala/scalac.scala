/**
 * path: Repository root
 * scalac src/main/scala/progscala2/introscala/scalac.scala
 *
 * path: src/main
 * scalac scala/progscala2/introscala/scalac.scala
 */
package progscala2.introscala

object Upper {
  def main(args: Array[String]) = {
    args.map(_.toUpperCase()).foreach(printf("%s ", _))
    println("")
  }
}
