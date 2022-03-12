package com.example.recycle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.fragment_anasayfa.view.*


class AnasayfaFragment : Fragment() {

    private lateinit var tasarim: View
    private lateinit var adapter: MeyveAdapter
    private lateinit var meyvlerListe: ArrayList<Meyveler>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        tasarim = inflater.inflate(R.layout.fragment_anasayfa, container, false)

        tasarim.rvMeyve.layoutManager = StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)

        meyvlerListe = ArrayList()

        val m1 = Meyveler(1,"apple",27.95,"Elma","1kg")
        val m2 = Meyveler(2,"avocado",45.95,"Avocado","500g")
        val m3 = Meyveler(3,"bananas",15.51,"Muz","1kg")
        val m4 = Meyveler(4,"broccoli",34.15,"Brokoli","800g")
        val m5 = Meyveler(5,"coconut",7.95,"Hindistan Cevizi","1 adet")
        val m6 = Meyveler(6,"datepalm",57.95,"Badem","1kg")
        val m7 = Meyveler(7,"dragonfruit",17.45,"Ejderha Meyvesi","1 adet")
        val m8 = Meyveler(8,"durian",25.81,"Durian","1 adet")
        val m9 = Meyveler(9,"fruit",13.95,"Mandalina","1kg")
        val m10 = Meyveler(10,"grape",17.55,"Üzüm","1kg")
        val m11 = Meyveler(11,"lemon",6.95,"Limon","1kg")
        val m12 = Meyveler(12,"orangejuice",21.51,"Portakal","1kg")
        val m13 = Meyveler(13,"passionfruit",7.95,"Çarkıfelek","1 adet")
        val m14 = Meyveler(14,"strawberry",11.95,"Çilek","500g")

        meyvlerListe.add(m1)
        meyvlerListe.add(m2)
        meyvlerListe.add(m3)
        meyvlerListe.add(m4)
        meyvlerListe.add(m5)
        meyvlerListe.add(m6)
        meyvlerListe.add(m7)
        meyvlerListe.add(m8)
        meyvlerListe.add(m9)
        meyvlerListe.add(m10)
        meyvlerListe.add(m11)
        meyvlerListe.add(m12)
        meyvlerListe.add(m13)
        meyvlerListe.add(m14)

        adapter = MeyveAdapter(requireContext(),meyvlerListe)
        tasarim.rvMeyve.adapter = adapter



        return tasarim
    }


}