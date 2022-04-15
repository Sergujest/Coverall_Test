package example

object Hello {
  def greet(number: Int): String = {
    println("test change")
    if ( number < 18) "No beer" else "Beer for you"
  }
  def unCoveredMethod(number: Int): String =
    "Did Not Cover"
}
