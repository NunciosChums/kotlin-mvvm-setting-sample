package kr.susemi99.kotlinmvvmsettingsample.user

import androidx.databinding.ObservableField
import androidx.databinding.ObservableFloat
import androidx.lifecycle.ViewModel

class UserFragmentModel : ViewModel() {
  var value1 = ObservableField<String>()
  var value2 = ObservableFloat(0.0f)

  fun setValues(value1: String?, value2: Float?) {
    value1?.let { this.value1.set(it) }
    value2?.let { this.value2.set(it) }
  }
}