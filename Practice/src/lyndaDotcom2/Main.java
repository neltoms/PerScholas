package lyndaDotcom2;

public class Main {

	public static void main(String[] args) {

		Insect insect = new Insect(5, 6);
		Spider spider = new Spider(10, true);
		Cricket cricket = new Cricket(43, 1.2);
		
		insect.crawl();
		insect.says();
		spider.says();
		spider.crawl();
		cricket.crawl();
		cricket.says();
		



	}

}
