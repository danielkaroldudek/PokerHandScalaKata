object PokerHand {
  def evaluate(hand: String): String = {
    val figures: Map[Char, Int] = List('2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K', 'A').zipWithIndex.toMap
    case class Card(figure: Char, power: Int)

    val value: List[(Int, Int, Char)] = hand
      .split(" ")
      .map { card =>
        card.toList match {
          case List(figure, _) => Card(figure, figures(figure))
        }
      }
      .groupBy(_.figure)
      .map {
        case (figure, cards) => (cards.length, cards.head.power, figure)
      }
      .toList
      .sorted(Ordering[(Int, Int, Char)].reverse)
    val (occurrences, _, figure) = value.head
    if (occurrences == 2) {
      "pair of : " + figure
    } else {
      "high card : " + figure
    }
  }
}