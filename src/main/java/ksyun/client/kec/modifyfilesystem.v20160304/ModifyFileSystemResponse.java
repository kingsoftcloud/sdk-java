package ksyun.client.kec.modifyfilesystem.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyFileSystemResponse
* @Description ModifyFileSystem 返回体
*/
@Data
@ToString
public class ModifyFileSystemResponse extends BaseResponseModel {

    /***/
    @JsonProperty("ModifyFileSystemResponse")
    private ModifyFileSystemResponseDto ModifyFileSystemResponse;

    @Data
    @ToString
    public static class ModifyFileSystemResponseDto {
        /***/
        @JsonProperty("RequestId")
        private String RequestId;

        /***/
        @JsonProperty("Return")
        private String ReturnField;

    }

}
