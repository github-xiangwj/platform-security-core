package com.platform.core.export;

/**
 * @author xiangwj
 * 导出接口
 */
public interface ExportHandler {
	
	Object beforeExport();
	
	void export();
	
}
