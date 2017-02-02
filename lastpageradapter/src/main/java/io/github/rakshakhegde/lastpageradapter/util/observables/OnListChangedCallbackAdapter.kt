package io.github.rakshakhegde.lastpageradapter.util.observables

import android.databinding.ObservableList

/**
 * Created by rakshakhegde on 01/02/17.
 */

abstract class OnListChangedCallbackAdapter<T : ObservableList<*>> :
		ObservableList.OnListChangedCallback<T>() {

	override fun onItemRangeRemoved(sender: T, positionStart: Int, itemCount: Int) {
	}

	override fun onItemRangeMoved(sender: T, fromPosition: Int, toPosition: Int, itemCount: Int) {
	}

	override fun onItemRangeInserted(sender: T, positionStart: Int, itemCount: Int) {
	}

	override fun onItemRangeChanged(sender: T, positionStart: Int, itemCount: Int) {
	}

	override fun onChanged(sender: T) {
	}

}