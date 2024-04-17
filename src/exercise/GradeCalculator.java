package exercise;

import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {

		// 응용 학습
		// 국영수과 4과목의 점수를 입력받아 평균값을 계산하고
		// 학점과 평균값, 메세지를 출력하시오.
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		double kor;
		double math;
		double eng;
		double sci;
		double sum = 0;
		System.out.println(" 국어 성적을 입력하세요 (0-100): ");
		kor = scanner.nextDouble();
		sum += kor;
		count++;
		System.out.println(" 수학 성적을 입력하세요 (0-100): ");
		math = scanner.nextDouble();
		sum += math;
		count++;
		System.out.println(" 영어 성적을 입력하세요 (0-100): ");
		eng = scanner.nextDouble();
		sum += eng;
		count++;
		System.out.println(" 과학 성적을 입력하세요 (0-100): ");
		sci = scanner.nextDouble();
		sum += sci;
		count++;
		double score = (sum / count);

		char grade = 'X'; // 초기값을 'X'로 설정해 잘못된 입력을 쉽게 확인
		String message = ""; // 추가적인 피드백 메시지

		// .. 코드를 작성해주세요
		// 힌트 - 비교 연산자와 논리연사자를 활용
		// ...

		if (score <= 100 && score >= 90) {
			grade = 'A';
			message = score + "점 우수한 성적이네요! 계속 좋은 성적 유지하길 바랍니다.";
			System.out.println(grade + " 학점");
			System.out.println(message);
		} else if (score >= 80 && score < 90) {
			grade = 'B';
			message = score + "점 좋은 성적입니다. 조금만 더 노력하면 A도 가능해요!";
			System.out.println(grade + " 학점");
			System.out.println(message);
		} else if (score >= 70 && score < 80) {
			grade = 'C';
			message = score + "점 괜찮은 성적이지만, 더 높은 등급을 위해 노력해봅시다.";
			System.out.println(grade + " 학점");
			System.out.println(message);
		} else if (score >= 60 && score < 70) {
			grade = 'D';
			message = score + "점 학습에 더 집중할 필요가 있어요. 도움이 필요하면 말해주세요.";
			System.out.println(grade + " 학점");
			System.out.println(message);
		} else if (score >= 0 && score < 60) {
			grade = 'F';
			message = score + "점 불합격입니다. 부족한 부분을 파악하고, 추가 학습이 필요해요.";
			System.out.println(grade + " 학점");
			System.out.println(message);
		} else {
			System.out.println("잘못된 입력입니다. 성적은 0에서 100 사이의 숫자로 입력해주세요.");
		}

		scanner.close(); // 자원 닫기

	}

}
