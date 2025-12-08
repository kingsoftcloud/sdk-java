package ksyun.client.epc.deletesosubnet.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteSoSubnetRequest
* @Description 请求参数
*/
@Data
public class DeleteSoSubnetRequest{
    /**待删除子网的ID。*/
    @KsYunField(name="SubnetId")
    private String SubnetId;

    /**星海专区*/
    @KsYunField(name="SoZoneId")
    private String SoZoneId;

}
