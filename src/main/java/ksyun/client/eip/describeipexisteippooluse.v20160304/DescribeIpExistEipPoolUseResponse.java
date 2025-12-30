package ksyun.client.eip.describeipexisteippooluse.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeIpExistEipPoolUseResponse
* @Description DescribeIpExistEipPoolUse 返回体
*/
@Data
@ToString
public class DescribeIpExistEipPoolUseResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
