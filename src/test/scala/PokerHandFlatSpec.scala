import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class PokerHandFlatSpec extends AnyFlatSpec with Matchers {
    "Poker hand" should "pick the highest card 7" in {
      PokerHand.evaluate("5H 4C 6S 7S 2D") == "high card : 7"
    }
}