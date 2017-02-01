package io.github.rakshakhegde.lastpageradapter

import android.databinding.DataBindingUtil
import android.databinding.ObservableArrayList
import android.databinding.ViewDataBinding
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.github.rakshakhegde.lastpageradapter.util.observables.onListChanged
import java.lang.ref.SoftReference

/**
 * Created by rakshakhegde on 01/02/17.
 */
class LastPagerAdapter(private val modelId: Int) : PagerAdapter() {

	private val pagerItems = ObservableArrayList<PagerItem>()
	private lateinit var layoutInflater: LayoutInflater

	init {
		pagerItems.onListChanged { notifyDataSetChanged() }
	}

	@JvmOverloads
	fun add(layoutId: Int, title: CharSequence? = null, model: Any? = null, width: Float = DEFAULT_WIDTH) = apply {
		pagerItems.add(PagerItem(layoutId, model, title, width))
	}

	// TODO Overload title with String res Id instead of just CharSequence

	fun remove(position: Int) {
		pagerItems.removeAt(position)
	}

	fun into(viewPager: ViewPager) {
		layoutInflater = LayoutInflater.from(viewPager.context)
		viewPager.adapter = this@LastPagerAdapter
	}

	override fun getCount(): Int = pagerItems.size

	override fun instantiateItem(container: ViewGroup, position: Int): PagerItem =
			pagerItems[position].apply {

				bindingRef?.get()?.apply {
					container.addView(root)
				} ?: apply {
					val view = layoutInflater.inflate(layoutId, container, false)

					val binding = DataBindingUtil.bind<ViewDataBinding>(view).apply {
						setVariable(modelId, model)
						executePendingBindings()
					}
					bindingRef(binding)

					container.addView(view)
				}
			}

	override fun isViewFromObject(view: View, obj: Any): Boolean =
			view == ((obj as PagerItem).bindingRef?.get()?.root as View)

	override fun getItemPosition(obj: Any?): Int {
		val position = pagerItems.indexOf(obj as PagerItem)
		return if (position == -1) POSITION_NONE else position
	}

	override fun destroyItem(container: ViewGroup, position: Int, obj: Any) {
		val pagerItem = obj as PagerItem
		val view = pagerItem.bindingRef?.get()?.root
		container.removeView(view)
	}

	override fun getPageTitle(position: Int) = pagerItems[position].title

	override fun getPageWidth(position: Int) = pagerItems[position].width
}