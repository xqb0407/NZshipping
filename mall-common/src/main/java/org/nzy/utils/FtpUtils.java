package org.nzy.utils;

import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.omg.CORBA.portable.ApplicationException;

public class FtpUtils {

	  private static int port=21;//ftp服务器端口

	    public static FTPClient getClient(){
	        FTPClient ftpClient = new FTPClient();
	        //ftp服务器地址
	        String url="47.98.40.146";
	        //ftp服务器登陆用户名
	        String name="root";
	        //ftp服务器登陆密码
	        String password="Wfy1314520";
	        //ftp服务器目标文件位置
	        String MENU="/imgs";
	        try {
	          System.out.println("开始连接ftp服务器");
	            long start = System.currentTimeMillis();
	            ftpClient.connect(url,port);
	            ftpClient.login(name, password);
	            boolean flag = FTPReply.isPositiveCompletion(ftpClient.getReplyCode());
	            if (!flag){
	                throw  new ApplicationException("ftp服务器连接失败！", null);
	            }
	            long end = System.currentTimeMillis();
	            System.out.println("连接ftp服务器成功,耗时"+(end-start)+"毫秒");
	            ftpClient.setCharset(Charset.forName("UTF-8"));
	            ftpClient.setControlEncoding("UTF-8");
	            //ftpClient.changeToParentDirectory();//切换到根目录
	            ftpClient.changeWorkingDirectory(MENU );
	            //设置文件类型
	            ftpClient.setFileType(FTPClient.BINARY_FILE_TYPE);
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (ApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return ftpClient;
	
	    	}
	    
//	    public static void main(String[] args) {
//	    	FTPClient client = FtpUtils.getClient();
//	    	
//		}
}
