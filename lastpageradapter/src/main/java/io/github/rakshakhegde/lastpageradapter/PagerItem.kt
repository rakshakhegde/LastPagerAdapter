package io.github.rakshakhegde.lastpageradapter

import android.databinding.ViewDataBinding
import java.lang.ref.SoftReference

/**
 * Created by rakshakhegde on 01/02/17.
 */
data class PagerItem(
		val layoutId: Int,
		val model: Any?,
		val title: CharSequence?,
		val width: Float
) {

	var binding: ViewDataBinding?
		get() = bindingRef?.get()
		internal set(value) {
			bindingRef = SoftReference(value)
		}

	private var bindingRef: SoftReference<ViewDataBinding?>? = null
}
