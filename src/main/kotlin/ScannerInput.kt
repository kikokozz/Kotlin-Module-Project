import java.lang.Exception
import java.util.Scanner

class ScannerInput {
    fun inputAnswer(): Int {
        while (true) {
            try {
                println("Введите число")
                return readln().toInt()
            } catch (e: Exception) {
                println("Пожалуйста, введите число")
            }
        }


    }

    fun errorOrNot(message: Message): String {
        while (true) {
            println(message.create)
            val data = readln().trim()
            if (data.isNotEmpty()) {
                return data
            }
            println(message.showError)
        }
    }

}