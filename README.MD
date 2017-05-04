[![BuddyBuild](https://dashboard.buddybuild.com/api/statusImage?appID=5895d7a1e0b5980100192b42&branch=master&build=latest)](https://dashboard.buddybuild.com/apps/5895d7a1e0b5980100192b42/build/latest?branch=master)
[![Release](https://jitpack.io/v/rakshakhegde/LastPagerAdapter.svg)](https://jitpack.io/#rakshakhegde/LastPagerAdapter)
[![android min api](https://img.shields.io/badge/API-9+-blue.svg)](#rocket-lastpageradapter)
[![size](https://img.shields.io/badge/Size-39_KB-e91e63.svg)](https://github.com/rakshakhegde/Komparison)
[![Android Arsenal](https://img.shields.io/badge/Android_Arsenal-LastPagerAdapter-green.svg?style=flat)](https://android-arsenal.com/details/1/5214)
[![MaterialUp](https://img.shields.io/badge/MaterialUp-LastPagerAdapter-green.svg?style=flat)](https://material.uplabs.com/posts/lastpageradapter)


<p align="center">
<img alt="LastPagerAdapter Hero Banner" src="https://cdn.rawgit.com/rakshakhegde/LastPagerAdapter/master/ART/lastpageradapter-banner.svg" width="600"></img>
</p>


Don't write a ViewPager Adapter! Hook up your ViewPager to your data model using [**Android Data Binding**](https://developer.android.com/topic/libraries/data-binding/index.html) Framework.

### Show some :heart:

[![GitHub stars](https://img.shields.io/github/stars/rakshakhegde/LastPagerAdapter.svg?style=social&label=Star)](https://github.com/rakshakhegde/LastPagerAdapter) [![GitHub forks](https://img.shields.io/github/forks/rakshakhegde/LastPagerAdapter.svg?style=social&label=Fork)](https://github.com/rakshakhegde/LastPagerAdapter/fork) [![GitHub watchers](https://img.shields.io/github/watchers/rakshakhegde/LastPagerAdapter.svg?style=social&label=Watch)](https://github.com/rakshakhegde/LastPagerAdapter) [![GitHub followers](https://img.shields.io/github/followers/rakshakhegde.svg?style=social&label=Follow)](https://github.com/rakshakhegde)  
[![Twitter Follow](https://img.shields.io/twitter/follow/rakshakhegde.svg?style=social)](https://twitter.com/rakshakhegde)


<h2 align="center">:kiss: Sweet and short library</h2>

Use the language of your choice.

```java
// Java
new LastPagerAdapter(BR.model)
    .add(R.layout.layout_one, "First Layout Title", modelObject1)
    .add(R.layout.layout_two, "Second Layout Title", modelObject2)
    .into(viewPager);
```
```kotlin
// Kotlin
viewpager.lastPagerAdapter(BR.model) {
    add(R.layout.layout_one, "First Layout Title", modelObject1)
    add(R.layout.layout_two, "Second Layout Title", modelObject2)
}
```
Download the [demo apk](https://github.com/rakshakhegde/LastPagerAdapter/raw/master/demo.apk) to play around with the LastPagerAdapter demo app.

<p align="center">
<img alt="Demo GIF" src="ART/lastpageradapter-demo.gif" width=250 />
</p>

Or try the limited 1 min [live app demo](https://appetize.io/app/uqjemedvam0h8k8t4yt1vprtyr) at Appetize.


<h2 align="center">:crown: Features</h2>

|         |  LastPagerAdapter   |
|--------------------------|------------------------------------------------------------|
:monorail: | Within a few lines easily hook up your data models with your ViewPager
:link: | Based on [**Android Data Binding**](https://developer.android.com/topic/libraries/data-binding/index.html)
:sparkles: | Written in [**Kotlin**](https://kotlinlang.org/). A concise language you should definitely check out, if you haven't already.
:pencil2: | No need to write any PagerAdapter (FragmentPagerAdapter, etc.)
⾹ |  Doesn't rely on Fragments. It has complex lifecycle and best be avoided. [More reasons why](https://medium.com/square-corner-blog/advocating-against-android-fragments-81fd0b462c97#.k3lif924a)
:x: | No need to modify your existing model classes
:page_with_curl: | Supports different View layouts and hooking it up with ViewPager is a breeze
:ok_hand: | Super easy API. Concise syntax. Less Bugs for you to worry about. Boosted Productivity.
:memo: | Helpful error stacktraces
:rocket: | Very fast — no reflection
:iphone: | Minimum Android SDK: **Gingerbread API 9**


<h2 align="center">:classical_building: Build</h2>

Add this in your root build.gradle at the end of repositories:
```gradle
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
Step 2. Add the dependency in your module's gradle file
```gradle
// apply plugin: 'kotlin-kapt'  // this line only for Kotlin projects

android {
    ...
    dataBinding.enabled true
}

dependencies {
    compile 'com.github.rakshakhegde:LastPagerAdapter:1.2'
    // kapt 'com.android.databinding:compiler:GRADLE_PLUGIN_VERSION' // this line only for Kotlin projects
}
```


<h2 align="center">:thinking: How to use</h2>

`<layout>` as root for your View layouts is a **must**:

```xml
<layout xmlns:android="http://schemas.android.com/apk/res/android" >

    <data>
        <variable name="model" type="io.github.rakshakhegde.lastpageradaptersample.TextModel" />
    </data>

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="@{model.text}" />

</layout>
```

**It is important for all the model types to have the same variable name**, in this case "model".
This name is passed to the adapter constructor as BR.variableName, in this case BR.model:

```java
// Java
new LastPagerAdapter(BR.model)
    .add(R.layout.text_layout, "Optional Layout Title", optionalTextModelObject, optionalWidth)
    .into(viewPager); // don't forget this line
```
```kotlin
// Kotlin
viewpager.lastPagerAdapter(BR.model) {
    add(R.layout.text_layout, "Optional Layout Title", optionalTextModelObject, optionalWidth)
}
```
Except the layoutId, everything else is optional

And that is how easy it is. Download the [demo apk](https://github.com/rakshakhegde/LastPagerAdapter/raw/master/demo.apk) to play around with the LastPagerAdapter demo app.


<h2 align="center">:-1: Known Issues</h2>

- Customizability in terms of having independent names for models in XML is not present
- API seems a bit verbose for large number of similar views. Could implement a version which accepts arrays. Anyways, a loop could be used there.
- Callbacks for creation or destruction of Views is not implemented (I didn't implement them because personally my use case didn't require it). Feel free to Pull Request this one.


<h2 align="center">:sparkles: My Recommended Repos</h2>

- [DaggerAndroidInjector](https://github.com/rakshakhegde/DaggerAndroidInjector)
- [Diffre](https://github.com/rakshakhegde/Diffre)


<h2 align="center">:sparkles: Acknowledgements</h2>

Library and API Structure inspired from [LastAdapter](https://github.com/nitrico/LastAdapter)

Library Concept inspired from SmartTabLayout's [Utils](https://github.com/ogaclejapan/SmartTabLayout/tree/master/utils-v4)

Logo and Hero Banner created by Govindaraj Karthikeyan. Check him out on [Bēhance](http://www.behance.net/govindux)

Core Logo created using Roman Nurik's awesome [Android Asset Studio](https://romannurik.github.io/AndroidAssetStudio/) :fire::fire::fire:



<h2 align="center">:man_cartwheeling: Author</h2>

Catch me at [**@rakshakhegde**](https://twitter.com/rakshakhegde)

[Email](mailto:rakshakhegde@gmail.com) | [Twitter](https://twitter.com/rakshakhegde) | [Facebook](https://www.facebook.com/rakshakhegde) | [Google+](https://plus.google.com/+RakshakHegde) | [Linked.in](https://in.linkedin.com/in/rakshakrhegde)

<h2 align="center">:fork_and_knife: Contribute</h2>

Please file bugs, suggest improvements and feel free to contribute

> :kiss: **K**eep **I**t **S**imple **S**illy


<h2 align="center">Changelog</h2>

- [v1.2](https://github.com/rakshakhegde/LastPagerAdapter/releases/tag/1.2)
    - Documentation Update
    - Upgraded internal working
    - Updated library versions
    - Fix AndroidManifest



<h2 align="center">:memo: License</h2>

```txt
Copyright 2017 Rakshak Hegde

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
