package ksyun.client.epc.deletesovpc.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteSoVpcRequest
* @Description 请求参数
*/
@Data
public class DeleteSoVpcRequest{
    /**待删除VPC的ID。*/
    @KsYunField(name="VpcId")
    private String VpcId;

}