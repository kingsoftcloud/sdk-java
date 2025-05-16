package ksyun.client.kce2.deleteaddoninstance.v20230101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname DeleteAddonInstanceResponse
 * @Description DeleteAddonInstance 返回体
 */
@Data
@ToString
public class DeleteAddonInstanceResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
