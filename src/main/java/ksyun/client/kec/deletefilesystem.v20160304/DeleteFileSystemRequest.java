package ksyun.client.kec.deletefilesystem.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteFileSystemRequest
* @Description 请求参数
*/
@Data
public class DeleteFileSystemRequest{
    /**预删除的文件系统ID*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

}