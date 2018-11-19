package org.nmu.sau.lab.five;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class MatrixRW {
    private static Gson gson = new Gson();

    public static Matrix read(String path) throws IOException {
        return gson.fromJson(new FileReader(path), Matrix.class);
    }

    public static void write(Matrix m, String path) throws IOException {
        Writer writer = new FileWriter(path);
        gson.toJson(m, writer);
        writer.flush();
        writer.close();
    }
}
