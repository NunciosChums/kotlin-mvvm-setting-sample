package kr.susemi99.kotlinmvvmsettingsample;

import android.util.Log
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import io.reactivex.Observable
import io.reactivex.disposables.Disposable
import java.util.concurrent.TimeUnit

class MainActivityModel : ViewModel() {
  var title = ObservableField<String>()
  private var intervalDispose: Disposable? = null

  init {
    intervalDispose = Observable.interval(1, TimeUnit.SECONDS)
      .subscribe(
        {
          title.set(System.currentTimeMillis().toString())
        },
        {
          it.printStackTrace()
        })

    title.addOnPropertyChangedCallback(object : androidx.databinding.Observable.OnPropertyChangedCallback() {
      override fun onPropertyChanged(p0: androidx.databinding.Observable?, p1: Int) {
        Log.i("APP#", "title: " + title.get())
      }
    })
  }

  override fun onCleared() {
    super.onCleared()

    Log.i("APP#", "=== cleared ===")
    intervalDispose?.dispose()
  }

  fun buttonClicked() {
    title.set("clicked")
  }
}
