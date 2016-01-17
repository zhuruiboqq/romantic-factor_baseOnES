package com.sishuok.es.common.web.upload;

import java.io.File;

import org.springframework.util.StringUtils;

public class FileUtil {
	/**
	 * 删除文件，可以是单个文件或文件夹
	 * @param fileName 待删除的文件名
	 * @return 文件删除成功返回true,否则返回false
	 */
	public static boolean delete(String fileName) {
		File file = new File(fileName);
		if (!file.exists()) {
			System.out.println("删除文件失败：" + fileName + "文件不存在");
			return false;
		} else {
			if (file.isFile()) {

				return deleteFile(fileName);
			} else {
				return deleteDirectory(fileName);
			}
		}
	}

	/**
	 * 删除单个文件
	 * @param fileName 被删除文件的文件名
	 * @return 单个文件删除成功返回true,否则返回false
	 */
	public static boolean deleteFile(String fileName) {
		File file = new File(fileName);
		if (file.isFile() && file.exists()) {
			file.delete();
			System.out.println("删除单个文件" + fileName + "成功！");
			return true;
		} else {
			System.out.println("删除单个文件" + fileName + "失败！");
			return false;
		}
	}

	/**
	 * 删除目录（文件夹）以及目录下的文件
	 * @param dir 被删除目录的文件路径
	 * @return 目录删除成功返回true,否则返回false
	 */
	public static boolean deleteDirectory(String dir) {
		//如果dir不以文件分隔符结尾，自动添加文件分隔符   
		if (!dir.endsWith(File.separator)) {
			dir = dir + File.separator;
		}
		File dirFile = new File(dir);
		//如果dir对应的文件不存在，或者不是一个目录，则退出   
		if (!dirFile.exists() || !dirFile.isDirectory()) {
			System.out.println("删除目录失败" + dir + "目录不存在！");
			return false;
		}
		boolean flag = true;
		//删除文件夹下的所有文件(包括子目录)   
		File[] files = dirFile.listFiles();
		for (int i = 0; i < files.length; i++) {
			//删除子文件   
			if (files[i].isFile()) {
				flag = deleteFile(files[i].getAbsolutePath());
				if (!flag) {
					break;
				}
			}
			//删除子目录   
			else {
				flag = deleteDirectory(files[i].getAbsolutePath());
				if (!flag) {
					break;
				}
			}
		}

		if (!flag) {
			System.out.println("删除目录失败");
			return false;
		}

		//删除当前目录   
		if (dirFile.delete()) {
			System.out.println("删除目录" + dir + "成功！");
			return true;
		} else {
			System.out.println("删除目录" + dir + "失败！");
			return false;
		}
	}

	public static String getExtendName(String fileName) {
		String result = fileName;
		if (StringUtils.isEmpty(result)) {
			return null;
		}
		int index = result.lastIndexOf(".");
		if (index == -1) {
			return "";
		}
		return result.substring(index + 1);
	}

	/**
	 * 根据实际的文件大小，转成容易识别的字符
	 * @param fileLength
	 * @return
	 */
	public static String getFileLength(long fileLength) {
		String[] byteUnit = { "B", "KB", "M", "G", "T" };
		int index = 0;
		double tmp = ((double) fileLength) / 1024;
		while (tmp > 1 && index < 4) {
			tmp = tmp / 1024;
			index++;
		}
		return String.format("%1$.2f %2$s", tmp * 1024, byteUnit[index]);
	}

	public static String getFileName(String uploadPath) {
		File uploadFile = new File(uploadPath);
		return uploadFile.getName();
	}

	public static void main(String[] args) {
		//String fileName = "g:/temp/xwz.txt";   
		//DeleteFileUtil.deleteFile(fileName);   
		//		String fileDir = "G:/temp/temp0/temp1";
		//DeleteFileUtil.deleteDirectory(fileDir);   
		//		delete(fileDir);
		System.out.println(String.format("%2$08d", -3123, -5566));
		System.out.println(String.format("%1$9d", -31));
		System.out.println(String.format("%1$-9d", -31));
		System.out.println(String.format("%1$(9d", -31));
		System.out.println(String.format("%1$#9x", 5689));

		//小数点后面两位  
		System.out.println(String.format("%1$.2f", 5689.0)); //必须是同类型的才能进行转换  

		System.out.println(getFileLength(4467982336L));
		System.out.println(getFileLength(12132334));
		System.out.println(getFileLength(121323));
		System.out.println(getFileLength(1213));
		System.out.println(getFileLength(121));
		System.out.println(getFileLength(121111111111222222L));
		System.out.println(getExtendName(null));
		System.out.println(getExtendName("sdd.jsp.jps.jjsjs"));
		System.out.println(getExtendName("sasfpoi."));
		System.out.println(getExtendName("sasfpoi.jps"));
		System.out.println(getExtendName("sasfpoi"));
	}
}