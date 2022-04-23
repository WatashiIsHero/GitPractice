package jp.com.sample;

public class EnumSample1 {

	public enum HttpStatus {

		OK(200),
		NOT_FOUND(404),
		SERVER_ERROR(500);

		private final int httpStatus;

		private HttpStatus(int httpStatus) {

			this.httpStatus = httpStatus;
		}

		public int getStatus() {
			return httpStatus;
		}
	}

	public HttpStatus judgeStatus(HttpStatus status) {

		return null;
	}

	public static void main(String[] args) {

		HttpStatus hs = HttpStatus.OK;
		System.out.println("httpStatus：" + " [" + hs + "=" + hs.getStatus() + "]");
	}
}
