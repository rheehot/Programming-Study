# Android-Study
Android Study for future.

-----

## API
- [ ] OkHttp
- [ ] Json
- [ ] Retrofit
- [ ] Rest API

## Pattern [[Reference]](https://academy.realm.io/kr/posts/eric-maxwell-mvc-mvp-and-mvvm-on-android)
- [ ] MVVM
- [x] MVP [[GOTO]](https://github.com/sungbin5304/Android-Study/tree/master/pattern/MVP)
- [ ] MVC

## Useful Library
[RxAndroid](https://github.com/ReactiveX/RxAndroid)<br>
[Paris](https://github.com/airbnb/paris)

## Useful Something
[Intro Slider](http://www.androidhive.info/2016/05/android-build-intro-slider-app/)

## Animation
[Shared element activity transition](https://developer.android.com/training/transitions/start-activity)
[Activty change with Animation]<br>
<img src="https://raw.githubusercontent.com/sungbin5304/Android-Study/master/untitled.gif" alt="preview" width="300" height="400">
```kotlin
startActivity(Intent(applicationContext, PermissionActivity::class.java))
overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
```
