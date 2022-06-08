package jp.fw.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import jp.fw.bean.HelloBean;

@Mapper
public interface HelloMapper {

    List<HelloBean> selectEmpAll();
}