package kr.susemi99.kotlinmvvmsettingsample.main


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.main_fragment.*
import kr.susemi99.kotlinmvvmsettingsample.R

class MainFragment : Fragment() {

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    return inflater.inflate(R.layout.main_fragment, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    val bundle = Bundle().apply {
      this.putString("key1", "value1")
      this.putFloat("key2", 123.45f)
    }

    val navController = Navigation.findNavController(view)
    goToUser.setOnClickListener { navController.navigate(R.id.action_mainFragment_to_userFragment, bundle) }
    goToToDo.setOnClickListener { navController.navigate(R.id.action_mainFragment_to_toDoFragment) }
  }
}
