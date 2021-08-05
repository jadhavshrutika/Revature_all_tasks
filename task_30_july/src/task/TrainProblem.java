package task;

public class TrainProblem {


	public void printStatment(Stations[] stations) {
		System.out.println("Yasvantpur Delhi Sarai Rohilla AC Duranto Express (12213)");
		System.out.println("-------------------------------------------");
		System.out.println("#  Code   Station           Arr.    Dep.");
		System.out.println("-------------------------------------------");
		for (int i = 0; i < stations.length; i++) {
			stations[i].printTable(i+1);;
		}
		System.out.println("-------------------------------------------");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stations[] station = {new Stations("YPR", "Yashvantpur Jn", 00.00, 23.40), 
							 new Stations("GTL", "Guntakal Jn", 03.45, 03.50), 
							 new Stations("SC", "Secundrabad Jn", 08.55, 09.10), 
							 new Stations("BPQ", "Balharshah", 13.10, 13.35),
							 new Stations("HPJ", "Habibganj", 21.20, 21.25),
							 new Stations("JHS", "Jhansi Jn", 01.15, 01.20),
							 new Stations("DEE", "Delhi S Rohilla", 07.00, 00.00)};
		
		TrainProblem t = new TrainProblem();
		t.printStatment(station);
	}
	
}

