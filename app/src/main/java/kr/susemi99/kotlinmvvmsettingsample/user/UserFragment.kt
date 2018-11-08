package kr.susemi99.kotlinmvvmsettingsample.user

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import kr.susemi99.kotlinmvvmsettingsample.BR
import kr.susemi99.kotlinmvvmsettingsample.R
import kr.susemi99.kotlinmvvmsettingsample.databinding.UserFragmentBinding

class UserFragment : Fragment() {
  private lateinit var binding: UserFragmentBinding
  private lateinit var model: UserFragmentModel

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    return inflater.inflate(R.layout.user_fragment, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    binding = UserFragmentBinding.bind(view)

    model = ViewModelProviders.of(this).get(UserFragmentModel::class.java)
    binding.setVariable(BR.model, model)
  }

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)

    model.setValues(arguments?.getString("key1"), arguments?.getFloat("key2"))
  }
}
