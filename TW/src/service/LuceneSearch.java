package service;

import java.io.IOException;

import jeasy.analysis.MMAnalyzer;

import org.apache.lucene.queryParser.ParseException;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.Hits;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;

public class LuceneSearch {
		/**
		 * wjc 
		 * usage: provide service of search
		 * @throws IOException 
		 * @throws ParseException 
		 */
	public static Hits search(String query,String path) throws IOException, ParseException {
		IndexSearcher searcher = new IndexSearcher(path);
		QueryParser parser = new QueryParser("title", new MMAnalyzer());
		Query q = parser.parse(query);
		Hits hits = searcher.search(q);
		return hits;
	}
}
