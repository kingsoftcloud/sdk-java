package ksyun.client.kpfs.deletefilesystem.v20240930;

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
    /**文件系统实例ID*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

}
