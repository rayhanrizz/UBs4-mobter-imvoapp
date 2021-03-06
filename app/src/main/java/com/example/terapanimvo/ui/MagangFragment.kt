package com.example.terapanimvo.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import com.example.terapanimvo.JurusanActivity
import com.example.terapanimvo.PerusahaanActivity
import com.example.terapanimvo.R

class MagangFragment : Fragment() {

    companion object {
        fun newInstance() = MagangFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val root = inflater.inflate(R.layout.fragment_magang, container, false)
        val cardJurusan = root.findViewById(R.id.cardJurusan) as CardView
        val cardPerusahaan = root.findViewById(R.id.cardPerusahaan) as CardView

        cardPerusahaan.setOnClickListener {
            startActivity(Intent(activity, PerusahaanActivity::class.java))
        }

        cardJurusan.setOnClickListener {
            startActivity(Intent(activity, JurusanActivity::class.java))
        }
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

}
