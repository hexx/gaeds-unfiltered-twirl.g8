package $org_id$

import unfiltered.request._
import unfiltered.response._
import com.github.hexx.gaeds.Datastore

class App extends unfiltered.filter.Plan {
  val messageLimit = 100

  def intent = {
    case GET(Path("/")) => view
    case POST(Path("/") & Params(params)) => {
      val m = new Message(params("name")(0), params("message")(0))
      if (Message.query.count >= messageLimit) {
        Datastore.delete(Message.query.sort(_.date asc).asSingleKey)
      }
      m.put()
      view
    }
  }

  def view = Ok ~> Twirl(html.index())
}
