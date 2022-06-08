package jp.fw.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jp.fw.bean.HelloBean;
import jp.fw.mapper.HelloMapper;

@Component
public class HelloMapperUtils {
	@Autowired
	private HelloMapper helloMapper;

	public List<HelloBean> selectName() {
		List<HelloBean> list = helloMapper.selectEmpAll();
		for (HelloBean bean : list) {
			System.out.println(bean.getId() + " " + bean.getName());
		}
		return list;
	}

}
