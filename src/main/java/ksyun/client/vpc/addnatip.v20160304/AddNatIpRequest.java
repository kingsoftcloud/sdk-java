package ksyun.client.vpc.addnatip.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname AddNatIpRequest
* @Description 请求参数
*/
@Data
public class AddNatIpRequest{
    /**Nat的ID*/
    @KsYunField(name="NatId")
    private String NatId;

    /**新增的NAT IP数量，每个NAT的IP数量不得超过20个，否则无法添加*/
    @KsYunField(name="AddNumber")
    private Integer AddNumber;

}
