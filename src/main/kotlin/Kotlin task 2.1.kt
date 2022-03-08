
fun main() {
    var percentCommission = 0.0075
    var amount = 135_000_00


    if(amount < 35_00) {
        println("Сумма перевода должна составлять минимум 35руб.")
    } else {
        var commissionAmount: Double = amount * percentCommission
        println("Коммисия в копейках: $commissionAmount")
    }
}