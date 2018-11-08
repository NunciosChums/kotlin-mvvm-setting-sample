package kr.susemi99.kotlinmvvmsettingsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProviders

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val binding = DataBindingUtil.setContentView<ViewDataBinding>(this, R.layout.main_activity)
    val mainActivityModel = ViewModelProviders.of(this).get(MainActivityModel::class.java)
    binding.setVariable(BR.model, mainActivityModel)
  }
}
