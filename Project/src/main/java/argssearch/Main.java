package argssearch;


import argssearch.acquisition.Acquisition;
import argssearch.shared.db.ArgDB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        // Start with a new, clean schema
        ArgDB.getInstance().dropAll();
        ArgDB.getInstance().createSchema();

        ExecutorService es = Executors.newCachedThreadPool();

        Acquisition.exec("/home/ivan/Downloads/parliamentary.json", new LinkedBlockingDeque<>(16), es);
        //Acquisition.exec("/home/ivan/Downloads/debateorg.json", new LinkedBlockingDeque<>(16), es);
    }


}
