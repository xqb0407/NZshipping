package org.nzy.rest.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.nzy.mapper.TbItemCatMapper;
import org.nzy.pojo.FjnyResult;
import org.nzy.pojo.TbItemCat;
import org.nzy.pojo.TbItemCatExample;
import org.nzy.pojo.TbItemCatExample.Criteria;
import org.nzy.rest.service.TbItemCatService;
import org.springframework.stereotype.Service;
@Service
public class TbItemCatServiceImpl implements TbItemCatService {

	@Resource
	private	TbItemCatMapper tbItemCatMapper;
	
	@Override
	public FjnyResult getTbItemCat(Long parentId) {
		TbItemCatExample example = new TbItemCatExample();
		Criteria criteria =  example.createCriteria();
		criteria.andParentIdEqualTo(parentId);
		List<TbItemCat> list = tbItemCatMapper.selectByExample(example );
		return FjnyResult.ok(list);
	}

}
