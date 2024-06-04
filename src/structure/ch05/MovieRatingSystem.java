package structure.ch05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MovieRatingSystem {

	/*
	 * #도전 학습 예제 개념: 영화 평점 관리 시스템 조건 설정 : 사용자가 영화에 평점을 주고, 평점에 따라 영화 추천 목록을 관리하는
	 * 시스템입니다. 사용자는 영화에 1부터 5까지의 평점을 줄 수 있으며, 평점이 높은 영화부터 낮은 순으로 정렬하여 보여줍니다.
	 */

	public static void main(String[] args) {
		// Movie Object 를 계속 추가하는 자료 구조
		ArrayList<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie("범죄도시 4", 5));
		movies.add(new Movie("기생충", 4));
		movies.add(new Movie("올드보이", 5));
		movies.add(new Movie("인생은 아름다워", 3));

		System.out.println(movies);

		for (Movie movie : movies) {
			System.out.println(movie.getTitle());
		}

		for (int i = 0; i < movies.size(); i++) {
			// 배열이 아님 get 메서드 사용
			System.out.println(movies.get(i).getTitle());
		}

		// 어떤 데이터를 정렬을 하려면 정렬 알고리즘을 구현해서 기능을 만들어 주면 된다.
		// 버블 정렬 , 퀵 정렬 , 삽입 정렬 , ...

		Collections.sort(movies, new Comparator<Movie>() {
			@Override
			public int compare(Movie m1, Movie m2) {
				return Integer.compare(m2.getRating(), m1.getRating());
			}
		});

		// 평점순으로 정렬된 영화 목록 출력
		for (Movie movie : movies) {
			System.out.println(movie);
		}

	}// end of main

}

class Movie {

	private String title;
	private int rating;

	public Movie(String title, int rating) {
		this.title = title;
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public int getRating() {
		return rating;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", rating=" + rating + "]";
	}

}
