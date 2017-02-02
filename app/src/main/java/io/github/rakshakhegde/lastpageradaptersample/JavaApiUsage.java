package io.github.rakshakhegde.lastpageradaptersample;

import android.support.v4.view.ViewPager;

import io.github.rakshakhegde.lastpageradapter.LastPagerAdapter;

/**
 * Created by rakshakhegde on 01/02/17.
 */

/* Not used anywhere */
public class JavaApiUsage {
	ViewPager viewPager;

	public void apiUsage1() {
		new LastPagerAdapter(BR.model)
				.add(R.layout.one_layout, "title", null, 1.0F)
				.into(viewPager);
	}
}
