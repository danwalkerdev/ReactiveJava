# ReactiveJava

Practice and random exercises from [Learning RxJava by Thomas Nield](https://www.oreilly.com/library/view/learning-rxjava/9781787120426/)

## Chapter 1 Notes
### Factory Methods
Observable.range(start, num_to_emit)  
Observable.interval(period, TimeUnit)  
Observable.fromFuture() [useful if interacting with code that produces a Future]  
Observable.empty() [emits nothing and calls onComplete]  
Observable.never() [emits nothing and never calls onComplete, testing]  
Observable.error() [calls onError, testing]  
Observable.defer(lambda) [creates fresh observable each time subscribed, can reflect variable changes]  
Observable.fromCallable() [make an Observable in a lazy/deferred manner. Useful if operation throws error and want to be handled by observable chain]  


