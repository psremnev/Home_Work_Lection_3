package files

interface FileSystemNode {
    val name: String?
    val path: String?
    var parent: FileSystemNode?
}