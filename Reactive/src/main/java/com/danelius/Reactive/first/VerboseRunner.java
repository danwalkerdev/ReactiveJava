package com.danelius.Reactive.first;


import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class VerboseRunner {

    public static void main(String[] args) {
        Observable<String> source = Observable.just("alpha", "beta", "gamma", "delta", "epsilon");

        Observer<Integer> myObserver = new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                // to be implemented
            }

            @Override
            public void onNext(Integer integer) {
                System.out.println("Received: " + integer);
            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();
            }

            @Override
            public void onComplete() {
                System.out.println("Done!");
            }
        };

        source.map(String::length).filter(i -> i >= 5)
                .subscribe(myObserver);

        source.map(String::length).subscribe(s -> System.out.println("observer 2 received: " + s));

        // 'cold' observable serves the same data continually (or the same SQL query for example, even if the underlying
        // data changes
    }
}
