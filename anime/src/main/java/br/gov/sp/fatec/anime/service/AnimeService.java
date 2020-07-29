package br.gov.sp.fatec.anime.service;

import br.gov.sp.fatec.anime.entity.Anime;

public interface AnimeService {

	public Anime adicionarAnime(String identificadorUsuario, String animeNome, String animeChar);

	public Anime alterarPersonagens(String identificadorUsuario, Long identificadorAnime, String animeNome, String animeChar);

}