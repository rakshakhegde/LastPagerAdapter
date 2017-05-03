package io.github.rakshakhegde.lastpageradapter

import android.databinding.ViewDataBinding
import android.os.Parcelable
import android.util.SparseArray
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
	init {
		// Bind
	}

	var binding: ViewDataBinding?
		get() = bindingRef?.get()
		internal set(value) {
			value?.root?.addOnAttachStateChangeListener()
			bindingRef = SoftReference(value)
		}

	private var bindingRef: SoftReference<ViewDataBinding?>? = null

	private var hierarchyState: SparseArray<Parcelable>? = null

	internal fun saveHierarchyState() {
		binding?.root?.apply {
			hierarchyState = SparseArray()
			saveHierarchyState(hierarchyState)
		}
	}

	internal fun restoreHierarchyState() {
		hierarchyState?.let { binding?.root?.restoreHierarchyState(it) }
	}
}