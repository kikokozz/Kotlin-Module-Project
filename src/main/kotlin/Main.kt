val archives: MutableList<Archives> = mutableListOf(Archives(name = "Создать новый архив", mutableListOf()))
fun main() {

    println("Желаете сделать заметку?")
    start()
    println("Работа завершена")
}

fun start() {
    while (true) {
        println("Список архивов: \n")
        val listOfArchives: MutableList<Int> = Screen(archives).showScreen()
        when (val getAnswer = ScannerInput().inputAnswer()) {
            0 -> createArchive()
            listOfArchives.lastIndex + 1 -> break
            in listOfArchives -> openNotes(archives[getAnswer], getAnswer)
            else -> println("Вы выбрали несуществующий элемент")

        }
    }

}

fun createArchive() {
    val archiveName: String = ScannerInput().errorOrNot(
            Message(
                    "Введите название архива: ",
                    "Название архива должно содержать хотя бы один символ"
            )
    )
    archives.add(Archives(archiveName, mutableListOf(Notes("Создать заметку", ""))))
}


fun openNotes(archive: Archives, archiveNumber: Int) {
    while (true) {
        val listOfNotes: MutableList<Int> = Screen(archive.notes).showScreen()
        when (val getAnswer = ScannerInput().inputAnswer()) {
            0 -> createNote(archiveNumber)
            listOfNotes.lastIndex + 1 -> break
            in listOfNotes -> showNote(archive.notes, getAnswer)
            else -> println("Вы выбрали несуществующий элемент")
        }
    }

}

fun createNote(index: Int) {
    val creatingNote: Pair<String, String> = Pair(
            ScannerInput().errorOrNot(Message("Назовите свою заметку", "Название заметки должно содержать хотя бы один символ")),
            ScannerInput().errorOrNot(Message("Создайте заметку\n", "Заметка не может быть пустой"))
    )
    archives[index].notes.add(Notes(creatingNote.first, creatingNote.second))

}

fun showNote(note: List<Notes>, answer: Int) {
    println("Ваша заметка \"${note[answer].name}\": ")
    println(note[answer].note + "\n")

}
