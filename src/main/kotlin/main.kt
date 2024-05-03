fun main() {
    val taxRate = 0.75
    val minTax = 35

    val amount = 1_000
    val preTax = amount * taxRate / 100
    val tax = (if (preTax < minTax) minTax else preTax).toInt()
    println("tax = $tax")
}