package service;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.index.IndexWriter;

import bean.GenericArticle;
import dao.GenericArticleDao;

public class LuceneIndexWriter {
	public static void initalIndex(String path) throws IOException {
		IndexWriter writer = new IndexWriter(path, new StandardAnalyzer(), true);
		Document doc = null;
		Field f1 = null;
		Field f2 = null;
		Field f3 = null;
		GenericArticleDao articleDao = new GenericArticleDao();
		ArrayList<GenericArticle> articles = (ArrayList<GenericArticle>) articleDao.getAllEntity();
		for(GenericArticle article:articles) {
			doc = new Document();
			f1 = new Field("id",article.getId()+"",Field.Store.YES,Field.Index.UN_TOKENIZED);
			f2 = new Field("title",article.getTitle(),Field.Store.YES,Field.Index.TOKENIZED);
			f3 = new Field("content",article.getContent(),Field.Store.YES,Field.Index.TOKENIZED);
			doc.add(f1);
			doc.add(f2);
			doc.add(f3);
			writer.addDocument(doc);
		}
		writer.close();
	}
	
	public static void updateIndex(String path,GenericArticle article) throws IOException {
		IndexWriter writer = new IndexWriter(path, new StandardAnalyzer(), false);
		Document doc = new Document();
		Field f1 = new Field("id",article.getId()+"",Field.Store.YES,Field.Index.UN_TOKENIZED);
		Field f2 = new Field("title",article.getTitle(),Field.Store.YES,Field.Index.TOKENIZED);
		Field f3 = new Field("content",article.getContent(),Field.Store.YES,Field.Index.TOKENIZED);
		doc.add(f1);
		doc.add(f2);
		doc.add(f3);
		writer.addDocument(doc);
		writer.close();
	}
}
