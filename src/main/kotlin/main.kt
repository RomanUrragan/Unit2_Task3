fun main() {
    var isRegular: Boolean = true
    var totalAmount: Double = 1001.0
    var finalSum = calculatingFinalSum(totalAmount, isRegular)
    println("Товаров на сумму: $totalAmount р. Сумма со скидкой: $finalSum р")

}

fun calculatingFinalSum(totalAmount: Double, isRegular: Boolean): Double {
    var discount =
        if (totalAmount > 10000) totalAmount * 0.05
        else if ((totalAmount > 1000) && (totalAmount <= 10000)) 100.0
        else 0.0
    return if (isRegular) (totalAmount - discount) * 0.99 else (totalAmount - discount)
}
