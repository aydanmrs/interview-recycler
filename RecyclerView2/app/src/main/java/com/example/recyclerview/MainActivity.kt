package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    private lateinit var questionList :ArrayList<Question>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        questionList= ArrayList<Question>()

        val kotlin=Question("Kotlin nədir və Java-dan nə ilə fərqlənir?", "Kotlin-də dəyişəni necə elan edirsiniz?","Kotlin-də data class nədir?",R.drawable.kotlin, "Kotlin")
        val java=Question("Java-da istisna necə atılır və tutulur?","Java Collections Framework nədir?","Java-da çoxdilli proqramlaşdırma necə həyata keçirilir?",R.drawable.java, "Java")
        val python=Question("Python nədir və hansı xüsusiyyətləri var?", "Python-da dəyişəni necə elan edirsiniz?","Pythonda əsas məlumat tipləri hansılardır?",R.drawable.python, "Python")
        val c=Question("C++ da yaddaşın dinamik ayrılması necə həyata keçirilir?","C++ da class və object nədir?","C++ da stack və heap yaddaşı arasında fərq nədir?", R.drawable.c, "C++")
        val matlab=Question("MATLAB-də funksiyalar necə yazılır?","MATLAB-də skriptlər ilə funksiyalar arasındakı fərq nədir?","MATLAB-də bir matrisin transpozunu necə tapmaq olar?",R.drawable.matlab, "MATLAB")
        val switch=Question("Switch dilində verilənləri oxuma və yazma əməliyyatları necə həyata keçirilir?","Switch dilində data strukturları (linked list, stack, queue və s.) necə tətbiq olunur?", "Switch dilində skriptlər ilə funksiyalar arasındakı fərq nədir?",R.drawable.svitch, "Switch")
        val scala=Question("Scala dilində immutable kolleksiyaların üstünlükləri nələrdir?", "Scala dilində pattern matching nədir və necə istifadə olunur?", "Scala-da obyekt və siniflər necə işləyir?", R.drawable.scala, "Scala")
        val html=Question("HTML-də hansı elementlər var və onların məqsədləri nədir?","Giriş elementləri (input types) hansılardır və nə üçün istifadə olunur?","HTML-də cədvəllər necə yaradılır və strukturlaşdırılır?", R.drawable.html, "HTML")
        val php=Question("PHP-də verilənlər bazasına necə qoşulmaq olar?", "PHP-də form məlumatları necə işlənir?", "PHP-də obyekt-yönümlü proqramlaşdırma necə işləyir?", R.drawable.php, "PHP")


        questionList.add(kotlin)
        questionList.add(java)
        questionList.add(python)
        questionList.add(c)
        questionList.add(matlab)
        questionList.add(switch)
        questionList.add(scala)
        questionList.add(html)
        questionList.add(php)



        binding.recyclerview.layoutManager= LinearLayoutManager(this)
        val questionAdapter=QuestionAdapter(questionList)
        binding.recyclerview.adapter=questionAdapter

    }
}









