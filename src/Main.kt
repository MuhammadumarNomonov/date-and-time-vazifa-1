import java.time.LocalDate
import java.time.temporal.ChronoUnit

fun main() {
    val tugilgankunim = LocalDate.of(2009, 9, 18) // Bu yerda tug'ilgan kuningizni kiriting
    val hozirgiKun = LocalDate.now()

    val yillarOrasidagiFarq = ChronoUnit.YEARS.between(tugilgankunim, hozirgiKun)
    val kunlarOrasidagiFarq = ChronoUnit.DAYS.between(tugilgankunim, hozirgiKun)

    println("Tug'ilgan kunim: $tugilgankunim")
    println("Hozirgi kun: $hozirgiKun")
    println("Yillar orasidagi yillar: $yillarOrasidagiFarq yil")
    println(" meni tug`ilganimdan 2024 yilgacha bolgan kunlar : $kunlarOrasidagiFarq kun")
}
