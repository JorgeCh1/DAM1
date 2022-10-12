package ni.edu.uca.navegacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import ni.edu.uca.navegacion.databinding.ActivityMainBinding
import ni.edu.uca.navegacion.databinding.FragmentMenuBinding

/**
 * A simple [Fragment] subclass.
 * Use the [MenuFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
lateinit var fBinding:FragmentMenuBinding

class MenuFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fBinding = FragmentMenuBinding.inflate(layoutInflater)

        return fBinding.root
    }
    private fun iniciar() {

        fBinding.btnSuma.setOnClickListener(){
            it.findNavController().navigate(R.id.menu_Suma)
        }
        fBinding.btnResta.setOnClickListener(){

            it.findNavController().navigate(R.id.menu_Resta)

        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
       this.iniciar()
    }

}



