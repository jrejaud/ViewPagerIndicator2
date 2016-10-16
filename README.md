# ViewPagerIndicator2
An (mildly) improved [ViewPagerIndicator](https://github.com/JakeWharton/ViewPagerIndicator), originally by Jake Wharton

## Changes from ViewPagerIndicator
1. Build with Gradle as opposed to Maven; Works with [JitPack](https://jitpack.io/).
2. Uses `Math` instead of `FloatMath`, thus this library works on Andrid API lvl 23

## To Install
Add the JitPack repository to your build file
```groovy
allprojects {
	repositories {
  	...
  	maven { url "https://jitpack.io" }
	}
}
```

Add the dependency
```groovy
dependencies {
	compile 'com.github.jrejaud:ViewPagerIndicator2:0.0.2'
}
```
Visit https://jitpack.io/#jrejaud/ViewPagerIndicator2 for more information.

## Usage
See https://github.com/JakeWharton/ViewPagerIndicator#usage for instructions on how to use ViewPagerIndicator.
You just need to change the path (in Java and XML) to:

```groovy
com.github.jrejaud.viewpagerindicator2;
```

instead of 

```java
com.viewpagerindicator;
```


#ViewPagerIndicator License 
```
Copyright 2012 Jake Wharton
Copyright 2011 Patrik Åkerfeldt
Copyright 2011 Francisco Figueiredo Jr.

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
