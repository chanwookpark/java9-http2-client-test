package jdk9;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.net.URI;

/**
 * JDK 기본 제공하는 HTTP 클라이언트의 초간단 테스트 (GET)
 * HTTP/2 Client(JEP-110)은 인큐베이터로 제공하는 API로 자바닥에 심지어 언제든지 삭제될 수 있다고 작성되어 있다...
 *
 * @see <a href="http://openjdk.java.net/jeps/110">JEP-110 스펙보기</a>
 * @see <a href="http://download.java.net/java/jdk9/docs/api/jdk/incubator/http/HttpClient.html">HttpClient Javadoc</a>
 */
public class Jdk9Http2ClientTest {

    public static void main(String[] args) throws Exception {

        System.out.println(">>>>> Start >>>>>");

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create("http://www.google.com"))
                .version(HttpClient.Version.HTTP_2)
                .GET().build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandler.asString());

        System.out.println(String.format("[Http response]\nHeader: %s\nBody: ", response.headers().map(), response.body()));
        System.out.println(">>>>> End >>>>>");
    }

}
