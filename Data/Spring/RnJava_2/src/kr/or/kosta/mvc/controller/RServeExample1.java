package kr.or.kosta.mvc.controller;

import org.rosuda.REngine.REXPMismatchException;
import org.rosuda.REngine.Rserve.RConnection;
import org.rosuda.REngine.Rserve.RserveException;

public class RServeExample1 {
	
	 public void read_file(String srcPath) throws RserveException, REXPMismatchException {
		 RConnection c = null;
		 	c = new RConnection();
	    	srcPath = srcPath.replaceAll("\\\\", "/");
	    	System.out.println(srcPath);
	        c.assign("src", srcPath);
	        
	        String extension = srcPath.substring(srcPath.length()-3, srcPath.length());
	        
	        // data reading        
	        if( extension.equals("csv")) {
	        	c.voidEval("movie=read_csv(\"C:/Users/KOSTA/Desktop/RData/tmdb_5000_movies.csv\",col_names=TRUE,na=\"NA\")");
	        } else{
	        	c.voidEval("movie=read_csv(\"C:/Users/KOSTA/Desktop/RData/tmdb_5000_movies.csv\",col_names=TRUE,na=\"NA\")");
	        }
	    }    
	    
	
	public static void main(String[] args) throws Exception {
		double[] myvalues = { 1.0, 1.5, 2.2, 0.5, 0.9, 1.12 };
		RConnection c = null;
		try {
			c = new RConnection();
			  c.eval("library(shiny)");
	           c.eval("library(ggplot2)");
	           c.eval("library(plyr)");
	           c.eval("library(dplyr)");
	           c.eval("library(tidyverse)");
	           c.eval("library(formattable)");
	           c.eval("library(splitstackshape)");
	           c.eval("library(jsonlite)");
	           c.eval("library(wordcloud)");
	           c.eval("library(RColorBrewer)");
	           c.eval("library(ggthemes)");
	           c.eval("library(tm)");
	           c.eval("library(RSentiment)");
	           c.eval("library(zoo)");
	           c.eval("library(stringr)");
	          
	        
	           // data reading        
	        
	           
	           
	           
			c.assign("myvalues", myvalues);
				} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (c != null) {
				try {
					c.close();
				} finally {
				}
			}
		}

		
		System.out.println("¼º°ø");
	}
}
