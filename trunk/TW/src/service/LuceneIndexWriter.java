package service;

import java.io.IOException;
import java.util.ArrayList;

import jeasy.analysis.MMAnalyzer;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.Term;

import bean.GenericArticle;
import dao.GenericArticleDao;

public class LuceneIndexWriter {
	public static void initalIndex(String path) throws IOException {
		IndexWriter writer = new IndexWriter(path, new MMAnalyzer(), true);
		Document doc = null;
		Field f1 = null;
		Field f2 = null;
		Field f3 = null;
		Field f4 = null;
		Field f5 = null;
		GenericArticleDao articleDao = new GenericArticleDao();
		ArrayList<GenericArticle> articles = (ArrayList<GenericArticle>) articleDao.getAllEntity();
		for(GenericArticle article:articles) {
			doc = new Document();
			f1 = new Field("id",article.getId()+"",Field.Store.YES,Field.Index.UN_TOKENIZED);
			f2 = new Field("title",article.getTitle(),Field.Store.YES,Field.Index.TOKENIZED);
			f3 = new Field("content",article.getContent(),Field.Store.YES,Field.Index.TOKENIZED);
			f4 = new Field("category", Category.getCategory(article.getCategory()), Field.Store.YES,Field.Index.TOKENIZED);
			f5 = new Field("date", article.getDate().toString(), Field.Store.YES, Field.Index.UN_TOKENIZED);
			doc.add(f1);
			doc.add(f2);
			doc.add(f3);
			doc.add(f4);
			doc.add(f5);
			writer.addDocument(doc);
		}
		writer.close();
	}
	
	public static void updateIndex(String path,GenericArticle article) throws IOException {
		IndexWriter writer = new IndexWriter(path, new MMAnalyzer(), false);
		Document doc = new Document();
		Field f1 = new Field("id",article.getId()+"",Field.Store.YES,Field.Index.UN_TOKENIZED);
		Field f2 = new Field("title",article.getTitle(),Field.Store.YES,Field.Index.TOKENIZED);
		Field f3 = new Field("content",article.getContent(),Field.Store.YES,Field.Index.TOKENIZED);
		Field f4 = new Field("category", Category.getCategory(article.getCategory()), Field.Store.YES,Field.Index.TOKENIZED);
		Field f5 = new Field("date", article.getDate().toString(), Field.Store.YES, Field.Index.UN_TOKENIZED);
		doc.add(f1);
		doc.add(f2);
		doc.add(f3);
		doc.add(f4);
		doc.add(f5);
		writer.addDocument(doc);
		writer.close();
	}
	
	public static void deleteIndex(String path,GenericArticle article) throws IOException{
		//将document放入回收站
		IndexReader reader = IndexReader.open(path);
		Term term = new Term("id", article.getId()+"");
		System.out.println("before"+reader.numDocs());
		reader.deleteDocuments(term);
		reader.close();
		
		//真正删除
		IndexWriter writer = new IndexWriter(path, new MMAnalyzer(), false);
		writer.optimize();
		writer.close();
		
		reader = IndexReader.open(path);
		System.out.println("after"+reader.numDocs());
	}
	
}
