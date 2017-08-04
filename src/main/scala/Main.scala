import cats.effect._
import cats.implicits._
import fs2._

import org.http4s._, org.http4s.implicits._, org.http4s.dsl._


object Main extends App {
  /*
  implicit val ec = scala.concurrent.ExecutionContext.Implicits.global

  val xa = DriverManagerTransactor[IO](
    "com.mysql.jdbc.Driver", "jdbc:mysql://localhost/sde?user=sde&password=sde" //, "sde", "sde"
  )
  val name = "Tritanium"
  val tritanium = sql"select typeId from invTypes where typeName=$name;".query[Long].unique
  val r = tritanium.transact(xa).unsafeRunSync
  */

  def service = HttpService[IO] {
    case req @ GET -> root / typeName =>
      Ok("hello")
  }

}
