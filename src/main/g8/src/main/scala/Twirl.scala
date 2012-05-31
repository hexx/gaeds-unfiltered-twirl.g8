package $org_id$

import unfiltered.response._

case class Twirl(html: twirl.api.Html) extends ComposeResponse(HtmlContent ~> ResponseString(html.body))
