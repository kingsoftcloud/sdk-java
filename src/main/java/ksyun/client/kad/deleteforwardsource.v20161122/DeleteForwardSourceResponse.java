package ksyun.client.kad.deleteforwardsource.v20161122;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteForwardSourceResponse
* @Description DeleteForwardSource 返回体
*/
@Data
@ToString
public class DeleteForwardSourceResponse extends BaseResponseModel {
    /***/
    @JsonProperty("DeleteForwardSourceResponse")
    private DeleteForwardSourceResponseDto DeleteForwardSourceResponse;

    @Data
    @ToString
    public static class DeleteForwardSourceResponseDto {
        /***/
        @JsonProperty("RequestId")
        private String RequestId;

        /***/
        @JsonProperty("Return")
        private String ReturnField;

    }

}
