package com.example.pulaunias


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_detail_daerah.view.*

class DetailDaerahFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val layoutView = inflater.inflate(R.layout.fragment_detail_daerah, container, false)

        getShareArgs(layoutView)

        return layoutView
    }

    private fun getShareArgs(layoutView: View) {
        val args = DetailDaerahFragmentArgs.fromBundle(arguments!!)

        when (args.cityName) {
            DaftarDaerahFragment.KOTA_GUNUNGSITOLI -> {
                with(layoutView) {
                    txt_name_detail_daerah.text = getString(R.string.kota_gunungsitoli)
                    img_logo_detail_daerah.setImageDrawable(context.getDrawable(R.drawable.logo_gunungsitoli))
                    txt_desc_detail_daerah.text = getString(R.string.desc_kota_gunungsitoli)
                }
            }
            DaftarDaerahFragment.NIAS_UTARA -> {
                with(layoutView) {
                    txt_name_detail_daerah.text = getString(R.string.kab_nias_utara)
                    img_logo_detail_daerah.setImageDrawable(context.getDrawable(R.drawable.logo_nias_utara))
                    txt_desc_detail_daerah.text = getString(R.string.desc_kab_nias_utara)
                }
            }
            DaftarDaerahFragment.NIAS_BARAT -> {
                with(layoutView) {
                    txt_name_detail_daerah.text = getString(R.string.kab_nias_barat)
                    img_logo_detail_daerah.setImageDrawable(context.getDrawable(R.drawable.logo_nias_barat))
                    txt_desc_detail_daerah.text = getString(R.string.desc_kab_nias_barat)
                }
            }
            DaftarDaerahFragment.NIAS_SELATAN -> {
                with(layoutView) {
                    txt_name_detail_daerah.text = getString(R.string.kab_nias_selatan)
                    img_logo_detail_daerah.setImageDrawable(context.getDrawable(R.drawable.logo_nias_selatan))
                    txt_desc_detail_daerah.text = getString(R.string.desc_kab_nias_selatan)
                }
            }
            else -> {
                with(layoutView) {
                    txt_name_detail_daerah.text = getString(R.string.kab_nias)
                    img_logo_detail_daerah.setImageDrawable(context.getDrawable(R.drawable.logo_nias))
                    txt_desc_detail_daerah.text = getString(R.string.desc_kab_nias)
                }
            }
        }

    }


}
