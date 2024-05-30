package DesafioControleFluxo;

public class ParametrosInvalidosException extends RuntimeException {
	  ParametrosInvalidosException() {
	    super("O segundo par\u00E2metro deve ser maior que o primeiro.");
	  }
	}
