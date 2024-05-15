class Screen<T: DataType>(private val dataType: List<T>) {

    fun showScreen(): MutableList<Int> {
        dataType.forEachIndexed { index, element ->
            println("$index. ${element.name}")
        }
        println("${dataType.lastIndex + 1}. Выход\n")
        return dataType.indices.toMutableList()
    }


}