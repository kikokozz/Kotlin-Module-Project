import java.lang.Exception
import java.util.Scanner

class ScannerInput {
    fun inputAnswer(): Int {
        while (true) {
            try {
                println("Введите число")
                return Scanner(System.`in`).nextLine().toInt()
            } catch (e: Exception) {
                println("Пожалуйста, введите число")
            }
        }


    }

    fun errorOrNot(message: Message): String {
        while (true) {
            println(message.create)
            when (val data = Scanner(System.`in`).nextLine().toString()) {
                "" -> {
                    println(message.showError)
                    continue
                }

                else -> return data
            }
        }
    }

}