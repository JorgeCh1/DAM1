package ni.edu.uca.jasonesquivel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import ni.edu.uca.jasonesquivel.databinding.FragmentMenuBinding
import ni.edu.uca.jasonesquivel.databinding.FragmentTablaBinding


class TablaFragment : Fragment() {
    // TODO: Rename and change types of parameters

    private lateinit var binding: FragmentTablaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentTablaBinding.inflate(inflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnMultiplo.setOnClickListener {
            obtenerTabla()

        }
    }

    fun obtenerTabla(){
        val num=binding.tvNumeromult.text.toString().toInt()
        var msn=""
        var contador= 1
        while (contador<=12){
            msn+="${num}*${contador}=${num*contador}\n"
            contador+=1

        }
        binding.tvTabla.setText(msn)
    }



}