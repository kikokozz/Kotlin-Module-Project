import javax.xml.datatype.DatatypeConstants

data class Archives (
        override val name: String,
        val notes: MutableList<Notes>
) : DataType

data class Notes (
        override val name : String,
        val note: String
) : DataType

data class Message (
        val create: String,
        val showError: String
)

