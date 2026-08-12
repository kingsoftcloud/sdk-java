package ksyun.client.kpfs.deletefilesystem.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteFileSystemResponse
* @Description DeleteFileSystem 返回体
*/
@Data
@ToString
public class DeleteFileSystemResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
