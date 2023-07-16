package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.cvsReader;

public interface Repo extends JpaRepository<cvsReader , Integer>{

	


	
	
	
////	@Query(value = "insert into cvs_reader (id,added,city,citylat,citylng,end_year,impact,insight,intensity,likelihood,pestle,published,region,relevance,sector,source,start_year,swot,title,topic,url)"
////			+ " values(id,'added','city','citylat','citylng','end_year','impact','insight','intensity','likelihood','pestle','published','region','relevance','sector','source','start_year',"
////			+ "'swot','title','topic','url');", nativeQuery=true)
//
//
//@Query(value = "insert into cvs_reader (id,added,city,citylat,citylng,end_year,impact,insight,intensity,likelihood,pestle,published,region,relevance,sector,source,start_year,swot,title,topic,url) values(id,added,city,citylat,citylng,end_year,impact,insight,intensity,likelihood,pestle,published,region,relevance,sector,source,start_year,swot,title,topic,url)", nativeQuery=true)
//	cvsReader saveAllData(int id, String added, String city, String citylat, String citylng, String end_year,
//			String impact, String insight, String intensity, String likelihood, String pestle, String published,
//			String region, String relevance, String sector, String source, String start_year, String swot, String title,
//			String topic, String url);
//
//	
////	@Query(value = "select * from student u where u.course_name = :courseName", nativeQuery=true)
	
}
