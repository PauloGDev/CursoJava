package Classes;

public class DataTeste {

	
	public static void main(String[] args) {
		
		Data data1 = new Data();
		Data data2 = new Data(10, 11, 2004);
		
		//data1.ano = 2022;
		//data1.mes = 3;
		//data1.dia = 23;
		
		//data2.ano = 1986;
		//data2.mes = 12;
		//data2.dia = 24;
		
		System.out.printf("1� Data: %d/%s/%s! \n", data1.dia, data1.mes, data1.ano);
		System.out.printf("2� Data: %d/%s/%s!", data2.dia, data2.mes, data2.ano);
	}
}
