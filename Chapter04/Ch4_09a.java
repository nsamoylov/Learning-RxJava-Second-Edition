import io.reactivex.rxjava3.core.Observable;

public class Ch4_09a {
    public static void main(String[] args) {
        Observable<String> src1 = Observable.just("Alpha", "Beta");
        Observable<String> src2 = Observable.just("Zeta", "Eta");
        src1.concatWith(src2)
            .subscribe(i -> System.out.println("RECEIVED: " + i));
    }
}
