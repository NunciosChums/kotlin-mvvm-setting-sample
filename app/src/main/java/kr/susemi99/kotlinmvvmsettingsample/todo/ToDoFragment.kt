package kr.susemi99.kotlinmvvmsettingsample.todo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import kr.susemi99.kotlinmvvmsettingsample.BR
import kr.susemi99.kotlinmvvmsettingsample.R
import kr.susemi99.kotlinmvvmsettingsample.databinding.ToDoFragmentBinding

class ToDoFragment : Fragment() {
  private lateinit var binding: ToDoFragmentBinding
  private lateinit var model: ToDoFragmentModel

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    return inflater.inflate(R.layout.to_do_fragment, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    binding = ToDoFragmentBinding.bind(view)

    model = ViewModelProviders.of(this).get(ToDoFragmentModel::class.java)
    binding.setVariable(BR.model, model)
  }
}
