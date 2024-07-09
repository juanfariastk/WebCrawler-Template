import model.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            NewsCrawler g1Crawler = new G1Crawler();
            g1Crawler.collectNews("Title1", "g1_news.txt");

            NewsCrawler uolCrawler = new UOLCrawler();
            uolCrawler.collectNews("Title3", "uol_news.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
