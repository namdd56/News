package nam.utility;


import nam.news.*;

public class Variables {
	public static final String[] PAPER = {"Dan Tri", "24h"};
	public static final int[] ICONS = {R.drawable.dantri, R.drawable.h4h};
	
	//Dan tri
	public static final String[] Dt_categories = {"Trang chu", "Xa hoi"};
	public static final String[] Dt_links = {"http://www.dantri.com.vn/trangchu.rss", 
											 "http://www.dantri.com.vn/xa-hoi.rss"};
	
	//24h
	public static final String[] h4h_categories = {"Tin tuc trong ngay", "Bong da"};
	public static final String[] h4h_links = {"http://www.24h.com.vn/upload/rss/tintuctrongngay.rss",
											  "http://www.24h.com.vn/upload/rss/bongda.rss"};
	
	//
	public static final String[][] categories = {Dt_categories, h4h_categories};
	public static final String[][] links = {Dt_links, h4h_links};
	
	public static final String PA = "paper";
}
