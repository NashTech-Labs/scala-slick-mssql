import models.{UserProfile, UserProfileRepository}

import scala.concurrent.Await
import scala.concurrent.duration.Duration

object Start extends App {

  val usersRepository = new UserProfileRepository

  println("Inserting new user: Test Example")
  val eventualInsertResult = usersRepository.insert(UserProfile(1, "Test", "Example"))
  val insertResult = Await.result(eventualInsertResult, Duration.Inf)
  println(s"Insert result: $insertResult\n")

  println("Reading user by ID: 1")
  val eventualMaybeUserProfile = usersRepository.get(1)
  val maybeUserProfile = Await.result(eventualMaybeUserProfile, Duration.Inf)
  println(s"User profile by ID 1: $maybeUserProfile\n")

  println("Updating user by ID: 1")
  val eventualUpdateResult = usersRepository.update(1, "Test1")
  val updateResult = Await.result(eventualUpdateResult, Duration.Inf)
  println(s"Update result: $updateResult\n")

  println("Deleting user by ID: 1")
  val eventualDeleteResult = usersRepository.delete(1)
  val deleteResult = Await.result(eventualDeleteResult, Duration.Inf)
  println(s"Delete result: $deleteResult")

}
