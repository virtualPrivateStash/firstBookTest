package model.userprofile

import model.constants._
import javax.imageio.ImageIO
import java.io.File

class User(    val firstName: String, 
               val lastName: String)     
{
    val stringTool = new StringToolsForConsole()
    val img_profile = ImageIO.read(new File("/home/xy/Schreibtisch/ourbook/code/TheBook_firstScalaVersion/img/neparis.jpg"))
    val friends: Array[User] = new Array[User](10)
    var friendCounter = 0
    
//    als Liste geht nicht. da immutable    
//    val test = List("friend1", "friend2", "friend3")
//   
//    // Empty List.
//    val friends: List[User] = List()
//  
    def this() {
        this("","")
        //println("\nNeither firstName nor lastName given...")
    }
   
    def this(name: String) {
        this("", name)
        //println("\nNo firstName given...")
    }
    
    def addFriend(user: User) {
        if (isAlreadyFriendWith(user)) {
            return
        }
            friends(friendCounter) = user
            friendCounter += 1
    }
     
    def printFriendList() {
        var i = 0
        println(stringTool.getString_console)
        for(i <- 0 to friendCounter-1) yield {
            println("Friend Nr. %d:\nName of friend: %s %s\n".format(i, friends(i).firstName, friends(i).lastName ).toString())
        }
    }
    
    def isAlreadyFriendWith (user: User) : Boolean = {
        if (friends.contains(user)) {
            println("User %s is already in %s %s's friend-list.".format(user.firstName, this.firstName, this.lastName).toString())
            return true
        }
        println("User %s is NOT YET in %s %s's friend-list.".format(user.firstName, this.firstName, this.lastName).toString())
        return false
    }
    
    override def toString: String = {
        val theString = new StringBuilder()
        theString.append(stringTool.getString_console)
        val introString = "Showing File of A User:\n"
        theString.append(introString)
        val userString: String = "%s %s, %d".format(firstName, lastName, 19 ).toString()
        theString.append(userString)
        return theString.toString()
    }
  
}