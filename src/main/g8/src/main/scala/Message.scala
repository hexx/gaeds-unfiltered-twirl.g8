package $org_id$

import java.util.Date
import com.github.hexx.gaeds.{ Mapper, Property }
import com.github.hexx.gaeds.Property._

class Message(
    val name: Property[String],
    val message: Property[String],
    val date: Property[Date])
  extends Mapper[Message] {
  def this() = this(mock, mock, mock)
  def this(name: String, message: String) = this(name, message, new Date)
}

object Message extends Message
