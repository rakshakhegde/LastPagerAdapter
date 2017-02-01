package io.github.rakshakhegde.lastpageradapter

import android.databinding.ViewDataBinding
import android.view.View
import java.lang.ref.SoftReference
import java.lang.ref.WeakReference

/**
 * Created by rakshakhegde on 01/02/17.
 */
class PagerItem(
        val layoutId: Int,
        val model: Any?,
        val title: CharSequence?,
        val width: Float
) {
    lateinit var binding: SoftReference<ViewDataBinding?>
}