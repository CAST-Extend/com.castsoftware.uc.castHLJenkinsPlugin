package com.castsoftware.restapi.pojo;

import java.util.List;

public class QualityIndicator {  
	   public int number;
	   public JsonDate date;
	   public Application application;
	   public SimpleReference applicationSnapshot;
	   public List<ApplicationResult> applicationResults;
}
