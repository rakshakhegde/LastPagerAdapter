Android ViewPager Helper to eliminate writing PagerAdapters and use just lightweight Views (instead of Fragments) with Data Binding.

#### Sweet and short library 💋

```java
// Java
new LastPagerAdapter(BR.model)
    .add(R.layout.one_layout, "title", modelObject)
    .into(viewPager);
```
```kotlin
// Kotlin
viewpager.lastPagerAdapter(BR.model) {
    add(R.layout.one_layout, "title", modelObject)
}
```

Library Concept inspired from SmartTabLayout's [Utils](https://github.com/ogaclejapan/SmartTabLayout/tree/master/utils-v4)

Library Structure inspired from [LastAdapter](https://github.com/nitrico/LastAdapter)

## Setup

### Gradle

Add it in your root build.gradle at the end of repositories:
```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
Step 2. Add the dependency
```gradle
dependencies {
    compile 'com.github.rakshakhegde:LastPagerAdapter:-SNAPSHOT'
}
```

* Based on [**Android Data Binding**](https://developer.android.com/topic/libraries/data-binding/index.html)
* Written in [**Kotlin**](http://kotlinlang.org)
* No need to write the adapter
* No need to modify your model classes
* Supports different view layouts
* Very fast — no reflection
* Super easy API
* Minimum Android SDK: **9**

Note:

- Fragments are heavy. They have their own complex lifecycles which is a headache to manage. They should be avoided. Here are many more reasons why. - https://medium.com/square-corner-blog/advocating-against-android-fragments-81fd0b462c97#.k3lif924a

This project and this README is a work in progress. Please cooperate.

Pull requests highly welcome ^_^

Made with ❤️ in India
