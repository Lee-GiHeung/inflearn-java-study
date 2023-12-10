package class1.ex;

public class MovieReviewMain {
    public static void main(String[] args) {
        // 영화 리뷰 정보 선언
        MovieReview[] reviews = new MovieReview[2];

        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "인셉션";
        movieReview1.review = "인생은 무한 루프";
        reviews[0] = movieReview1;

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "어바웃타임";
        movieReview2.review = "인생 시간 영화!";
        reviews[1] = movieReview2;

        // 영화 리뷰 정보 출력
        MovieReview[] movieReview = {movieReview1, movieReview2};

        for (MovieReview review : movieReview) {
            System.out.println("영화제목: " + review.title + " 리뷰: " + review.review);
        }

        System.out.println("영화제목: " + movieReview1.title + ", 리뷰 : " + movieReview1.review);
        System.out.println("영화제목: " + movieReview2.title + ", 리뷰 : " + movieReview2.review);

    }

}
