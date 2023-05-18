package ksyun.client.epc.describeepctrashes.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname DescribeEpcTrashesResponse
* @Description DescribeEpcTrashes 返回体
*/
@Data
@ToString
public class DescribeEpcTrashesResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
