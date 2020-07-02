package org.nzy.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import org.apache.commons.net.ftp.FTPClient;
import org.nzy.utils.FtpUtils;
import org.nzy.utils.ProductPicResultBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
@Controller
public class FtpUpload {
		private String dateFormat="yyyyMMdd";
		//http前缀
		private String prefix="http://";
		//ftp服务器地址
		String url= "47.98.40.146:8080";
		//ftp服务器目标文件位置
		String menu="/imgs";
		@RequestMapping("/banner/uploadBannerImg1")
		@ResponseBody
	 public ProductPicResultBean catFtpUpload(@RequestParam(value ="file") MultipartFile file) {
			ProductPicResultBean productPicResult = new ProductPicResultBean();
		     FTPClient client = FtpUtils.getClient();
	    	//获取原先文件名
			String originalFilename = file.getOriginalFilename();
			//生成新的文件名
			String newFileName = UUID.randomUUID() + originalFilename;
	        String finalUrl=prefix+url+menu+"/"+newFileName;
	        try {
	            long start = System.currentTimeMillis();
	            System.out.println(String.format("开始上传文件：%s",originalFilename));
	            InputStream inputStream = file.getInputStream();
	            boolean flag = client.storeFile(newFileName, inputStream);
	            if (flag){
	                long end = System.currentTimeMillis();
	                System.out.println(String.format("文件：%s上传成功,耗时：%d毫秒",originalFilename,(end-start)));
	                productPicResult.setError(0);
					productPicResult.setUrl(finalUrl);
					productPicResult.setMessage("success");
					
	            }
	            inputStream.close();
	        
	        } catch (IOException e) {
	        	productPicResult.setError(1);
				productPicResult.setMessage(e.getMessage());
				return productPicResult;
	        }finally {
	            if (client.isConnected()){
	                try {
	                    client.disconnect();
	                } catch (IOException e) {
	                	
	                	productPicResult.setError(1);
	    				productPicResult.setMessage(e.getMessage());
	    				System.out.println(String.format("ftp关闭连接失败：%s",e));
	    				return productPicResult;
	                	
	                }
	            }
	        }
	        return productPicResult;
	    }
}
