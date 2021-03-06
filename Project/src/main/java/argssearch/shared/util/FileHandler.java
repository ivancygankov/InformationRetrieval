package argssearch.shared.util;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileHandler {

    public String getResourceAsString(final String relativeResource) throws IOException {
        return streamToString(getResourceAsStream(relativeResource));
    }

    public Stream<String> getResourceAsStringStream(final String relativeResource) {
        return streamToStringStream(getResourceAsStream(relativeResource));
    }

    public InputStream getResourceAsStream(final String relativeResource) {
        return getClass().getResourceAsStream(relativeResource);
    }

    public String streamToString(final InputStream is) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            return br.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            throw new IOException("Cannot read InputStream.", e);
        }
    }

    public Stream<String> streamToStringStream(final InputStream is) {
        return new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8)).lines();
    }
}
