package app

import model.userprofile._

object app_userProfile {

    def main(args: Array[String]) {
   
    val manni = new User("Manfred")
    println(manni)

    val biggie = new User("Notorious", "BIG")
    println(biggie)
    biggie.addFriend(manni)
    biggie.addFriend(manni)

    biggie.printFriendList()
  }
  
}


   

