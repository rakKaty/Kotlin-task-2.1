import java.lang.Integer.max

fun main() {
    val percentCommission = 0.0075
    val amount = 135_000_00


        val commissionAmount  = max ((amount * percentCommission).toInt(), 35_00)
        println("Коммисия в копейках: $commissionAmount")

}