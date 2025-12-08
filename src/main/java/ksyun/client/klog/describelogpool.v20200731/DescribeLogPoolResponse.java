package ksyun.client.klog.describelogpool.v20200731;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeLogPoolResponse
* @Description DescribeLogPool 返回体
*/
@Data
@ToString
public class DescribeLogPoolResponse extends BaseResponseModel {
    /**Res*/
    @JsonProperty("Res")
    private String Res;

}
