package example

object Hello extends Greeting {
  def greet(number: Int): String = {
    if ( number < 18) "No beer" else "Beer for you"
  }
}

trait Greeting {
  lazy val greeting: String = "hello"
}
