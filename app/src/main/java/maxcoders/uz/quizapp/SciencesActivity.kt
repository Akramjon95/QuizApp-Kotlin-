package maxcoders.uz.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_sciences.*
import maxcoders.uz.quizapp.adapter.ScienceAdapter
import maxcoders.uz.quizapp.adapter.SciencesAdapterCallBack
import maxcoders.uz.quizapp.model.QuizModel
import maxcoders.uz.quizapp.model.ScienceModel

class SciencesActivity : AppCompatActivity() {

    val sciences = listOf(
        ScienceModel("Matematika", listOf(
            QuizModel("2 ning kvadrati nechchi?", R.drawable.ic_lightbulb, "2","4","8","16", "B"),
            QuizModel("3 ning kvadrati nechchi?", null, "2","4","8","9", "D"),
            QuizModel("4 ning kvadrati nechchi?", R.drawable.ic_lightbulb, "2","4","16","8", "C"),
            QuizModel("5 ning kvadrati nechchi?", null, "25","4","8","16", "A"),
        )),
        ScienceModel("Fizika", listOf(
            QuizModel("Kosmik kemada vaznsizlik holatida qaysi soatdan foydalanish kerak ?",
                        null,"qum soat", "prujinali soat", "mayatnikli soat","termometr", "C"),
            QuizModel("uzun yo’l bo’ylab 10 ta ustun o’rnatilgan, har bir ustundan keyingisigacha 1 km masofa. Sportchi birinchi ustundan o’ninchigacha yetib bordi va yana birinchi ustuga qaytib keldi. Sportchi qancha masofa yo’l bosdi ?",
            R.drawable.ic_lightbulb, "20", "30","40", "10", "A"),
            QuizModel("Magnit maydon kuch chiziqlarining yo'nalishi qanday aniqlanadi?",
                        null, "Chap qo'l qoidasi", "O'ng qo'l qoidasi", "E=ms", "Magnit orqali", "B"),
            QuizModel("Edisonning 1000 ta urinishdan keyin kashf qilgan kashfiyoti?", R.drawable.ic_lightbulb, "Termometr", "ruchka", "Lampa chiroq", "bunday kashfiyoti yo'q", "C")
        )),
        ScienceModel("Ona tili", listOf(
            QuizModel("2 ning kvadrati nechchi?", R.drawable.ic_lightbulb, "2","4","8","16", "B"),
            QuizModel("3 ning kvadrati nechchi?", null, "2","4","8","9", "D"),
            QuizModel("4 ning kvadrati nechchi?", R.drawable.ic_lightbulb, "2","4","16","8", "C"),
            QuizModel("5 ning kvadrati nechchi?", null, "25","4","8","16", "A"),
        )),
        ScienceModel("Ingliz tili", listOf(
            QuizModel("What …. telephone number of emergency service?", null,"is","are","am","were","A"),
            QuizModel("……… do you talk to  on  the telefon", null,"Who","Where","Why","Whose","A"),
            QuizModel("Hello. Nobody is in the  office. You can leave a ……", R.drawable.ic_lightbulb,"Call","Fax","Letter","Message","D"),
            QuizModel("translation. cash ", R.drawable.ic_lightbulb,"Naqd pul","Yoqmoq","qabul qilmoq","xato qilmoq","A"),

        ))
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sciences)

        imgBack.setOnClickListener {
            finish()
        }

        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = ScienceAdapter(sciences, object :SciencesAdapterCallBack{
            override fun onClick(item: ScienceModel) {
                val intent = Intent(this@SciencesActivity, QuizActivity::class.java)
                intent.putExtra("extra", item)
                startActivity(intent)
            }
        })
    }
}