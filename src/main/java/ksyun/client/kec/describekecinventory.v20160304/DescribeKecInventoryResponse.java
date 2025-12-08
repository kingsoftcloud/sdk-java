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
    /**1*/
    @JsonProperty("1")
    private String Field1;

}
