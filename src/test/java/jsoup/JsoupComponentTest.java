package jsoup;

import org.junit.jupiter.api.Test;

import java.io.IOException;

class JsoupComponentTest {
    @Test
    void parse() throws IOException {
        String url = "https://blog.naver.com/d_d_o_l_/223087986925";

        JsoupComponent.parse(url);
    }
}