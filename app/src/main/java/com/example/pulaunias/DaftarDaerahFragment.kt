package com.example.pulaunias


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_daftar_daerah.view.*

class DaftarDaerahFragment : Fragment() {

    companion object {
        const val KOTA_GUNUNGSITOLI = "gunungsitoli"
        const val NIAS_UTARA = "nias_utara"
        const val NIAS_BARAT = "nias_barat"
        const val NIAS_SELATAN = "nias_selatan"
        const val NIAS = "nias"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layoutView = inflater.inflate(R.layout.fragment_daftar_daerah, container, false)

        layoutView.kota_gununsitoli.setOnClickListener { showDetailCity(KOTA_GUNUNGSITOLI, it) }
        layoutView.kab_nias_utara.setOnClickListener { showDetailCity(NIAS_UTARA, it) }
        layoutView.kab_nias_barat.setOnClickListener { showDetailCity(NIAS_BARAT, it) }
        layoutView.kab_nias_selatan.setOnClickListener { showDetailCity(NIAS_SELATAN, it) }
        layoutView.kab_nias.setOnClickListener { showDetailCity(NIAS, it) }

        return layoutView
    }

    private fun showDetailCity(cityName: String, view: View) {
        view.findNavController().navigate(DaftarDaerahFragmentDirections.actionDaftarDaerahToDetailDaerah(cityName))
    }

}
