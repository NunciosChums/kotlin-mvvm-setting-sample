package kr.susemi99.kotlinmvvmsettingsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main_activity)

    setSupportActionBar(toolbar)

    val navigation = Navigation.findNavController(this, nav_host_fragment.id)
    NavigationUI.setupActionBarWithNavController(this, navigation)
    toolbar.setNavigationOnClickListener { navigation.navigateUp() }
  }
}
