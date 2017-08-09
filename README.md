# android-ads-blocker


Block advertisements the easy way on Android, no tools, no crap &amp; no ads! 



## Android golden rules for less traffic!

* Don't install apps you not need or simply freeze/not start them to avoid running them all the time in the background.
* Never install (if possible) apps with Ads, better buy pro (if it's worth, also helps the developer) or find alternatives.
* Never use apps which claims to increase battery life. Don't be fooled.
* If you use apps with ads, try to block the hosts + kill the activity (I will show this here)
* Don't use sync or online backup, only enable it once a week if you're home in a trusted environment.
* Use push as less as possible, if not not need any Google services, consider to use [no-gapps](http://forum.xda-developers.com/showthread.php?t=1715375)


## Why you should prefer this solution over the other million solutions that are available?

* It's clean and you can directly see what will be blocked
* No resources wasting because app xyz is running in the background and want to update it 
* It's flashable via .zip directly after a ROM update
* A huge hosts file slows down your connection and costs more ram.
* Backgrounds apps requiring space and additional resources.
* Less battery drain, each time the CPU gets awake your battery needs more energy -> battery drain.


## Is this an full replacement for AdGuard/AdAway?

* No, AdGuard comes with more features but to block hosts my solution should be enough. Such programs such as AdGuard are designed to not only block the entire hosts more to fine control and replace also banners, this means they also handle complex in-app specific things while hosts only block the entire domain only.



## Do I really need other tools?

Depending what you do with your phone, my goal is to lower the communication(s). In fact in 99% all my experience it's enough to block just the domain.


But some apps 'caching' there ads how to get rid of them?

In this case you definitively need other apps because even you block xyz domain the ads are 'hardcoded' within the app which needs illegal manipulation of the apps (often called ad-free) or (if avlb.) you need to manually remove the cache from the app, but it's depending on the method and how the ads are implemented.



## Alternatives
* LuckyPatcher + Patched Google Play Store which proxy all connections (similar like AdGuard) but without VPN API



## What are your domain sources and researches?
* MVP HOST
* Malware domains 
* others (I will update credits and sources with links of course if everything is done)


## Drawbacks
* Since I not use e.g. Facebook I block it, so you possible need to commit out everything with Facebook,...
* It does not filter HTTPS
* Might not survive OTA updates


Research:
* https://github.com/yinjimmy/firebase
* https://developer.android.com/distribute/best-practices/develop/google-analytics-for-firebase.html
* https://developers.google.com/analytics/devguides/collection/android/v4/
* https://github.com/googlesamples/google-services
* https://github.com/AdAway/AdAway/wiki/HostsSources
