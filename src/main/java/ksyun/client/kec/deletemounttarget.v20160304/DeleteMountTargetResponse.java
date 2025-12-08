package ksyun.client.kec.deletemounttarget.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteMountTargetResponse
* @Description DeleteMountTarget 返回体
*/
@Data
@ToString
public class DeleteMountTargetResponse extends BaseResponseModel {
    /***/
    @JsonProperty("DeleteMountTargetResponse")
    private DeleteMountTargetResponseDto DeleteMountTargetResponse;

    @Data
    @ToString
    public static class DeleteMountTargetResponseDto {
        /***/
        @JsonProperty("RequestId")
        private String RequestId;

        /***/
        @JsonProperty("Return")
        private String ReturnField;

    }

}
