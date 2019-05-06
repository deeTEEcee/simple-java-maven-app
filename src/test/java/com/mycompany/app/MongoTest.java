package com.mycompany.app;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import com.mongodb.client.MongoClients;
import com.mongodb.client.*;
import com.mongodb.client.MongoClient;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class MongoTest
{

    @Test
    public void testBasicMongo() {
         MongoClient mongoClient = MongoClients.create();
         MongoDatabase db = mongoClient.getDatabase("javatestdb");
    }

}
