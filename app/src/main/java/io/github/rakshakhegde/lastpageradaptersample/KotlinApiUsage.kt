package io.github.rakshakhegde.lastpageradaptersample

import android.support.v4.view.ViewPager
import io.github.rakshakhegde.lastpageradapter.LastPagerAdapter
import io.github.rakshakhegde.lastpageradapter.lastPagerAdapter

/**
 * Created by rakshakhegde on 02/02/17.
 */

/* Not used anywhere */
class KotlinApiUsage {

	lateinit var viewpager: ViewPager

	fun apiUsage1() {
		viewpager.lastPagerAdapter(BR.model) {
			add(layoutId = R.layout.one_layout, model = "one", title = "First Layout")
			add(R.layout.two_layout, title = "Different Layout")
			add(layoutId = R.layout.one_layout, model = "Last Index", title = "First Layout Again")
		}
	}

	fun apiUsage2() {

		LastPagerAdapter(BR.model)
				.add(layoutId = R.layout.one_layout, model = "one", title = "First Layout")
				.add(R.layout.two_layout, title = "Different Layout")
				.add(layoutId = R.layout.one_layout, model = "Last Index", title = "First Layout Again")
				.into(viewpager)
	}

	fun apiUsage3() {

		LastPagerAdapter(BR.model).apply {

			add(layoutId = R.layout.one_layout, model = "one", title = "First Layout")
			add(R.layout.two_layout, title = "Different Layout")
			add(layoutId = R.layout.one_layout, model = "Last Index", title = "First Layout Again")

			into(viewpager)
		}
	}
}