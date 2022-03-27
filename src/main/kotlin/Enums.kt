enum class Suit(val value: String) {
    DIAMONDS("diamonds"),
    CLUBS("clubs"),
    HEARTS("hearts"),
    SPADES("spades"),
    JOKER("joker");

    companion object {
        fun getSuitList(): List<String> {
            return values().map { it.value }
        }
    }

}

enum class Rank(val value: Int) {
    CLUBS(10),
    DIAMONDS(30),
    SPADES(50),
    HEARTS(70),
    JOKER(80);
}

enum class Advantage(val value: Int, val str: String) {
    ONE(1, "one"),
    TWO(2, "two"),
    THREE(3, "three"),
    FOUR(4, "four"),
    FIVE(5, "five"),
    SIX(6, "six"),
    SEVEN(7, "seven"),
    EIGHT(8, "eight"),
    NINE(9, "nine"),
    TEN(10, "ten"),
    JACK(11, "jack"),
    QUEEN(12, "queen"),
    KING(13, "king"),
    ACE(14, "ace"),
    JOKER(14, "joker");

    companion object {
        fun getAdvantageList(): List<String> {
            return values().map { it.str }
        }
    }
}