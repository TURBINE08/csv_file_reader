package com.example.demo.readfile;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.cvsReader;
import com.example.demo.repo.Repo;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

@RestController
public class ReadCSVdata {

	@Autowired
	private cvsReader cvsReader;

	@Autowired
	private Repo repo;

	@PostMapping("/readData")
	public cvsReader getdata() throws CsvValidationException, IOException {
		CSVReader reader = new CSVReader(new FileReader("C:\\Users\\rahul\\Downloads\\Dataa.csv"));
		String data[];
		data = reader.readNext();
		System.err.println(Arrays.toString(data));
		int x = 1;
		cvsReader rtn = null;
		while ((data = reader.readNext()) != null) {
			for (int i = 0; i < data.length; i++) {
				if (i == 0) {
					String data0 = String.valueOf(data[i]);
					cvsReader.setEnd_year(data0);
				}
				if (i == 1) {
					String data1 = String.valueOf(data[i]);
					cvsReader.setCitylng(data1);
				}
				if (i == 2) {
					String data2 = String.valueOf(data[i]);
					cvsReader.setCitylat(data2);
				}
				if (i == 3) {
					String data3 = String.valueOf(data[i]);
					cvsReader.setIntensity(data3);
				}
				if (i == 4) {
					String data4 = String.valueOf(data[i]);
					cvsReader.setSector(data4);
				}
				if (i == 5) {
					String data5 = String.valueOf(data[i]);
					cvsReader.setTopic(data5);
				}
				if (i == 6) {
					String data6 = String.valueOf(data[i]);
					cvsReader.setInsight(data6);
				}
				if (i == 7) {
					String data7 = String.valueOf(data[i]);
					cvsReader.setSwot(data7);
				}
				if (i == 8) {
					String data8 = String.valueOf(data[i]);
					cvsReader.setUrl(data8);
				}
				if (i == 9) {
					String data9 = String.valueOf(data[i]);
					cvsReader.setRegion(data9);
				}
				if (i == 10) {
					String data10 = String.valueOf(data[i]);
					cvsReader.setStart_year(data10);
				}
				if (i == 11) {
					String data11 = String.valueOf(data[i]);
					cvsReader.setImpact(data11);
				}
				if (i == 12) {
					String data12 = String.valueOf(data[i]);
					cvsReader.setAdded(data12);
				}
				if (i == 13) {
					String data13 = String.valueOf(data[i]);
					cvsReader.setPublished(data13);
				}
				if (i == 14) {
					String data14 = String.valueOf(data[i]);
					cvsReader.setCity(data14);
				}
				if (i == 15) {
					String data15 = String.valueOf(data[i]);
					cvsReader.setRelevance(data15);
				}
				if (i == 16) {
					String data16 = String.valueOf(data[i]);
					cvsReader.setPestle(data16);
				}
				if (i == 17) {
					String data17 = String.valueOf(data[i]);
					cvsReader.setSource(data17);
				}
				if (i == 18) {
					String data18 = String.valueOf(data[i]);
					cvsReader.setTitle(data18);
				}
				if (i == 19) {
					String data19 = String.valueOf(data[i]);
					cvsReader.setLikelihood(data19);
				}
			}
			cvsReader.setId(x);
			System.err.println(cvsReader.getId());
			rtn = repo.save(cvsReader);
			System.err.println(x);
			x++;
		}
		return rtn;
	}

	@GetMapping("/gett/all/data")
	public java.util.List<com.example.demo.model.cvsReader> getldata() {
		java.util.List<com.example.demo.model.cvsReader> rtn = repo.findAll();
		return rtn;

	}

}
