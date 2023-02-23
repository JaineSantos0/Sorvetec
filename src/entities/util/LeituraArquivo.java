package entities.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Cliente;
import entities.Produto;
import entities.SorvetePersonalizado;

public class LeituraArquivo {

	public List<Produto> sorveteMassa() {

		String pathSorveteMassa = "c:\\temp\\sorvete-massa.csv";
		List<Produto> sorveteMassaList = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(pathSorveteMassa))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");

				sorveteMassaList.add(new Produto(Long.parseLong(fields[0]), fields[1], fields[2], fields[3],
						Double.parseDouble(fields[4])));
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		return sorveteMassaList;
	}

	public List<Produto> picole() {

		String pathPicole = "c:\\temp\\picole.csv";
		List<Produto> picoleList = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(pathPicole))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");

				picoleList.add(new Produto(Long.parseLong(fields[0]), fields[1], fields[2], fields[3],
						Double.parseDouble(fields[4])));
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		return picoleList;

	}

	public List<Produto> adicionais() {

		String pathadicionais = "c:\\temp\\adicionais.csv";
		List<Produto> adicionaisList = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(pathadicionais))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");

				adicionaisList.add(new Produto(Long.parseLong(fields[0]), fields[1], fields[2], fields[3],
						Double.parseDouble(fields[4])));
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return adicionaisList;

	}

	public List<Produto> sorvetePersonalizado() {

		String pathSorvetePersonalizado = "c:\\temp\\sorvete-personalizado.csv";
		List<Produto> sorvetePersonalizadoList = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(pathSorvetePersonalizado))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");

				sorvetePersonalizadoList.add(new SorvetePersonalizado(Long.parseLong(fields[0]), fields[1], fields[2],
						fields[3], Double.parseDouble(fields[4]), fields[5], fields[6], fields[7]));
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return sorvetePersonalizadoList;

	}

	public List<Cliente> cliente() {
	
	String pathCliente = "c:/temp/cliente.csv";
	List<Cliente> cliente = new ArrayList<>();

			try (BufferedReader br = new BufferedReader(new FileReader(pathCliente))) {

		String line = br.readLine();
		while (line != null) {
			String[] fields = line.split(",");

			cliente.add(new Cliente(Long.parseLong(fields[0]), fields[1], fields[2], fields[3],fields[4]));
			line = br.readLine();
		}
	} catch (IOException e) {
		System.out.println(e.getMessage());
	}
	return cliente;
	
}

}
