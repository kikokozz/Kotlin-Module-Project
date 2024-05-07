class Screen<T>(private val dataType: List<T>) where T : DataType {

    fun showScreen(): MutableList<Int> {
        val output: MutableList<Int> = mutableListOf()
        dataType.forEachIndexed { index, element ->
            println("$index. ${element.name}")
            output.add(index)
        }
        println("${dataType.lastIndex + 1}. Выход\n")
        return output
    }


}