package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class JsoupComponent {
    public static void parse(String url) throws IOException {
        //가져오고자 하는 URL 설정
        String URL = "https://auto.daum.net/newcar/model/mi6pMxpe4xz9";

        //해당 URL의 요소 가져온다
        Document doc = Jsoup.connect(URL).get();

        Elements elements = doc.select(".data_price");

        for( Element element : elements ) {
            System.out.println(element.text());
        }
    }
}
