package com.danelius.Reactive;

import io.reactivex.Observable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

public class LambdaRunner {

    public static void main(String[] args) {
        Consumer<Integer> onNext = i -> System.out.println("RECEIVED: " + i);
        Action onComplete = () -> System.out.println("Done");
        Consumer<Throwable> onError = Throwable::printStackTrace;

        Observable<String> source = Observable.just("one", "two", "three", "four", "five");

        source.map(String::length).filter(i -> i > 3)
                .subscribe(onNext, onError, onComplete);
    }
}
