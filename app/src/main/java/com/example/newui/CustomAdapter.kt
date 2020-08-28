package com.example.newui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_layout.view.*
import org.w3c.dom.Text

class CustomAdapter(val countrylist: ArrayList<Country>) : RecyclerView.Adapter <CustomAdapter.ViewHolder>(){
    class ViewHolder(itemview: View):RecyclerView.ViewHolder(itemview){
        val country = itemview.findViewById<TextView>(R.id.countryname_textview) as TextView
        val capital = itemview.findViewById<TextView>(R.id.capital_textview) as TextView
        val iso2 = itemview.findViewById<TextView>(R.id.code_iso_2_textview) as TextView
        val isoNum = itemview.findViewById<TextView>(R.id.code_iso_num_textview) as TextView
        val iso3 = itemview.findViewById<TextView>(R.id.code_iso_3_textview) as TextView
        val fipCode = itemview.findViewById<TextView>(R.id.code_fips_textview) as TextView
        val telPrefix = itemview.findViewById<TextView>(R.id.tel_prefix_textview) as TextView
        val centerCode = itemview.findViewById<TextView>(R.id.center_textview) as TextView
        val rect = itemview.findViewById<TextView>(R.id.rectangle_textview) as TextView
        val countryflag = itemview.findViewById<ImageView>(R.id.country_flag) as ImageView



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.list_layout, parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return countrylist.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val country:Country = countrylist[position]
        holder?.country?.text = country.country_name
        holder?.capital?.text = country.capital
        holder?.iso2?.text = country.code_iso_2
        holder?.isoNum?.text = country.code_iso_num
        holder?.iso3?.text = country.code_iso_3
        holder?.fipCode?.text = country.code_fips
        holder?.telPrefix?.text = country.tel_prefix
        holder?.centerCode?.text = country.centerCode
        holder?.rect?.text = country.rectangle_str
        holder?.countryflag?.setImageResource(country.countryFlag)

    }
}