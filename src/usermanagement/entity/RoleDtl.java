package usermanagement.entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RoleDtl {
	private int roleDtlId;
	private int roldeId;
	private int userId;
	
	private RoleMst roleMst;
}
