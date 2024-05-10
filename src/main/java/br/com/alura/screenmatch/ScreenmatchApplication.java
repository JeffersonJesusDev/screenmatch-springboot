package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.DadosEpisodio;
import br.com.alura.screenmatch.service.ConsumoAPI;
import br.com.alura.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoAPI = new ConsumoAPI();
		var json = consumoAPI.obterDados("https://www.omdbapi.com/?t=Loki&apikey=f25c06c4");
		//System.out.println(json);

		ConverteDados conversor = new ConverteDados();
		json = consumoAPI.obterDados("https://www.omdbapi.com/?t=Loki&Season=1&Episode=2&apikey=f25c06c4");
		System.out.println(json);
		json = consumoAPI.obterDados("https://www.omdbapi.com/?t=Loki&Season=1&Episode=2&apikey=f25c06c4");
		DadosEpisodio dadosEpisodio = conversor.obterDados(json, DadosEpisodio.class);
		System.out.println(dadosEpisodio);
	}

}
