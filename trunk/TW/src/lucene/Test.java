package lucene;

import java.io.IOException;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.search.IndexSearcher;
import org.apache.struts2.ServletActionContext;

public class Test {
	public static String INDEX_PATH = "TW/index";
		
	public static void main(String[] args) throws IOException {
		IndexWriter writer = new IndexWriter(INDEX_PATH,new StandardAnalyzer(), true);
		Document doc = new Document();
		Field f1 = new Field("a","a1",Field.Store.YES,Field.Index.TOKENIZED);
		doc.add(f1);
		writer.addDocument(doc);
		writer.close();
		
	
	}
}
