# ViewPagerIndicator2
An (mildly) improved ViewPagerIndicator

## Changes

1. Build with Gradle as opposed to Maven, So it works with [JitPack](https://jitpack.io/).
2. Uses `Math` instead of `FloatMath`, thus it works on Andrid API lvl 23

## To Install

Add the JitPack repository to your build file
```
allprojects {
	repositories {
  	...
  	maven { url "https://jitpack.io" }
	}
}
```

Add the dependency
```
dependencies {
  compile 'com.github.jrejaud:ViewPagerIndicator2:0.0.1'
}
```

https://jitpack.io/#jrejaud/ViewPagerIndicator2 for more instructions
