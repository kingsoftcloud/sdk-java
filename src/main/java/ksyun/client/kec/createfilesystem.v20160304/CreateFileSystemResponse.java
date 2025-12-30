package ksyun.client.kec.createfilesystem.v20160304;

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

    /***/
    @JsonProperty("CreateFileSystemResponse")
    private CreateFileSystemResponseDto CreateFileSystemResponse;

    @Data
    @ToString
    public static class CreateFileSystemResponseDto {
        /***/
        @JsonProperty("RequestId")
        private String RequestId;

        /***/
        @JsonProperty("FileSystemId")
        private String FileSystemId;

    }

}
