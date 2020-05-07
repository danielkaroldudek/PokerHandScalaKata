import org.scalatest.GivenWhenThen
import org.scalatest.featurespec.AnyFeatureSpec

class PokerHandFeatureSpec extends AnyFeatureSpec with GivenWhenThen {
  info("As Poker Player")
  info("...")

  Feature("Poker Hand") {
    Scenario("Poker hand should pick the highest card 7") {

      Given("I have 5 cards")
      val cards = "5H 4C 6S 7S 2D"

      When("I evaluate the hand")
      val result = PokerHand.evaluate(cards)

      Then("I should have high card : 7")
      assert(result == "high card : 7")
    }
  }
}