import javafx.geometry.Insets
import javafx.scene.Scene
import javafx.scene.control.*
import javafx.scene.layout.HBox
import javafx.scene.layout.VBox
import javafx.stage.Stage

class Primestuffs {
    companion object {
        fun Main() {
            val root = VBox()
            val stage = Stage()
            stage.title = "Prime calculator."
            stage.scene = Scene(root)
            val rows = mutableListOf(HBox(), HBox())
            rows[0].padding = Insets(10.0, 10.0, 2.5, 10.0)
            rows[1].padding = Insets(2.5, 10.0, 10.0, 10.0)

            val input = TextField()
            input.promptText = "Enter the number of primes"
            rows[0].children.add(input)

            val out = TextArea()
            out.setPrefSize(300.0, 500.0)
            rows[1].children.add(out)

            val sep = Label()
            sep.padding = Insets(5.0)
            rows[0].children.add(sep)

            val run = Button()
            run.text = "Go!"
            run.setOnAction {
                try {
                    out.text = ""
                    println("Start.")
                    val primes = Prime().primeGen(input.text.toInt())
                    println("Prime generation done, generating string.")
                    out.text = primes.joinToString(separator = "\r\n")
                    println("Done.")
                } catch (e: Exception) {}
            }
            rows[0].children.add(run)

            root.children.addAll(rows)
            stage.show()
        }
    }
}