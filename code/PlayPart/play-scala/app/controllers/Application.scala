package controllers

import play.api._
import play.api.mvc._

class Application extends Controller {

  def index = Action {
    Ok(views.html.index("OurBook"))
  }
  
  def userProfile = Action {
      Ok(views.html.userProfile("Showing userprofile"))
  }
  
  def editUserProfile = Action {
      Ok(views.html.editUserProfile("Edit User Profile"))
  }

  def chatView = Action {
      Ok(views.html.chatView("Showing chatViewTest"))
  }

  def viewUsersPictures= Action {
      Ok(views.html.viewUsersPictures("Showing Users Pictures"))
  }

}
