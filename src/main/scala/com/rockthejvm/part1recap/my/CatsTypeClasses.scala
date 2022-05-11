object CatsTypeClasses {
  import cats.Functor

  val listFunctor = Functor[List]

  trait MyFunctor {
    def map[A, B](initialValue: F[A])(f: A => B): F[B]
  }

  def increment[F[_]](container: F[A])(using func: Functor[A]): F[Int] =
    func.map(container)(_ + 1)
  def main(args: Array[String]): Unit = {}

}
