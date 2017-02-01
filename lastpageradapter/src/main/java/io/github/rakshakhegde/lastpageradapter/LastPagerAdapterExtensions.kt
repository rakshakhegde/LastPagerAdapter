package io.github.rakshakhegde.lastpageradapter

import android.support.v4.view.ViewPager

/**
 * Created by rakshakhegde on 01/02/17.
 */

inline fun ViewPager.lastPagerAdapter(modelId: Int, crossinline f: LastPagerAdapter.() -> Unit) =
		LastPagerAdapter(modelId).apply {
			f()
			into(this@lastPagerAdapter)
		}