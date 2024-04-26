package useful;

public class StringTextBlock {
	// """ 찍고 한줄 내리기
	public static void main(String[] args) {
		String strBlock = """
				This
				is
				a
				Text
				block.""";

		String jsonText = """
				{
				  "userId": 1,
				  "id": 1,
				  "title": "delectus aut autem",
				  "completed": false
				},
				""";

		String htmlText = """
				<!doctype html>
				<html class="notion-html">
				<head lang="en">
				<meta charset="utf-8">
				<meta name="viewport" content="width=device-width,height=device-height,initial-scale=1,maximum-scale=1,user-scalable=no,viewport-fit=cover">
				""";

		// html , json 문자열을 만드는데 유용하게 사용할 수 있음

	}

}
