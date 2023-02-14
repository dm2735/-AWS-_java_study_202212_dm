package usermanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@Data
public class RequestDto<T> {
	//클라이언트가 서버에게 요청할때 사용
	
	private String resource;
	private T body;

}
