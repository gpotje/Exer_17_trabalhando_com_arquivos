import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Porgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Produto> list  = new ArrayList<Produto>();
		
		//System.out.println("Enter a folder path: ");
		// sc.nextLine();
		
		String strPath ="C:\\Users\\GpotjeDesk\\Documents\\arq.csv";
		boolean success = new File("C:\\Users\\GpotjeDesk\\Documents\\out").mkdir();
		String NewstrPath =  "C:\\Users\\GpotjeDesk\\Documents\\out\\summry.csv";
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(strPath))){
			
			String line = br.readLine();
			while(line != null ){
				String[] vect  = line.split(",");
				
				String nome = vect[0];
				Double preco = Double.parseDouble(vect[1]);
				int quant =  Integer.parseInt(vect[2]);
				
				list.add(new Produto(nome, preco, quant));
				
				line = br.readLine();
				
			}
			System.out.println("Sucesso em ler o arquivo arq.csv");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(NewstrPath))){
			
			for(Produto item  : list ){
				bw.write(item.getNome() + ", " + String.format("%.2f", item.soma()));
				bw.newLine();
				
			}
			System.out.println("Sucesso em criar o novo arquivo Summy.csv");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
