package ksyun.client.kec.describekecinventory.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeKecInventoryResponse
* @Description DescribeKecInventory 返回体
*/
@Data
@ToString
public class DescribeKecInventoryResponse extends BaseResponseModel {

    /**请求ID。*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**当前可用区目标规格可开机数量。*/
    @JsonProperty("InstanceCount")
    private Integer InstanceCount;

}
