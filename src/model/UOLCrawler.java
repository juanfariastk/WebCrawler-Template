package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UOLCrawler extends NewsCrawler {

    @Override
    protected String fetchData() throws IOException {
        return "dados obtidos pela api";
    }

    @Override
    protected List<String> parseData(String rawData) {
        List<String> linksAndTitles = new ArrayList<>();
        linksAndTitles.add("link3 uol1");
        linksAndTitles.add("link4 uol2");
        return linksAndTitles;
    }
}

