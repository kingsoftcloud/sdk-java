package ksyun.client.ter.describetemplateversions.v20240415;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname DescribeTemplateVersionsResponse
* @Description DescribeTemplateVersions 返回体
*/
@Data
@ToString
public class DescribeTemplateVersionsResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
