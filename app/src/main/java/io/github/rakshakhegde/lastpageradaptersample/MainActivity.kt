package io.github.rakshakhegde.lastpageradaptersample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import io.github.rakshakhegde.lastpageradapter.LastPagerAdapter
import io.github.rakshakhegde.lastpageradapter.lastPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.act

class MainActivity : AppCompatActivity() {

	val FIRST_LAYOUT = "First Layout"
	val FIRST_LAYOUT_AGAIN = "First Layout Again"
	val TWO_LAYOUT = "Fake Login"

	lateinit var adapter: LastPagerAdapter

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		adapter = viewpager.lastPagerAdapter(BR.model) {
			add(layoutId = R.layout.one_layout, model = "one", title = FIRST_LAYOUT)
			add(R.layout.two_layout, title = TWO_LAYOUT, model = SignInModel(act))
			add(layoutId = R.layout.one_layout, model = "Last Index", title = FIRST_LAYOUT_AGAIN)
		}
	}

	override fun onCreateOptionsMenu(menu: Menu?): Boolean {
		menuInflater.inflate(R.menu.main_menu, menu)
		return true
	}

	override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
		R.id.add -> truthy {
			adapter.add(R.layout.one_layout, title = FIRST_LAYOUT, model = "${adapter.count}")
		}
		R.id.remove -> truthy {
			if (adapter.count > 0)
				adapter.remove(viewpager.currentItem)
		}
		else -> super.onOptionsItemSelected(item)
	}

	inline fun truthy(f: () -> Unit) = let {
		f()
		true
	}
}
