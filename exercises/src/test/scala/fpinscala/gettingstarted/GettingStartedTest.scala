package fpinscala.gettingstarted
import org.scalatest.FlatSpec

class GettingStartedTest extends FlatSpec{

  "fib" should "return fibonocci sequence of n" in {
    val out = MyModule.fib(10)
    val out2 = MyModule.fib2(10)

    assert(55 == out)
    assert(55 == out2)
  }

}
