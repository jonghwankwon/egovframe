package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component // 스프링이 관리해야하는 대상이라는것을 표시하는 어노테이션
@Data	   // lombok사용을 위한 어노테이션
public class Restaurant {
	@Setter(onMethod_ = @Autowired)
	private Chef chef;
	
}
