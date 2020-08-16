package argssearch;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;


public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    /* TODO: Extract args; Idea:
        First Arg = JDBC URL for Docker => IMPORTANT: Credentials moved to db.properties file
        Second Arg = Query Input path
        Third Arg = Query Output path
    */
    public static void main(String[] args) throws IOException {
        logger.info("Starting ArgsSearch...");
        Demo demo = new Demo();
        demo.demonstrate();

        //Indexer.index(c,TokenCachePool.getInstance().getDefault());
        //TFIDFWeighter.weigh();
        /*
        ConjunctiveRetrieval a = new ConjunctiveRetrieval(c, TokenCachePool.getInstance().getDefault(),
                new ArgumentIndexTable());;
        a.execute("fighter", 0,1);
        a.execute("freedom", 0,1);


         */
        //ConjunctiveRetrieval b = new ConjunctiveRetrieval(c, TokenCachePool.getInstance().getDefault(),
        //       new PremiseIndexTable());;
        //b.execute("Eichhornchen", 0,1);
        //b.execute("Affe", 0,1);
/*

        ConjunctiveRetrieval d = new ConjunctiveRetrieval(c, TokenCachePool.getInstance().getDefault(),
                new DiscussionIndexTable());
        //d.execute("Gandalf", 0,1);
        d.execute("Sauron", 0,1);


 */
/*
        DisjunctiveRetrieval a = new DisjunctiveRetrieval(c, TokenCachePool.getInstance().getDefault(),
                new ArgumentIndexTable());;
        a.execute("fighter", 0,1);
        a.execute("freedom", 0,1);



        DisjunctiveRetrieval b = new DisjunctiveRetrieval(c, TokenCachePool.getInstance().getDefault(),
               new PremiseIndexTable());;
        b.execute("Eichhornchen", 0,1);
        b.execute("Affe", 0,1);


        DisjunctiveRetrieval d = new DisjunctiveRetrieval(c, TokenCachePool.getInstance().getDefault(),
                new DiscussionIndexTable());
        d.execute("Gandalf", 0,1);
        d.execute("Sauron", 0,1);


 */
/*
        PhraseRetrieval a = new PhraseRetrieval(c, TokenCachePool.getInstance().getDefault(),
                new ArgumentIndexTable());;
        a.execute("fighter", 0,1);
        a.execute("freedom", 0,1);



        PhraseRetrieval b = new PhraseRetrieval(c, TokenCachePool.getInstance().getDefault(),
                new PremiseIndexTable());;
        b.execute("Eichhornchen", 0,1);
        b.execute("Affe", 0,1);


        PhraseRetrieval d = new PhraseRetrieval(c, TokenCachePool.getInstance().getDefault(),
                new DiscussionIndexTable());
        d.execute("Gandalf", 0,1);
        d.execute("Sauron", 0,1);


 */
//        ConjunctiveRetrievalOnAllTables a = new ConjunctiveRetrievalOnAllTables(c, TokenCachePool.getInstance().getDefault());;
//        a.execute("fighter", 0,0,0,1,1,1,10,10,10,10);
//        a.execute("freedom", 0,0,0,1,1,1,10,10,10,10);
//
//
//
//        DisjunctiveRetrievalOnAllTables b = new DisjunctiveRetrievalOnAllTables(c, TokenCachePool.getInstance().getDefault());
//        b.execute("Eichhornchen", 0,0,0,1,1,1,10,10,10,10);
//        b.execute("Affe", 0,0,0,1,1,1,10,10,10,10);
//
//
//        PhraseRetrievalOnAllTables d = new PhraseRetrievalOnAllTables(c, TokenCachePool.getInstance().getDefault());
//        d.execute("Gandalf", 0,0,0,1,1,1,10,10,10,10);
//        d.execute("Sauron", 0,0,0,1,1,1,10,10,10,10);
    }
}
