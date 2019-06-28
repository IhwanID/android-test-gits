package id.ihwan.gitsnews.feature.home.view


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import id.ihwan.gitsnews.R

class AndroidFragment : Fragment() {

    companion object {
        fun newInstance(): AndroidFragment {
            return AndroidFragment()
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_android, container, false)
    }


}