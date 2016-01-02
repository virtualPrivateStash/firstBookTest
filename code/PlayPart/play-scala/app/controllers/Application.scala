package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("OurBook"))
  }
  
  def userProfileTest = Action {
      Ok(views.html.userProfileTest("Showing userprofile"))
  }

  def chatViewTest = Action {
      Ok(views.html.chatViewTest("Showing chatViewTest"))
  }

  def viewUsersPictures= Action {
      Ok(views.html.viewUsersPictures("Showing Users Pictures"))
  }

}
