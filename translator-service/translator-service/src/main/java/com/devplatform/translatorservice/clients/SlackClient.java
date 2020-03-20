package com.devplatform.translatorservice.clients;

import feign.Param;
import feign.RequestLine;

public interface SlackClient {
	@RequestLine("GET " + "/seam/resource/rest/pje-legacy/processos/numero-processo/{numeroProcesso}/validar")
	public Integer validarAcessoAoProcesso(@Param("numeroProcesso") String numeroProcesso);
	
	@RequestLine("GET " + "/seam/resource/rest/pje-legacy/identity/auth")
	public String recuperarUsuarioPjeLegacy();
}
