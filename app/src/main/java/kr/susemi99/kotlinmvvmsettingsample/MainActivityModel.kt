package kr.susemi99.kotlinmvvmsettingsample;

import android.util.Log
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class MainActivityModel : ViewModel() {
  var title = ObservableField<String>()

  init {
    title.set("title1")
  }

  override fun onCleared() {
    super.onCleared()

    Log.i("APP#", "=== cleared ===")
  }

  fun buttonClicked() {
    title.set("clicked")
  }
}
