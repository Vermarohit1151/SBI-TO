package com.example.demo;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractPdfView;
import com.example.demo.layer2.Flight;
import com.example.demo.layer4.FlightService;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

@Component
public class FlightPDFView extends AbstractPdfView{
	
	@Autowired
	FlightService flightService;

	@Override
	protected void buildPdfDocument(Map<String, Object>model,
			Document document, 
			PdfWriter writer,
			HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		List<Flight> flightDetails = flightService.listAllFlightService();
		for(Flight flightObj : flightDetails) {
			document.add(new Paragraph(flightObj.toString()));
		}
	}
	
	

}
