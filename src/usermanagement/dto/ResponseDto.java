package usermanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseDto<T> {
	//서버에서 클라이언트에게 응답할때 사용
	private String code;
	private T body;

}
