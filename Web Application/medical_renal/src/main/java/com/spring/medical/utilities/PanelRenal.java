package com.spring.medical.utilities;

import java.util.ArrayList;
import java.util.List;

import com.spring.medical.model.Exam;

public class PanelRenal {

	/**
	 * return initial parameters for panel
	 * 
	 * @param exam
	 * @return exam object
	 */
	public Exam getExam(Exam exam) {

		switch (exam.getCode()) {
		case "2345-7":
			exam.setDisplayCode("Glucose [Mass/volume] in Serum or Plasma");
			exam.setCode("2345-7");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/2345-7.html?sections=Comprehensive");
			exam.setLow("74");
			exam.setHigh("106");
			exam.setUnit("mg/dL");
			break;
		case "3094-0":
			exam.setDisplayCode("Urea nitrogen [Mass/volume] in Serum or Plasma");
			exam.setCode("3094-0");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/3094-0.html?sections=Comprehensive");
			exam.setLow("10");
			exam.setHigh("20");
			exam.setUnit("mg/mL");
			break;
		case "2160-0":
			exam.setDisplayCode("Creatinine [Mass/volume] in Serum or Plasma	");
			exam.setCode("2160-0");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/2160-0.html?sections=Comprehensive");
			exam.setLow("0");
			exam.setHigh("1.5");
			exam.setUnit("mg/dL");
			break;
		case "3097-3":
			exam.setDisplayCode("Urea nitrogen/Creatinine [Mass Ratio] in Serum or Plasma");
			exam.setCode("3097-3");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/3097-3.html?sections=Comprehensive");
			exam.setLow("6");
			exam.setHigh("22");
			exam.setUnit("mg/mg");
			break;
		case "33914-3":
			exam.setDisplayCode(
					"Glomerular filtration rate/1.73 sq M.predicted [Volume Rate/Area] in Serum or Plasma by Creatinine-based formula (MDRD)");
			exam.setCode("33914-3");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/33914-3.html?sections=Comprehensive");
			exam.setUnit("mL/min/{1.73_m2}");
			break;
		case "50044-7":
			exam.setDisplayCode(
					"Glomerular filtration rate/1.73 sq M predicted among females [Volume Rate/Area] in Serum or Plasma by Creatinine-based formula (MDRD)");
			exam.setCode("50044-7");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/50044-7.html?sections=Comprehensive");
			exam.setUnit("mL/min/{1.73_m2}");
			break;
		case "48642-3":
			exam.setDisplayCode(
					"Glomerular filtration rate/1.73 sq M predicted among non-blacks [Volume Rate/Area] in Serum or Plasma by Creatinine-based formula (MDRD)");
			exam.setCode("48642-3");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/48642-3.html?sections=Comprehensive");
			exam.setLow("60");
			exam.setHigh("inf");
			exam.setUnit("mL/min/{1.73_m2}");
			break;
		case "48643-1":
			exam.setDisplayCode(
					"Glomerular filtration rate/1.73 sq M predicted among blacks [Volume Rate/Area] in Serum or Plasma by Creatinine-based formula (MDRD)	");
			exam.setCode("48643-1");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/48643-1.html?sections=Comprehensive");
			exam.setLow("60");
			exam.setHigh("inf");
			exam.setUnit("mL/min/{1.73_m2}");
			break;
		case "17861-6":
			exam.setDisplayCode("Calcium [Mass/volume] in Serum or Plasma");
			exam.setCode("17861-6");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/17861-6.html?sections=Comprehensive");
			exam.setLow("9");
			exam.setHigh("10.5");
			exam.setUnit("mg/dL");
			break;
		case "2777-1":
			exam.setDisplayCode("Phosphate [Mass/volume] in Serum or Plasma");
			exam.setCode("2777-1");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/2777-1.html?sections=Comprehensive");
			exam.setLow("2.5");
			exam.setHigh("4.5");
			exam.setUnit("mg/dL");
			break;
		case "1751-7":
			exam.setDisplayCode("Albumin [Mass/volume] in Serum or Plasma");
			exam.setCode("1751-7");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/1751-7.html?sections=Comprehensive");
			exam.setLow("3.5");
			exam.setHigh("5.5");
			exam.setUnit("g/dL");
			break;
		case "2951-2":
			exam.setDisplayCode("Sodium [Moles/volume] in Serum or Plasma");
			exam.setCode("2951-2");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/2951-2.html?sections=Comprehensive");
			exam.setLow("136");
			exam.setHigh("145");
			exam.setUnit("mmol/L");
			break;
		case "2823-3":
			exam.setDisplayCode("Potassium [Moles/volume] in Serum or Plasma");
			exam.setCode("2823-3");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/2823-3.html?sections=Comprehensive");
			exam.setLow("3.5");
			exam.setHigh("5.0");
			exam.setUnit("mmol/L");
			break;
		case "2075-0":
			exam.setDisplayCode("Chloride [Moles/volume] in Serum or Plasma	");
			exam.setCode("2075-0");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/2075-0.html?sections=Comprehensive");
			exam.setLow("98");
			exam.setHigh("106");
			exam.setUnit("mmol/L");
			break;
		case "2028-9":
			exam.setDisplayCode("Carbon dioxide, total [Moles/volume] in Serum or Plasma");
			exam.setCode("2028-9");
			exam.setSystemCode("");
			exam.setLow("21");
			exam.setHigh("30");
			exam.setUnit("mmol/L");
			break;
		case "33037-3":
			exam.setDisplayCode("Anion gap in Serum or Plasma");
			exam.setCode("33037-3");
			exam.setSystemCode("https://r.details.loinc.org/LOINC/33037-3.html?sections=Comprehensive");
			exam.setLow("7");
			exam.setHigh("16");
			exam.setUnit("mmol/L");
			break;
		}
		return exam;
	}

	public List<String> listExam() {
		List<String> listExam = new ArrayList<>();
		listExam.add("2345-7");
		listExam.add("3094-0");
		listExam.add("2160-0");
		listExam.add("3097-3");
		listExam.add("33914-3");
		listExam.add("50044-7");
		listExam.add("48642-3");
		listExam.add("48643-1");
		listExam.add("17861-6");
		listExam.add("2777-1");
		listExam.add("1751-7");
		listExam.add("2951-2");
		listExam.add("2823-3");
		listExam.add("2075-0");
		listExam.add("2028-9");
		listExam.add("33037-3");
		return listExam;
	}

}
