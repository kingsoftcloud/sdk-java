package ksyun.client.kpfs.describefilesystemfilelist.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeFileSystemFileListRequest
* @Description 请求参数
*/
@Data
public class DescribeFileSystemFileListRequest{
    /**文件系统的实例ID。*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**需要以/开头，且/需要做encode。默认搜索根目录。*/
    @KsYunField(name="Dir")
    private String Dir;

    /**当前目录下需要搜索的文件前缀。*/
    @KsYunField(name="FileName")
    private String FileName;

    /**页码。默认为1。*/
    @KsYunField(name="PageNum")
    private Long PageNum;

    /**分页。默认为10。*/
    @KsYunField(name="PageSize")
    private Long PageSize;

}
