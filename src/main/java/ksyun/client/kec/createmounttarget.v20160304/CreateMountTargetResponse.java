package ksyun.client.kec.createmounttarget.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateMountTargetResponse
* @Description CreateMountTarget 返回体
*/
@Data
@ToString
public class CreateMountTargetResponse extends BaseResponseModel {
    /***/
    @JsonProperty("CreateMountTargetResponse")
    private CreateMountTargetResponseDto CreateMountTargetResponse;

    @Data
    @ToString
    public static class CreateMountTargetResponseDto {
        /***/
        @JsonProperty("RequestId")
        private String RequestId;

        /***/
        @JsonProperty("MountTargetId")
        private String MountTargetId;

        /***/
        @JsonProperty("IpAddress")
        private String IpAddress;

    }

}
