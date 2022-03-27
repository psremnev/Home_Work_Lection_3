import files.File
import files.Folder

fun main(args: Array<String>) {
    val card = Card(Suit.CLUBS.value, Advantage.KING, Rank.CLUBS.value)
    println("Card is $card" )
    // Создаем папки с файлами
    val rootFolder = Folder(
        "Корневая", "C:\\",
        File("Файл1.jpeg", "C:\\Файл1"),
        Folder(
            "Папка1", "C:\\Корневая\\Папка1",
            Folder(
                "ПапкаВПапке1", "C:\\Корневая\\Папка1\\ПапкаВПапке1",
                File("Файл2.mp3", "C:\\Корневая\\Папка1\\ПапкаВПапке1\\Файл2"),
                Folder(
                    "Папка3",
                    "C:\\Корневая\\Папка1\\ПапкаВПапке1\\Папка3",
                    File("Файл4.mp3", "C:\\Корневая\\Папка1\\ПапкаВПапке1\\Папка3\\Файл4")
                )
            )
        )
    )
    // файлы в дочерних папках
    val files = rootFolder.files
    val filesLength = files.size
    val random = Math.random() * filesLength
    val randomInt = random.toInt()
    // выводим инфу о рандомном файле
    if (filesLength > 0) {
        println("File Path: ${files[randomInt].path}")
        print("File Ext: ${files[randomInt].getExtensions()}")
    }
}