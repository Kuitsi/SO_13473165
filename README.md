SO_13473165
===========

Example repository for question http://stackoverflow.com/q/13473165/262462

Select SubMenu tab. Submenu should be working as intended. Then change orientation and try that menu again.
It does not react to clicks anymore. After at least one click, change orientation again and app crashes with
`android.view.WindowManager$BadTokenException: Unable to add window -- token null is not valid; is your activity running?`

Crashes at least with combination

* ActionBarSherlock 4.2.0
* ViewPagerIndicator 2.4.1
* Android 2.3.6
