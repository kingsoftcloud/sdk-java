package ksyun.client.cloud_advisor.listinspectionitem.v20250610;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname ListInspectionItemResponse
* @Description ListInspectionItem 返回体
*/
@Data
@ToString
public class ListInspectionItemResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
