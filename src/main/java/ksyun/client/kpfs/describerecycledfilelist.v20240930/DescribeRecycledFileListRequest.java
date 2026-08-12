package ksyun.client.kpfs.describerecycledfilelist.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeRecycledFileListRequest
* @Description 请求参数
*/
@Data
public class DescribeRecycledFileListRequest{
    /**文件系统ID*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**• 容量型/标准型：支持按路径关键字进行搜索
• 性能型：支持根据文件所在回收站目录搜索*/
    @KsYunField(name="RecycledPath")
    private String RecycledPath;

    /**分页大小，默认1*/
    @KsYunField(name="PageNum")
    private Integer PageNum;

    /**分页起始位置，默认1000。取值范围：1-1000*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
