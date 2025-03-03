package ksyun.client.ter.describetemplates.v20240415;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DescribeTemplatesResponse
 * @Description DescribeTemplates 返回体
 */
@Data
@ToString
public class DescribeTemplatesResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
