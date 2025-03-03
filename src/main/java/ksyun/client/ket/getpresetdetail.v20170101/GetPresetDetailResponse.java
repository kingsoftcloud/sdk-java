package ksyun.client.ket.getpresetdetail.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname GetPresetDetailResponse
 * @Description GetPresetDetail 返回体
 */
@Data
@ToString
public class GetPresetDetailResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
