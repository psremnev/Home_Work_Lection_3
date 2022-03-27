package files

class Folder(
             override val name: String?,
             override val path: String?,
             vararg nodes: AbstractFileSystemNode
) : AbstractFileSystemNode() {
    private val childs: Array<AbstractFileSystemNode>

    init {
        childs = nodes as Array<AbstractFileSystemNode>
        fillParent(childs)
    }

    /** Заполнить родителя и путь для дочерних элементов  */
    private fun fillParent(childs: Array<AbstractFileSystemNode>) {
        for (child in childs) {
            child.parent = this
        }
    }

    /** Получить все файлы в папке  */
    val files: ArrayList<File>
        get() {
            val files = ArrayList<File>()
            for (node in childs) {
                if (node is File) {
                    files.add(node)
                } else {
                    files.addAll((node as Folder).files)
                }
            }
            return files
        }
}