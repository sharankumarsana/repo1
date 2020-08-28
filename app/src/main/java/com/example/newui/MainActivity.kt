package com.example.newui

 import android.graphics.Color.red
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
 import android.widget.GridLayout
 import android.widget.LinearLayout
 import androidx.recyclerview.widget.GridLayoutManager
 import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_layout.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val countries = ArrayList<Country>()
        countries.add(Country("Afghanistan","Kabul","AF","4","AFG","AF","93","+33.00 +65.00","+60.48 +38.48 +74.88 +29.38",R.drawable.afghanistan))
        countries.add(Country("Albania","Tirana","AL","8","ALB","AL","355","+41.00 +20.00","+19.29 +42.67 +21.07 +39.65",R.drawable.albania))
        countries.add(Country("Algeria","Algiers","DZ","12","DZA","AG","213","+28.00 +3.00","-8.67 +37.09 +11.98 +18.96",R.drawable.algeria))
        countries.add(Country("American Samoa","Pago Pago","AS","16","ASM","AQ","1 684","-14.20 -170.00","-170.84 -14.16 -169.42 -14.38",R.drawable.american_samoa))
        countries.add(Country("Australia","Canberra","AU","36","AUS","AS","61","-27.00 +133.00","+112.91 -10.06 +153.64 -43.64",R.drawable.australia))
        countries.add(Country("Bangladesh","Dhaka","BD","50","BGD","BG","880","+24.00 +90.00","+88.03 +26.63 +92.67 +20.74",R.drawable.bangladesh))
        countries.add(Country("Belgium","Brussels","BE","56","BEL","BE","32","+50.50 +4.00","+2.55 +51.51 +6.40 +49.49",R.drawable.belgium))
        countries.add(Country("Bhutan","Thimpu","BT","64","BTN","BT","975","+27.30 +90.30","+88.76 +28.32 +92.13 +26.71",R.drawable.bhutan))
        countries.add(Country("Brazil","Brasilia","BR","76","BRA","BR","55","-10.00 -55.00","-73.99 +5.26 -32.39 -33.75",R.drawable.brazil))
        countries.add(Country("Canada","Ottawa","CA","124","CAN","CA","1","+60.00 -95.00","-141.00 +83.11 -52.64 +41.68",R.drawable.canada))
        countries.add(Country("Egypt","Cairo","EG","818","EGY","EG","20","+27.00 +30.00","+24.70 +31.67 +35.79 +21.73",R.drawable.egypt))
        countries.add(Country("Finland","Helsinki","FI","246","FIN","FI","358","+64.00 +26.00","+19.52 +70.10 +31.58 +59.81",R.drawable.finland))
        countries.add(Country("Germany","Berlin","DE","276","DEU","GM","49","+51.00 +9.00","+5.87 +55.06 +15.04 +47.28",R.drawable.germany))
        countries.add(Country("India","Delhi","IN","356","IND","IN","91","+20.00 +77.00","+68.19 +35.50 +97.40 +6.75",R.drawable.india))
        countries.add(Country("Indonesia","Jakarta","ID","360","IDN","ID","62","-5.00 +120.00","+95.01 +5.90 +141.02 -10.94",R.drawable.indonesia))
        countries.add(Country("Israel","Jerusalem","IL","376","ISR","IS","972","+31.30 +34.45","+34.23 +33.34 +35.88 +29.50",R.drawable.israel))
        countries.add(Country("Italy","Rome","IT","380","ITA","IT","39","+42.50 +12.50","+6.61 +47.10 +18.51 +36.65",R.drawable.italy))
        countries.add(Country("Japan","Tokyo","JP","392","JPN","JA","81","+36.00 +138.00","+122.94 +45.52 +145.82 +24.25",R.drawable.japan))
        countries.add(Country("Kenya","Nairobi","KE","404","KEN","KE","254","+1.00 +38.00","+33.91 +5.02 +41.90 -4.68",R.drawable.kenya))
        countries.add(Country("Kuwait","Kuwait city","KW","414","KWT","KU","965","+29.30 +45.45","+46.56 +30.10 +48.43 +28.52",R.drawable.kuwait))





        val adapter = CustomAdapter(countries)
        recyclerView.adapter=adapter


    }
}