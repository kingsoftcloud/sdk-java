package ksyun.client.kce.modifynodepool.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyNodePoolResponse
* @Description ModifyNodePool 返回体
*/
@Data
@ToString
public class ModifyNodePoolResponse extends BaseResponseModel {
    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
