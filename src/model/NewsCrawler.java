package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public abstract class NewsCrawler {

    //forma de coleta
    public final void collectNews(String keyword, String outputPath) throws IOException {
        String rawData = fetchData();
        List<String> linksAndTitles = parseData(rawData);
        List<String> filteredLinksAndTitles = filterLinksByKeyword(linksAndTitles, keyword);
        saveData(filteredLinksAndTitles, outputPath);
    }

    // forma de busca (fetch de dados da api)
    protected abstract String fetchData() throws IOException;

    // transforma o dado recebido
    protected abstract List<String> parseData(String rawData);

    //filtrar dados
    private List<String> filterLinksByKeyword(List<String> linksAndTitles, String keyword) {
        return linksAndTitles.stream()
                .filter(item -> item.toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    private void saveData(List<String> data, String outputPath) throws IOException {
        Path path = Paths.get(outputPath);
        Files.write(path, data);
    }
}

