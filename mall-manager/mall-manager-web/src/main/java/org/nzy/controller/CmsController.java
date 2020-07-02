package org.nzy.controller;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.nzy.pojo.TbContent;
import org.nzy.pojo.TbContentCategory;
import org.nzy.service.CommonService;
import org.nzy.utils.FjnyResult;
import org.nzy.utils.HttpClientUtil;
import org.nzy.utils.LayuiReplay;
import org.nzy.utils.ProductPicResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class CmsController {
	
	/**
	 * 首页轮播图查询列表
	 */
	@Autowired
	private CommonService commonService;
	
	@RequestMapping("/test/bannerlist")
	@ResponseBody
	public LayuiReplay bannerlist(@RequestParam Integer page, @RequestParam Integer limit,String title)throws UnsupportedEncodingException {
		LayuiReplay layuiReplay =null;
		if(title==null) {
			layuiReplay = commonService.bannerlist(page, limit);
		}else{
			layuiReplay = commonService.bannerlist(page, limit,title);
		}
		return layuiReplay;
	}
	
	
	/**
	 * 修改轮播图
	 */
	@RequestMapping("/banner/updateBanner")
	@ResponseBody
	public LayuiReplay updateBanner(TbContent tbContent) {
		tbContent.setUpdated(new Date());
		HttpClientUtil.doGet("http://localhost:8891/rest/cache/sync/content/"+tbContent.getCategoryId());
		return commonService.updateBanner(tbContent);
		
	}
	/**
	 * 上传图片
	 */
	@RequestMapping("/banner/uploadBannerImg")
	@ResponseBody
	public ProductPicResultBean PicUpload(@RequestParam(value ="file") MultipartFile file){
		ProductPicResultBean productPicResult = new ProductPicResultBean();
		if (!file.isEmpty()) {
			String uploadPath = "E:\\NZshipping\\mall-manager\\mall-manager-web\\src\\main\\webapp\\UploadImg";
			//获取原先文件名
			String originalFilename = file.getOriginalFilename();
			//生成新的文件名
			String newFileName = UUID.randomUUID() + originalFilename;
			//要存放文件位置
			File dest = new File(uploadPath,newFileName);
			try {
				file.transferTo(dest);
				System.out.println("上传成功:" + dest.getAbsolutePath());
				productPicResult.setError(0);
				productPicResult.setUrl("http://localhost:7777/imgs/" + newFileName);
				productPicResult.setMessage("success");
				return productPicResult;
			} catch (IllegalStateException e) {
				productPicResult.setError(1);
				productPicResult.setMessage(e.getMessage());
				return productPicResult;
			} catch (IOException e) {
				productPicResult.setError(1);
				productPicResult.setMessage(e.getMessage());
				return productPicResult;
			}
			
		}
		productPicResult.setError(1);
		productPicResult.setMessage("照片为空");
		return productPicResult;
	}
	//修改广告位置状态
	//goodsType/changeTypeState
	@RequestMapping("goodsType/changeTypeState") 
	@ResponseBody
	public FjnyResult changeTypeState(TbContentCategory tbContentCategory) {
		return commonService.changeTypeState(tbContentCategory);
	}
	/**
	 * 删除轮播图信息
	 * URL：/banner/deleteBanner
	 */
	@RequestMapping("/banner/deleteBanner")
	@ResponseBody
	public FjnyResult deleteBanner(TbContent tbContent) {
		System.out.println("controller:删除轮播图");
		HttpClientUtil.doGet("http://localhost:8891/rest/cache/sync/content/"+tbContent.getCategoryId());
		return commonService.deleteBanner(tbContent);
	}
	
	/**
	 * 添加轮播图
	 * url： /banner/addBanner
	 */
	@RequestMapping("/banner/addBanner")
	@ResponseBody
	public FjnyResult addBanner(TbContent tbContent) {
		tbContent.setCreated(new Date());
		tbContent.setUpdated(new Date());
		HttpClientUtil.doGet("http://localhost:8891/rest/cache/sync/content/"+tbContent.getCategoryId());
		return commonService.addBanner(tbContent);
	}
	/**
	 * 内容广告分类
	 */
	@RequestMapping("test/category")
	@ResponseBody
	public LayuiReplay category(Integer page, int limit) {
		return commonService.category(page, limit);
	}
	/**
	 * 广告选择器
	 * url://list/{parentId}
	 */
	@RequestMapping("/test/content/")
	@ResponseBody()
	public FjnyResult content(TbContentCategory tbContentCategory) {
		return commonService.content(tbContentCategory);
	}
	

	
}
