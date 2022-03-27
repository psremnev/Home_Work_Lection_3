class Card(private val suit: String, private val advantage: Advantage, private val rank: Int ) {

    init {
        val suitList = Suit.getSuitList()
        if (!suitList.contains(suit)) {
            throw Exception("Suit incorrect format: ${suitList.joinToString()}")
        }
    }

    override fun toString(): String {
        return "$suit ${advantage.str}";
    }

    override fun equals(other: Any?): Boolean {
        return suit == (other as Card).suit
    }

    /**
     * Проверяем принадлежит ли карта стандартной колоде
     * Если достоинство и масть из стандартной колоды то возвращаем true
     */
    fun isCardBelongsStandardDeck(): Boolean {
        return Suit.getSuitList().contains(suit) && Advantage.getAdvantageList().contains(advantage.str)
    }

    /**
     * Возвращает числовое значение исходя из масти и достоинства
     */
    override fun hashCode(): Int {
        return rank + advantage.value
    }

    /**
     * Проверяем является ли текущая карта сильнее другой
     */
    fun isGreaterThen(card: Card): Boolean? {
        return hashCode() > card.hashCode()
    }
}