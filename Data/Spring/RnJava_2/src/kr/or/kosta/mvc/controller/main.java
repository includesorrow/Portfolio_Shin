package kr.or.kosta.mvc.controller;
import java.util.List;
import java.util.*;

import org.rosuda.JRI.REXP;
import org.rosuda.JRI.Rengine;
import org.springframework.beans.factory.annotation.Autowired;

public class main {
	@Autowired
	public static void main(String[] args) {
		Rengine engine; 
	
	System.out.println("Creating Rengine (with arguments)");
	// If not started with --vanilla, funny things may happen in this R
	// shell.
	String[] Rargs = { "--vanilla" };
	
	//engine = new Rengine(Rargs, false, null);
	// System.out.println("Rengine created, waiting for R");
	// the engine creates R is a new thread, so we should wait until it's
	// ready
	//if (!engine.waitForR()) {
	//	System.out.println("Cannot load R");
	//	return;
	//}
	String rfilepath = "C:\\\\Program Files\\\\R\\\\R-3.3.1\\\\library\\\\Functions.R";
//	engine.eval("source(\"" + rfilepath + "\")");
System.out.println("END");
}}

