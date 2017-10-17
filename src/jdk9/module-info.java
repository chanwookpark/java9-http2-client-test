/**
 * httpclient를 사용하기 위해서는 모듈을 등록해주어야 함
 *
 * http://cr.openjdk.java.net/~mr/jigsaw/ea/module-summary.html
 *
 */
module jdk9 {
    requires jdk.incubator.httpclient;
}