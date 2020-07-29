package br.gov.sp.fatec.anime.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import br.gov.sp.fatec.anime.entity.Anime;
import br.gov.sp.fatec.anime.repository.AnimeRepository;
import br.gov.sp.fatec.anime.service.AnimeService;

@RestController
@RequestMapping(value = "/anime")  // 2A
@CrossOrigin
public class AnimeController {
	@Autowired
	private AnimeService animeService;

	@Autowired
	private AnimeRepository animeRepo;

	@PostMapping(value = "/novo")
	@JsonView(View.AnimeCompleto.class)
	public Anime cadastrarAnime(@RequestBody AnimeDTO anime) {
		return animeService.adicionarAnime(anime.getUsuario(), anime.getAnimeNome(), anime.getAnimePersonagem());
	}

	@GetMapping(value = "/busca/{charUsr}")  // 1B
	@JsonView(View.AnimeCompleto.class)
	public List<Anime> findByCharUsrNomeOrCharUsrEmail(@PathVariable("charUsr") String charUsr) {
		return animeRepo.findByCharUsrNomeOrCharUsrEmail(charUsr, charUsr);
	}

	@PostMapping(value = "/update/{animeId}")
	@JsonView(View.AnimeCompleto.class)
	public Anime updateAnime(@RequestBody AnimeDTO anime, @PathVariable("animeId") Long animeId) {
		return animeService.alterarPersonagens(anime.getUsuario(), animeId, anime.getAnimeNome(), anime.getAnimePersonagem());
	}

}