package example

import com.typesafe.scalalogging

object Hello {
  def greet(number: Int): String = {
    println("test change")
    if ( number < 18) "No beer" else "Beer for you"
  }
  def unCoveredMethod(number: Int): String = {
    (new LogMonitoringServiceStrategy).logErrorRecord("b")
    "Did Not Cover"
  }

}

class LogMonitoringServiceStrategy extends scalalogging.LazyLogging {
  def logErrorRecord(message: String): Unit = {
    logger.error(message)
  }
}
