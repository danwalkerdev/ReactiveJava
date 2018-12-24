package com.danelius.Reactive.first;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

public class HotObservablerRunner {

    public static void main(String[] args) {
        // publish is the key method to make this connectable observable
        ConnectableObservable<String> source = Observable.just("alpha", "beta", "gamma", "delta", "epsilon").publish();

        source.subscribe(s -> System.out.println("Observer 1: " + s));

        source.map(String::length).subscribe(i -> System.out.println("Observer 2: " + i));

        // connects and starts broadcasting!
        source.connect();

        // known as multicasting, which will be discussed/implemented later

        // in contrast to other examples, this is like a 'hot' observable - any subscriptions made later will miss
        // the previous emissions


    }
}
