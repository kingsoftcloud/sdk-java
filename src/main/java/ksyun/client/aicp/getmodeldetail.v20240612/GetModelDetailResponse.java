package ksyun.client.aicp.getmodeldetail.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetModelDetailResponse
* @Description GetModelDetail 返回体
*/
@Data
@ToString
public class GetModelDetailResponse extends BaseResponseModel {

    /***/
    @JsonProperty("ModelApiModelDataWebResp")
    private ModelApiModelDataWebRespDto ModelApiModelDataWebResp;

    @Data
    @ToString
    public static class ModelApiModelDataWebRespDto {
    }

}
