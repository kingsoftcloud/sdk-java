package ksyun.client.postgresql.updatedbinstanceorder.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateDBInstanceOrderResponse
* @Description UpdateDBInstanceOrder 返回体
*/
@Data
@ToString
public class UpdateDBInstanceOrderResponse extends BaseResponseModel {

    /***/
    @JsonProperty("status")
    private String Status;

    /**订单Id*/
    @JsonProperty("orderId")
    private String OrderId;

    /***/
    @JsonProperty("totalMoney")
    private Integer TotalMoney;

    /***/
    @JsonProperty("realMoney")
    private Integer RealMoney;

    /***/
    @JsonProperty("lastMoney")
    private Integer LastMoney;

    /**子订单Id*/
    @JsonProperty("subOrderIds")
    private List<String> SubOrderIds;

}
