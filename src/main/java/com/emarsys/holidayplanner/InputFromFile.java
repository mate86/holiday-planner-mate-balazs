package com.emarsys.holidayplanner;

import java.util.Map;

public class InputFromFile implements InputReader {
    private String filePath;

    public InputFromFile(String fileName) {
        this.filePath = fileName;
    }

    @Override
    public Map readInput() {
        return null;
    }
}
