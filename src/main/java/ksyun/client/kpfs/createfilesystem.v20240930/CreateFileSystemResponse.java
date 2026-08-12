package ksyun.client.kpfs.createfilesystem.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateFileSystemResponse
* @Description CreateFileSystem 返回体
*/
@Data
@ToString
public class CreateFileSystemResponse extends BaseResponseModel {

    /**文件系统的实例ID。*/
    @JsonProperty("FileSystemId")
    private String FileSystemId;

    /**唯一请求ID，每次请求都会返回。*/
    @JsonProperty("RequestId")
    private String RequestId;

}
