package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.io.IOException;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.Hits;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.TermQuery;
import org.apache.struts2.ServletActionContext;
public class RedirectToHomePageAction extends ActionSupport{
	/**
	 * author: wjc
	 */
	
	//public static String INDEX_PATH = "index";
	//redirect to home page
	public String execute(){
		/**
		 * wjc
		 * test lucene
		 */
//		String INDEX_PATH = ServletActionContext.getServletContext().getRealPath("/")+"index";
//		IndexWriter writer;
//		try {
//			writer = new IndexWriter(INDEX_PATH,new StandardAnalyzer(), true);
//			Document doc = new Document();
//			Field f1 = new Field("a","a1",Field.Store.YES,Field.Index.TOKENIZED);
//			doc.add(f1);
//			writer.addDocument(doc);
//			writer.close();
//			
//			IndexSearcher searcher = new IndexSearcher(INDEX_PATH);
//			Term term = new Term("a","a1");
//			TermQuery query = new TermQuery(term);
//			
//			Hits hits = searcher.search(query);
//			for(int i=0;i<hits.length();i++) {
//				System.out.println(hits.doc(i));
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println(INDEX_PATH);
		
		return SUCCESS;
	}
}
