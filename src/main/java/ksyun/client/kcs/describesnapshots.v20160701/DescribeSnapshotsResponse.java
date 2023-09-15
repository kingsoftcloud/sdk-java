package ksyun.client.kcs.describesnapshots.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname DescribeSnapshotsResponse
* @Description DescribeSnapshots 返回体
*/
@Data
@ToString
public class DescribeSnapshotsResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
