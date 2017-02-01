package io.github.rakshakhegde.lastpageradapter.util.observables

import android.databinding.ObservableList

/**
 * Created by rakshakhegde on 01/02/17.
 */

abstract class EasyOnListChangedCallback<T> :
        ObservableList.OnListChangedCallback<ObservableList<T>>() {

    override fun onChanged(sender: ObservableList<T>?) {
    }

    override fun onItemRangeChanged(sender: ObservableList<T>?, positionStart: Int, itemCount: Int) {
    }

    override fun onItemRangeRemoved(sender: ObservableList<T>?, positionStart: Int, itemCount: Int) {
    }

    override fun onItemRangeInserted(sender: ObservableList<T>?, positionStart: Int, itemCount: Int) {
    }

    override fun onItemRangeMoved(sender: ObservableList<T>?, fromPosition: Int, toPosition: Int, itemCount: Int) {
    }

}