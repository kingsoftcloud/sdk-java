package ksyun.client.dts.describesourceuserconfig.v20180108;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeSourceUserConfigResponse
 * @Description DescribeSourceUserConfig 返回体
 */
@Data
@ToString
public class DescribeSourceUserConfigResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
