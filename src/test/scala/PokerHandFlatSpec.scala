import org.scalatest.flatspec.AnyFlatSpec

class PokerHandFlatSpec extends AnyFlatSpec {
    "Poker hand" should "pick the highest card 7" in {
      assert(PokerHand.evaluate("5H 4C 6S 7S 2D") == "high card : 7")
    }
}