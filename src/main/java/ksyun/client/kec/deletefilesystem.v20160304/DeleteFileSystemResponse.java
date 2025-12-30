package ksyun.client.kec.deletefilesystem.v20160304;

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
    @JsonProperty("DeleteFileSystemResponse")
    private DeleteFileSystemResponseDto DeleteFileSystemResponse;

    @Data
    @ToString
    public static class DeleteFileSystemResponseDto {
        /***/
        @JsonProperty("RequestId")
        private String RequestId;

        /***/
        @JsonProperty("Return")
        private String ReturnField;

    }

}
