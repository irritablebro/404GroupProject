package com.example.groupproject

import android.content.Intent
import android.media.Image
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.findFragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HealthFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HealthFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

//    lateinit var contactImg:ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }



    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View=inflater.inflate(R.layout.fragment_health,container,false)

        val contactImg=view.findViewById<ImageView>(R.id.health_contact)
        val hypertensionImg=view.findViewById<ImageView>(R.id.health_img_hypertension)
        val hypertensionText=view.findViewById<TextView>(R.id.health_text_hypertension)
        val searchBar=view.findViewById<TextView>(R.id.health_search_bar_edittext)

        contactImg.setOnClickListener {
            val intent = Intent (requireActivity(), Chat::class.java)
            startActivity(intent)
        }
        hypertensionText.setOnClickListener {
            val intent = Intent (requireActivity(), chronic_detail::class.java)
            startActivity(intent)
        }
        hypertensionImg.setOnClickListener {
            val intent = Intent (requireActivity(), chronic_detail::class.java)
            startActivity(intent)
        }
        searchBar.setOnClickListener {
            val intent = Intent (requireActivity(), chronic_search::class.java)
            startActivity(intent)
        }
        // Inflate the layout for this fragment
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HealthFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HealthFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}