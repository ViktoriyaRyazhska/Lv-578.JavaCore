import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


enum HTTPError{BAD_REQUEST("BAD REQUEST"),UNAUTHOURIZED("UNAUTHOURIZED")
	, PAYMENT_REQUIRED("PAYMENT REQUIRED"), FORBIDDEN("FORBIDDEN"),
	NOT_FOUND("NOT FOUND"), METHOD_NOT_ALLOWED("METHOD NOT ALLOWED"),
	NOT_ACCEPTABLE("NOT ACCEPTABLE"),PROXY_AUTHENTICATION_REQUIRED("PROXY AUTHENTICATION REQUIRED"),
	REQUEST_TIMEOUT("REQUEST TIMEOUT"), CONFLICT("CONFLICT"), GONE("GONE"),
	LENGTH_REQUIRED("LENGTH REQUIRED");
	private String name;
	HTTPError(String name){
		this.name = name;
	}
	public String get_name() {
		return this.name;
	}
	
	}

public class Numbers {
	public boolean checkIfBelong(float f[]) {
		for(int i=0; i<f.length; i++) {
			if(((f[i] >= -5) && (f[i] <= 5)) != true) {
				return false;
			}
		}
		return true;
	}
	
	public int[] getMinMax(int numbers[]) {
		int[] minMax = new int[2];
		minMax[0] = numbers[0];
		minMax[1] = numbers[0];
		for(int i = 1;i < numbers.length; i++ ) {
			if (numbers[i] > minMax[1]) {
				minMax[1] = numbers[i];
			}
			if (numbers[i] < minMax[0]) {
				minMax[0] = numbers[i];
			}
		}
		return minMax;
	}
	
	public String getHTTPError(int err) {
		switch(err) {
		case 400:
			return HTTPError.BAD_REQUEST.get_name();
		case 401:
			return HTTPError.UNAUTHOURIZED.get_name();
		case 402:
			return HTTPError.PAYMENT_REQUIRED.get_name();
		case 403:
			return HTTPError.FORBIDDEN.get_name();
		case 404:
			return HTTPError.NOT_FOUND.get_name();
		case 405:
			return HTTPError.METHOD_NOT_ALLOWED.get_name();
		case 406:
			return HTTPError.NOT_ACCEPTABLE.get_name();
		case 407:
			return HTTPError.PROXY_AUTHENTICATION_REQUIRED.get_name();
		case 408:
			return HTTPError.REQUEST_TIMEOUT.get_name();
		case 409:
			return HTTPError.CONFLICT.get_name();
		case 410:
			return HTTPError.GONE.get_name();
		case 411:
			return HTTPError.LENGTH_REQUIRED.get_name();
		default:
			return "Wrong";
		}
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Numbers num = new Numbers();
		float f[] = new float[3];
		for(int i=0; i<3; i++) {
			System.out.println("Please, enter the float:");
			f[i] = Float.parseFloat(br.readLine());
		}
		System.out.println(num.checkIfBelong(f));
		
		
		int numbers[] = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println("Please, enter the integer:");
			numbers[i] = Integer.parseInt(br.readLine());
		}
		int[] result = num.getMinMax(numbers);
		System.out.println(result[0]+ " " + result[1]);
		
		
		System.out.println("Please, enter the number of HTTP Error:");
		int error = Integer.parseInt(br.readLine());
		System.out.println(num.getHTTPError(error));

	}

}
