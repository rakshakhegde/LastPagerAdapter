package io.github.rakshakhegde.lastpageradaptersample

import android.app.Activity
import android.databinding.ObservableField
import org.jetbrains.anko.toast

/**
 * Created by rakshakhegde on 02/02/17.
 */
class SignInModel(val act: Activity) {

	val email = ObservableField<String>()
	val password = ObservableField<String>()

	fun signIn() {
		act.toast("${email.get()}\n${password.get()}")
	}
}