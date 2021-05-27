package com.java.pruebas.domain;

import java.util.Optional;

import com.java.pruebas.businessLogic.MovieSearchBusiness;

public class App {
	
	private static MovieSearchBusiness movieSearchBusiness;
	
	public static void searchMovieControlledBySwitchDefaultNull(MovieSearchBusiness movieSearchBusiness) {
		
		Movie movie1 = movieSearchBusiness.search(3);
		System.out.println("Movie 1: " + movie1.getTitle());
		
		Movie movie2 = movieSearchBusiness.search(20000);
		System.out.println("Movie2: " + movie2);
	}
	
	//Buscamos una película con un Optional
	public static void searchMovieUsingOptional() {
		
		Optional<Movie> movie1 = MovieSearchBusiness.searchOptional(3);
		
		if(movie1.isPresent()) {
			System.out.println(movie1.get().getTitle());
		}else
			System.out.println("Movie 1 not found");
		
		Optional<Movie> movie2 = MovieSearchBusiness.searchOptional(20000);
		
		if(movie2.isPresent()) {
			System.out.println(movie2.get().getTitle());
		}else
			System.out.println("Movie 2 not found");
	}
	
	public static void searchMovieUsingOptionalForceFail() {
		
		Movie movie1 = movieSearchBusiness.searchOptional(2000).get();
		System.out.println(movie1.getTitle());
	}
	
	public static void searchMovieUsingNestedOptional() {
		
		Optional<Movie> optionalMovie = movieSearchBusiness.searchOptional(1);
		
		if(optionalMovie.isPresent()) {
			Optional<Director> dOp = optionalMovie.get().getDirector();
			if(dOp.isPresent()) {
				Optional<Address> optionalAddress = dOp.get().getAddress();
				if(optionalAddress.isPresent()) {
					System.out.println(optionalAddress.get().getCity());
				}
			}
		}
	}
	
	//Buscar película con flatmap y lambdas
	public static void searchMovieWithLambdaFlatMapAndMap() {
		
		Optional<Movie> optionalMovie = movieSearchBusiness.searchOptional(1);
		
		Optional<String> optionalCity = optionalMovie.flatMap(p -> p.getDirector()).flatMap(d -> d.getAddress()).
																map(dir -> dir.getCity());
		
		if(optionalCity.isPresent()) {
			System.out.println(optionalCity.get());
		}
	}
	
	//Buscar película con optional y consumidor lambda
	public static void searchMovieExtractTitleWithLambda() {
		
		Optional<Movie> optionalMovie = movieSearchBusiness.searchOptional(1);
		
		optionalMovie.ifPresent(foundTitle -> System.out.println("Movie Title " + foundTitle.getTitle()));
	}

	public static void main(String[] args) {
		
		movieSearchBusiness = new MovieSearchBusiness();
		
		//App.searchMovieControlledBySwitchDefaultNull(new MovieSearchBusiness());
		
		//App.searchMovieUsingOptional();
		
		//App.searchMovieUsingOptionalForceFail();
		
		//App.searchMovieUsingNestedOptional();
		
		//App.searchMovieWithLambdaFlatMapAndMap();
		
		App.searchMovieExtractTitleWithLambda();

	}

}
