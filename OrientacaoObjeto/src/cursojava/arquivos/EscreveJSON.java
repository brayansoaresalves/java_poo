package cursojava.arquivos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class EscreveJSON {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Usuario u1 = new Usuario();
		u1.setLogin("usuario1");
		u1.setSenha("123456");
		u1.setCpf("357.654.930-76");
		u1.setNome("Ruxonu");
		
		Usuario u2 = new Usuario();
		u2.setLogin("usuario2");
		u2.setSenha("12345678");
		u2.setCpf("402.765.890-68");
		u2.setNome("Tuhel");
		
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.addAll(Arrays.asList(u1, u2));
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String jsonUser = gson.toJson(usuarios);
		
		System.out.println(jsonUser);
		
		FileWriter fileWriter = new FileWriter("C:\\\\Users\\\\guilhermem\\\\Documents\\\\arquivoJSON.json");
		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
		
		/*------------------------------- escrevendo arquivo -------------------------------------*/
		FileReader fileReader = new FileReader("C:\\Users\\guilhermem\\Documents\\arquivoJSON.json");
		JsonArray jsonArray = (JsonArray)JsonParser.parseReader(fileReader);
		
		List<Usuario> users = new ArrayList<>();
		
		for (JsonElement jsonElement : jsonArray) {
			
			Usuario user = new Gson().fromJson(jsonElement, Usuario.class);
			users.add(user);
			
		}
		
		System.out.println("Leitura do Arquivo JSON: " + users);

	}

}
