package files

class File(override val name: String?,
           override val path: String?
) : AbstractFileSystemNode() {
    private val extensions: String

    init {
        extensions = initExtensions()
    }

    /** Получаем расширение файла из имени  */
    private fun initExtensions(): String {
        val nameArr = name!!.split("\\.").toTypedArray()
        return nameArr[nameArr.size - 1]
    }

    /** Возвращает расширение файла  */
    fun getExtensions(): String {
        return extensions
    }
}