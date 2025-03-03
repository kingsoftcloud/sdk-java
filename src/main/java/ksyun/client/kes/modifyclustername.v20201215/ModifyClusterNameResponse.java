package ksyun.client.kes.modifyclustername.v20201215;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname ModifyClusterNameResponse
 * @Description ModifyClusterName 返回体
 */
@Data
@ToString
public class ModifyClusterNameResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
