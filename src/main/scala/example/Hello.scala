package example

object Hello {
  def greet(number: Int): String = {
    println("test")
    if ( number < 18) "No beer" else "Beer for you"
  }
}
