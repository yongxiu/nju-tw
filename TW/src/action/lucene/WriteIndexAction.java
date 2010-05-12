package action.lucene;

import org.apache.lucene.index.Term;
import org.apache.lucene.search.Hits;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.PhraseQuery;
import org.apache.lucene.search.TermQuery;
import org.apache.struts2.ServletActionContext;

import service.LuceneIndexWriter;

import com.opensymphony.xwork2.ActionSupport;

public class WriteIndexAction extends ActionSupport{

	
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		String INDEX_PATH = ServletActionContext.getServletContext().getRealPath("/")+"index";
		
		LuceneIndexWriter.initalIndex(INDEX_PATH);
		System.out.println(INDEX_PATH);
		
		IndexSearcher searcher = new IndexSearcher(INDEX_PATH);
		PhraseQuery query = new PhraseQuery();
		Term t1 = new Term("title", "南");
		Term t2 = new Term("title", "大");
		query.add(t1);
		query.add(t2);
		
		
		Hits hits = searcher.search(query);
		for (int i = 0; i < hits.length(); i++) {
			System.out.println(hits.doc(i));
		}
		
		return SUCCESS;
	}
	
	
	
}
