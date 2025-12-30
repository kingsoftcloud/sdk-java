package ksyun.client.vpc.describedirectconnectinterfacesbgpstatus.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDirectConnectInterfacesBgpStatusResponse
* @Description DescribeDirectConnectInterfacesBgpStatus 返回体
*/
@Data
@ToString
public class DescribeDirectConnectInterfacesBgpStatusResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
