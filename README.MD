ViewPager Helper to eliminate writing PagerAdapters and use lightweight Views with Data Binding.

How to use:
```
new LastPagerAdapter(BR.model)
				.add(R.layout.one_layout, "title", modelObject)
				.into(viewPager);
```

Library inspired from SmartTabLayout's Utils - https://github.com/ogaclejapan/SmartTabLayout

Library Structure inspired from LastAdapter - https://github.com/nitrico/LastAdapter

Note:

- Fragments are heavy. They have their own complex lifecycles which is a headache to manage. They should be avoided. Here are many more reasons why. - https://medium.com/square-corner-blog/advocating-against-android-fragments-81fd0b462c97#.k3lif924a

Made with ❤️ in India
