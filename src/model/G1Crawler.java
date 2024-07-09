package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class G1Crawler extends NewsCrawler {

    @Override
    protected String fetchData() throws IOException {
        return "dados obtidos da api";
    }

    @Override
    protected List<String> parseData(String rawData) {
        List<String> linksAndTitles = new ArrayList<>();
        linksAndTitles.add("link1 g1");
        linksAndTitles.add("link2 g1");
        return linksAndTitles;
    }
}

