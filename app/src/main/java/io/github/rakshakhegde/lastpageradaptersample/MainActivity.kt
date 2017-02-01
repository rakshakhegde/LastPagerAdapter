package io.github.rakshakhegde.lastpageradaptersample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import io.github.rakshakhegde.lastpageradapter.LastPagerAdapter
import io.github.rakshakhegde.lastpageradapter.lastPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

	lateinit var adapter: LastPagerAdapter

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		adapter = viewpager.lastPagerAdapter(BR.model) {
			add(layoutId = R.layout.one_layout, model = "one", title = "First Layout")
			add(R.layout.two_layout, title = "Different Layout")
			add(layoutId = R.layout.one_layout, model = "Last Index", title = "First Layout Again")
		}
	}

	// Not used anywhere
	fun apiUsage1() {
		viewpager.lastPagerAdapter(BR.model) {
			add(layoutId = R.layout.one_layout, model = "one", title = "First Layout")
			add(R.layout.two_layout, title = "Different Layout")
			add(layoutId = R.layout.one_layout, model = "Last Index", title = "First Layout Again")
		}
	}

	// Not used anywhere
	fun apiUsage2() {

		LastPagerAdapter(BR.model)
				.add(layoutId = R.layout.one_layout, model = "one", title = "First Layout")
				.add(R.layout.two_layout, title = "Different Layout")
				.add(layoutId = R.layout.one_layout, model = "Last Index", title = "First Layout Again")
				.into(viewpager)
	}

	// Not used anywhere
	fun apiUsage3() {

		LastPagerAdapter(BR.model).apply {

			add(layoutId = R.layout.one_layout, model = "one", title = "First Layout")
			add(R.layout.two_layout, title = "Different Layout")
			add(layoutId = R.layout.one_layout, model = "Last Index", title = "First Layout Again")

			into(viewpager)
		}
	}

	override fun onCreateOptionsMenu(menu: Menu?): Boolean {
		menuInflater.inflate(R.menu.main_menu, menu)
		return true
	}

	override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
		R.id.add -> truthy {
			adapter.add(R.layout.one_layout, title = "First Layout", model = "${adapter.count}")
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
