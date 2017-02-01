package io.github.rakshakhegde.lastpageradapter.util.observables

import android.databinding.ObservableList

/**
 * Created by rakshakhegde on 01/02/17.
 */
fun <T, S : ObservableList<T>> S.onListChanged(f: S.() -> Unit) {
    // Call the callback as soon as listener is hooked up
    f()

    addOnListChangedCallback(object : EasyOnListChangedCallback<T>() {
        override fun onChanged(sender: ObservableList<T>?) {
            f()
        }

        override fun onItemRangeInserted(sender: ObservableList<T>?, positionStart: Int, itemCount: Int) {
            f()
        }

        override fun onItemRangeRemoved(sender: ObservableList<T>?, positionStart: Int, itemCount: Int) {
            f()
        }
    })
}