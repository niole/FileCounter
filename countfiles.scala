import java.io._

object FileGetter extends App {
    class FileGetter(val fileTypes: Array[String] ) {
        def x(): Unit = {
          val docs = fileTypes.map( fileType => getFiles(fileType) )

          println(docs.deep.mkString(" and "))
        }

        def getFiles(fileType: String): Int = {
            val docs = new File("./helloworld")
                          .listFiles
                          .filter(_.getName.endsWith("."+fileType)).length
            docs
        }
    }
    val x = new FileGetter(Array("scala", "js"))
    x.x()
}
