package ksyun.client.kec.modifyfilesystem.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyFileSystemRequest
* @Description 请求参数
*/
@Data
public class ModifyFileSystemRequest{
    /**文件系统ID*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**文件系统名称，有效值：长度2-64字符，支持中文，字母，数字，以及-_；*/
    @KsYunField(name="FileSystemName")
    private String FileSystemName;

}